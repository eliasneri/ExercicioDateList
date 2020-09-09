package application;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Prints;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Exercícios Datas e Listas");
		
		Scanner sc = new Scanner(System.in);
		List<Prints> list = new ArrayList<>();
		
		

		Prints p;
		
		int op =0;
		
		System.out.println();		
		
		while (op != 3) {
			System.out.printf("Options: %n" 
							+ "1 - Insert impressions %n"
							+ "2 - See impressions %n"
							+ "3 - Exit %n%n");
			System.out.print("Press option: ");
			
			op = sc.nextInt();
			
			int id = list.size(); // vai ler o numero total de registros
			id++;
			
			if (op == 1) {
				
				sc.nextLine();
				System.out.print("Whats media: ? ");
				String media = sc.nextLine();
				
				//Carrega novo Registro com a data e hora atual, e faz a formatação
				Date date = new Date(System.currentTimeMillis());
																
				// implementa objeto P na classe Prints
				p = new Prints (media, date, id);
				
				// Adiciona Objeto em 1 lista
				list.add(p);
				System.out.println();
				
			} else if (op ==2){
				System.out.println();
				System.out.println("Impressions!!");
				System.out.println("------------------------------");
					for (Prints e: list) {
						System.out.println(e);
					}
				System.out.println("------------------------------");
				System.out.println();
				
			}
		} 
		
		System.out.println();
		System.out.println("Bye!!");
		
		sc.close();

	}

}
