package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante nota = new Estudante();
		
		System.out.println("Insira o nome do aluno: ");
		nota.nome = sc.nextLine();
		System.out.println("Insira as notas do aluno: ");
		nota.nota1 = sc.nextDouble();
		nota.nota2 = sc.nextDouble();
		nota.nota3 = sc.nextDouble();
		
		System.out.println(nota);
		
		if (nota.notaFinal() >= 60) {
			System.out.println("Aprovado!");
		}
		else {
			System.out.println("Reprovado! Faltam " + nota.pontosFaltando() + " pontos");
		}
		
		sc.close();

	}

}
