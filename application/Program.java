package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AgeAndGender;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		AgeAndGender AgeAndGender = new AgeAndGender(); 

		System.out.print("Informe a idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Informe o gênero: ");
		String genero = sc.next().toLowerCase();
		
		System.out.println();
		AgeAndGender.testAge(idade);
		AgeAndGender.testGender(genero);

		sc.close();
	}
}
