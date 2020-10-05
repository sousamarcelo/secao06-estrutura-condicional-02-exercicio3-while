import java.util.Scanner;

/*Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
exemplo.*/

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o codigo: ");
		int codigo = sc.nextInt();
		
		int alcool1 = 0;
		int gasolina2 = 0;
		int diesel3 = 0;		
		
		while (codigo != 4) {
			if (codigo == 1) {
				alcool1 += 1;				
			} else if (codigo == 2) {
				gasolina2 += 1;
			} else if (codigo == 3) {
				diesel3 += 1;
			} else if (codigo > 4 || codigo < 1) {
				System.out.println("Codigo invalido");
			}
			System.out.print("Digite o codigo: ");
			codigo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool1);
		System.out.println("Gasolina: " + gasolina2);
		System.out.println("Diesel: " + diesel3);
		
		sc.close();

	}

}
