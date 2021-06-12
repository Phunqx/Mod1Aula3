import java.util.Scanner;

public class Exercício {

	public static void main(String[] args) {
		/*Crie um programa que peça que o usuário digite os valores dos 3 lados de um triângulo. O seu programa deverá validar se o triângulo existe. (A regra para isso é que a soma de quaisquer 2 lados do triângulo tem que ser SEMPRE maior que o terceiro e nenhum lado deve ser zero). Além disso, caso o triângulo exista, o seu programa deverá mostrar o tipo dele. */
		
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
		
		// Valida existência
		if(lado1+lado2 > lado3 && lado2+lado3 > lado1 && lado1+lado3 > lado2)
			System.out.println("O triângulo existe");
		else {
			System.out.println("O triângulo não existe");
			leitor.close();
			return; // Encerra o programa, pois não existe o triângulo
		}
		
		// Valida tipo
		if((lado1==lado2 && lado1!=lado3) || (lado2==lado3 && lado2!=lado1) || (lado1==lado3 && lado1!=lado2))
			System.out.println("Triângulo Isósceles - 2 lados iguais");
		else if (lado1==lado2 && lado2==lado3)
			System.out.println("Triângulo Equilátero - Todos os lados iguais");
		else if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3)
			System.out.println("Triângulo Escaleno - Todos os lados são diferentes");
		else
			System.out.println("Não foi possível identificar o triângulo");
		leitor.close();

	}

}
