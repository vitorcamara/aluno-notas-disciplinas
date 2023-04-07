package com.vitorcamara.projetos;

import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Entre com o nome do aluno:");
		aluno.nome = scan.next();

		System.out.println("Entre com o nome do curso:");
		aluno.nomeCurso = scan.next();

		System.out.println("Entre com a matricula:");
		aluno.matricula = scan.next();

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina " + (i + 1) + ":");
			aluno.nomeDisciplinas[i] = scan.next(); // coletando os 3 nomes das disciplinas
		}

		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Entre com a nota da disciplina " + aluno.nomeDisciplinas[i]);

			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota " + (j + 1) + ":");
				aluno.notasDisciplinas[i][j] = scan.nextDouble(); // coletando notas das disciplinas
			}
		}

		aluno.mostrarInfo(); // chamando método

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			if (aluno.verificarAprovacao(i)) { // verificando se a aprovação é true ou false
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado!"); // se a média for
																									// maior ou igual a
																									// 7, é true, então,
																									// aluno aprovado
			} else {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi reprovado!"); // se a média for
																									// menor que 7, é
																									// false, então,
																									// aluno reprovado
			}
		}

	}

}
