/******************************************************************************

Sistema de Cadastro de Alunos e disciplinas
Autor: Diego Henrique
Data: 08/06/2021
Matéria: Estrutura de Dados.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int opc, qtdAlunos;
		String nome, disciplina;
		Sala novaSala = new Sala();
		Aluno novoAluno = new Aluno();
		Scanner teclado;
		
		teclado = new Scanner(System.in);
		
		do {
		    System.out.println("\n---------------");
		    System.out.println("       MENU");
		    System.out.println("Escolha uma opção");
		    System.out.println("1 - Inserir Aluno");
		    System.out.println("2 - Listar alunos e Disciplina");
		    System.out.println("0 - Sair");
		    
		    opc = teclado.nextInt();
		    teclado.nextLine();
		    
		    switch(opc) {
		        
		        case 1:
		            System.out.println("\nNome: ");
		            nome = teclado.nextLine();
		            System.out.println("\nDisciplina: ");
		            disciplina = teclado.nextLine();
		            
		            novoAluno = new Aluno(nome,disciplina);
		            
		            novaSala.insereAluno(novoAluno);
		            
		            break;
		        case 2:
		            novaSala.listarAlunos();
		            break;
		        case 0:
		            System.out.println("\nSaindo...");
		            break;
		        default:System.out.print("\nOpção inválida");
		        
		            
		    }
		}while (opc != 0);
	}
}