import java.util.Scanner;

public class Exerc�cio {

	public static void main(String[] args) {
		/*Crie um programa que pe�a que o usu�rio digite os valores dos 3 lados de um tri�ngulo. O seu programa dever� validar se o tri�ngulo existe. (A regra para isso � que a soma de quaisquer 2 lados do tri�ngulo tem que ser SEMPRE maior que o terceiro e nenhum lado deve ser zero). Al�m disso, caso o tri�ngulo exista, o seu programa dever� mostrar o tipo dele. */
		
		Scanner leitor = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.print("Digite o primeiro lado: ");
		lado1 = leitor.nextInt();
		System.out.print("Digite o segundo lado: ");
		lado2 = leitor.nextInt();
		System.out.print("Digite o terceiro lado: ");
		lado3 = leitor.nextInt();
		
		// Nenhum lado deve ser zero
		if (lado1 == 0 || lado2 == 0 || lado3 == 0) {
			System.out.println("Nenhum lado deve ser zero");
			return;
		}
		
		// Valida exist�ncia
		if(lado1+lado2 > lado3 && lado2+lado3 > lado1 && lado1+lado3 > lado2)
			System.out.println("O tri�ngulo existe");
		else {
			System.out.println("O tri�ngulo n�o existe");
			leitor.close();
			return; // Encerra o programa, pois n�o existe o tri�ngulo
		}
		
		// Valida tipo
		if((lado1==lado2 && lado1!=lado3) || (lado2==lado3 && lado2!=lado1) || (lado1==lado3 && lado1!=lado2))
			System.out.println("Tri�ngulo Is�sceles - 2 lados iguais");
		else if (lado1==lado2 && lado2==lado3)
			System.out.println("Tri�ngulo Equil�tero - Todos os lados iguais");
		else if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3)
			System.out.println("Tri�ngulo Escaleno - Todos os lados s�o diferentes");
		else
			System.out.println("N�o foi poss�vel identificar o tri�ngulo");
		leitor.close();

	}

}
