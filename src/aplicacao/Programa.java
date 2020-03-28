package aplicacao;

import java.util.Scanner;
import enums.SituacaoAluno;
import entidades.Aluno;
import entidades.Professor;

public class Programa {

	public static void main(String[] args) {
		String nome;
		String cpf;
		String endereco;
		String email;
		String telefone;
		String retornoResultCpf = "";
		int contProfessor = 0, contAluno = 0;
		int resposta, resposta2;
		int controle1 = 0;
		boolean controle2 = false;
		
		Scanner leitura = new Scanner (System.in);
		
		/*
		 * CRIEI VETORES SIMPLESMENTE PARA PODER CADASTRAR VARIAS ENTIDADES E ENTÃO MOSTRAR TODAS AS 
		 * ENTIDADES NO FORMATO DE LISTA
		 */
		
		/* NÃO SEI SE OS MÉTODOS ESTÁTICOS QUE EU CRIEI DEVERIAM REALMENTE ESTAR NO ARQUIVO QUE CONTÉM O MAIN
		 * OU SE ELES DEVERIAM ESTAR NA CLASSES CLASSES PESSOA, PROFESSOR E ALUNO DE ACORDO COM O QUE ELES FAZEM,
		 * COLOQUEI AQUI POIS NÃO SABIA AO CERTO 
		 */
		
		Professor[] professor = new Professor[5];
		Aluno[] aluno = new Aluno[5];
		
		do {
			System.out.println("o que você deseja fazer?");
			System.out.println("1 - cadastrar entidade;");
			System.out.println("2 - ver lista de entidades cadastradas;");
			System.out.println("3 - encerrar o programa;");
			System.out.print("insira a sua escolha: "); 
			
			do {
				controle1 = leitura.nextInt();
				if (controle1 < 1 || controle1 > 3) {
					System.out.print("opção inválida, insira novamente: ");
				}
			} while (controle1 < 1 || controle1 > 3);
				
			switch (controle1) {
			case 1:			
				do {
					System.out.println("\nselecione quais das entidades deseja cadastrar:");
					System.out.println("1 - professor;");
					System.out.println("2 - aluno;");
					System.out.print("insira a sua resposta: "); resposta = leitura.nextInt();
					
					System.out.print("\ninsira as seguintes informações:\n");
					
					System.out.print("nome: "); 
					nome = leitura.nextLine();
					leitura.nextLine();
					nome = nome.trim();
					
					System.out.print("cpf: "); 
					
					do {
						cpf = leitura.nextLine();
						cpf = cpf.trim();
						
						if (cpf.length() < 11) {
							System.out.print("cpf precisa ter no mínimo 11 caracteres, insira novamente: ");
							retornoResultCpf = "invalido";
							continue;
						}
						
						cpf = validaStringCpf(cpf);
						retornoResultCpf = validaCpf(cpf);
							
						if (retornoResultCpf == "invalido") {
							System.out.printf("o cpf %s é inválido, insira novamente: ", cpf);
							
						} else {
							if(retornoResultCpf == "valido") {
								System.out.printf("o cpf %s é válido;\n", cpf);
							}
						}
					} while (retornoResultCpf == "invalido");
					
					System.out.print("endereço: "); 
					endereco = leitura.nextLine();
					
					System.out.print("email: "); 
					email = leitura.nextLine();
						
					System.out.println("telefone: "); 
					telefone = leitura.nextLine();
					
					switch(resposta) {
					case 1:
						// 4 POIS A CONTAGEM COMEÇA EM ZERO 0, 1, 2, 3, 4
						// DESSA FORMA NÃO IRÁ ULTRAPASSAR O LIMITE DO VETOR
						if (contProfessor < 4) { 
							double salario;
							System.out.print("salario: "); 
							
							do {
								salario = leitura.nextDouble();
								System.out.print("salário inválido, insira novamente: ");
							} while (salario <= 0);
							
							professor[contProfessor] = new Professor(nome, cpf, endereco, email, telefone, salario);
							System.out.println("\nentidade cadastrada com sucesso:");
							System.out.println(professor[contProfessor]);
							//POR ALGUM MOTIVO NÃO MOSTRA O NOME DA PESSOA CADASTRADA QUANDO CHAMO 
							// O MÉTODO TO STRING
							contProfessor++;
						} else {
							System.out.println("\nnúmero máximo de professores já cadastrados");
						}
						break;
					case 2:
						if (contAluno < 4) { 
							double media;
							SituacaoAluno situacao = null;
							int situacaoInt;
							
							System.out.print("media: "); 
							
							do {
								media = leitura.nextDouble();
								
								if (media < 0 && media > 10) {
									System.out.print("média inválida, insira novamente: ");
								}
							} while (media < 0 && media > 10);
							
							System.out.println("\ninforme a situacao do aluno:"); 
							System.out.println("1 - ativo;");
							System.out.println("2 - trancamento;");
							System.out.println("3 - desistente;");
							System.out.println("4 - concluido;");
							System.out.print("insira a sua resposta: "); 
							
							do {
								situacaoInt = leitura.nextInt();
								if (situacaoInt < 1 || situacaoInt > 4) {
									System.out.print("opção inválida, insira novamente: ");
								}
							} while (situacaoInt < 1 || situacaoInt > 4);
								
							switch(situacaoInt) {
							case 1: situacao = SituacaoAluno.ATIVO; break;
							case 2: situacao = SituacaoAluno.TRANCAMENTO; break;
							case 3: situacao = SituacaoAluno.DESISTENTE; break;
							case 4: situacao = SituacaoAluno.CONCLUIDO; break;
							}
							
							aluno[contAluno] = new Aluno(nome, cpf, endereco, email, telefone, media, situacao);
							System.out.println("\nentidade cadastrada com sucesso;");
							System.out.println(aluno[contAluno]);
							// POR ALGUM MOTIVO NÃO MOSTRA O NOME DA PESSSOA CADASTRADA QUANDO 
							// CHAMO O MÉTODO TO STRING
							
							contAluno++;
						} else {
							System.out.println("\nnúmero máximo de alunos já cadastrado;");
						}
						break;
					default: System.out.println("opção inválida;"); controle2 = false; break;
					} // FIM DO SWITCH RESPOSTA PARA CADASTRAR PROFESSORES E ALUNOS
					
					System.out.println("\ndeseja cadastrar outra entidade?"); 
					System.out.println("1 - sim;");
					System.out.println("2 - não;");
					System.out.print("sua resposta: "); 
					
					do {
						resposta2 = leitura.nextInt();
						if (resposta2 != 1 && resposta2 != 2) {
							System.out.print("opção inválida, insira novamente: ");
						}
					} while (resposta2 != 1 && resposta2 != 2);
					
					switch(resposta2) {
					case 1: controle2 = true; break;
					case 2: controle2 = false; break;
					}
					
				} while (controle2 == true); //FIM DO LAÇO DO-WHILE PARA CADASTRAR AS ENTIDADES
				break;
			case 2:
				int retornoProfessor, retornoAluno;
				retornoProfessor = verificaVetorProfessor(professor);
				retornoAluno = verificaVetorAluno(aluno);
				
				if (retornoProfessor == professor.length && retornoAluno == aluno.length) {
					System.out.println("\nnão há professores ou alunos cadastrados;\n");
				
				} else if (retornoProfessor != professor.length && retornoAluno == aluno.length) {
					System.out.println("\nlista de professores cadastrados:");
					mostraProfessor(professor);
					System.out.println("\nnenhum aluno cadastrado;");
				
				} else if (retornoProfessor == professor.length && retornoAluno != aluno.length) {
					System.out.println("\nnenhum professor cadastrado;");
					System.out.println("\nlista de alunos cadastrados:");
					mostraAluno(aluno);
				
				} else {
					System.out.println("\nlista de professores cadastrados:");
					mostraProfessor(professor);
					System.out.println("\nlista de alunos cadastrados:");
					mostraAluno(aluno);
				}
				break;
				
			case 3: System.out.println("\nprograma encerrado!"); break;
			default: System.out.print("opção inválida;"); break;
			} //FIM DO SWITCH PRINCIPAL
			
			System.out.println();
		} while (controle1 != 3); //FIM DO LAÇO DO-WHILE PRINCIPAL
		
		leitura.close();
	}
	
	public static String validaStringCpf(String cpf) {
		String cpfSemCaracteres = new String();
		int cont;
		
		cpf = cpf.trim();
		for (cont=0; cont<cpf.length(); cont++) {
			if (cpf.charAt(cont) >= '0' && cpf.charAt(cont) <= '9') {
				String caractere = Character.toString(cpf.charAt(cont));
				cpfSemCaracteres = cpfSemCaracteres.concat(caractere);
			}
		}
		return cpfSemCaracteres;
	}
	
	public static String validaCpf(String cpf) {
		int resultMultiplicacao = 0, resto, result;
		int cont, somaCharIguais = 0;
		int numeroCharAt;
		char charZero = cpf.charAt(0), charResult;
		String retorno = "invalido";
		
		
		for (cont=0; cont<cpf.length(); cont++) {
			if (cpf.charAt(cont) == charZero) {
				somaCharIguais++;
			}
		}
		
		if (somaCharIguais == 11) {
			retorno = "invalido";
		} else {
			for (cont=0; cont<9; cont++) {
				numeroCharAt = (int) cpf.charAt(cont) - 48;
				resultMultiplicacao += numeroCharAt * (10 - cont);
			}
			resto = resultMultiplicacao % 11;
			result = 11 - resto;
		
			if (result == 10 || result == 11) {
				result = 0;
			}
			
			charResult = (char) (result + 48);
			if (charResult == cpf.charAt(9)) {
				resultMultiplicacao = 0;
				
				for (cont=0; cont<10; cont++) {
					numeroCharAt = (int) cpf.charAt(cont) - 48;
					resultMultiplicacao += numeroCharAt * (11 - cont);  
				}
				resto = resultMultiplicacao % 11;
				result = 11 - resto;
				
				charResult = (char) (result + 48); 
				if (charResult == cpf.charAt(10)) {
					retorno = "valido";
				} else {
					retorno = "invalido";
				}
			} else {
				return "invalido";
			}
		}
		return retorno;
	}
	
	public static int verificaVetorProfessor(Professor professores[]) {
		int cont, contNull = 0;
		
		for (cont=0; cont<professores.length; cont++) {
			if (professores[cont] == null){
				contNull++;
			}
		}
		return contNull;
	}
	
	public static int verificaVetorAluno(Aluno alunos[]) {
		int cont, contNull = 0;
		for (cont=0; cont<alunos.length; cont++) {
			if (alunos[cont] == null) {
				contNull++;
			}
		}
		return contNull;
	}
	
	public static void mostraProfessor(Professor professores[]) {
		for (Professor professor: professores) {
			if (professor != null) {
				System.out.println(professor);
			}
		}
	}
	
	public static void mostraAluno(Aluno alunos[]) {
		for (Aluno aluno: alunos) {
			if (aluno != null) {
				System.out.println(aluno);
			}
		}
	}
}