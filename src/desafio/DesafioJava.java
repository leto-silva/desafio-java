package desafio;

import java.util.Scanner;

public class DesafioJava {
	
	public static void main(String[] args) {
		//
		int parametroUm, parametroDois;
		
		Scanner scanner = new Scanner(System.in);
		
		parametroUm = scanner.nextInt();
		parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if (parametroUm > parametroDois) {			
			throw new ParametrosInvalidosException("Parâmetros incorretos, Verifique!");
		}
		
		int intervalo = parametroDois - parametroUm;
		
		for (int i = 0; i <= intervalo; i++) {
			System.out.println(i);
		}
		
		
	}



}
