import java.util.Scanner;

/*Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.*/

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite senha valida: ");
		int senhaDigitada = sc.nextInt();
		int senha = 2002;
		
		while (senhaDigitada != senha) {
			System.out.println("Senha Invalida");
			senhaDigitada = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		
		sc.close();

	}

}
