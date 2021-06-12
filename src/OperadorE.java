import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		/*Faça um programa que verifique se o usuário digitado é igual a 'administrador' e se a senha digitada é igual a '123'*/
		Scanner leitor = new Scanner(System.in);
		String usuario, senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.print("Por favor, digite seu username: ");
		usuario = leitor.next();
		System.out.print("Por favor, digite sua senha: ");
		senha = leitor.next();	
		//Aqui é preciso criar um if que verifique as duas condições para o login ser bem sucedido
		if(usuario.equalsIgnoreCase("administrador") && senha.equals("123"))
			System.out.println("Você é um admin com acesso ao sistema");
		else
			System.out.println("Usuário ou senha inválidos");
		
		leitor.close();

	}

}
