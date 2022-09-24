package desafio;


import java.io.IOException;
import java.util.Scanner;


public class desafioExercicios {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		
		String nome = null;
		String nomeAnimal = null;
		String corFav = null;
		String nomelogin;
		int senha;
		int opcao;
		int option = 0;
		
		System.out.println("Escolha uma Opção");
		System.out.println("0 - Sair");
		System.out.println("1 - Logar");
		opcao = s.nextInt();
				
			
			switch(opcao) {
			
				case 0:
					System.out.println("Sistema Encerrado!");
				break;
				
				case 1:
					System.out.println("Informe o seu usuario: ");
					nomelogin = s.next();
					System.out.println("Informe sua senha: ");
					senha = s.nextInt();
				if(nomelogin.equals("Vinicius") && senha == 1234){
						System.out.println("Dados Corretos");
						
				while(option != 1){
						System.out.println("1 - Sair");
						System.out.println("2 - Informe seu nome");
						System.out.println("3 - Informe o nome do seu animal");
						System.out.println("4 - Informe sua cor favorita");
						System.out.println("5 - Realizar uma operação matématica");
						System.out.println("6 - Escrever informações atuais");
						option = s.nextInt();
						
						switch(option) {
						case 2:
							System.out.println("Digite o seu nome: ");
							nome = s.next();
						break;
						
						case 3:
							System.out.println("Digite o nome do seu animal: ");
							nomeAnimal = s.next();
						break;
						
						case 4:
							System.out.println("Informe a sua cor favorita: ");
							corFav = s.next();
						break;
						
						case 5:
									System.out.println("Quer fazer qual operação: ");
									System.out.println("1 - Soma / 2 - Subtração / 3 - Divisão / 4 - Multiplicação");
									int op = s.nextInt();
									System.out.println("Informe o primeiro valor: ");
									float v1 = s.nextFloat();
									System.out.println("Informe o segundo valor: ");
									float v2 = s.nextFloat();
									switch(op) {
									case 1:
										float soma = v1+v2;
										System.out.println("O resultado é: " + soma);
									break;
									
									case 2:
										float sub = v1-v2;
										System.out.println("O resultado é: " + sub);
									break;
									
									case 3:
										float div = v1/v2;
										System.out.println("O resultado é: " + div);
									break;
									
									case 4:
										float multi = v1*v2;
										System.out.println("O resultado é: " + multi);
									break;
									
									default:
										System.out.println("Operação Inválida");
									break;
									
								}
						break;
						case 6:
							System.out.println("O seu nome é: " + nome);
							System.out.println("O nome do seu animal é: " + nomeAnimal);
							System.out.println("A sua cor favorita é: " + corFav);
						break;
						}
						
				}
					}else{
						System.out.println("Dados Incorretos");
					}
				break;
				
				
					
			}
			
		}
				
	}
		





