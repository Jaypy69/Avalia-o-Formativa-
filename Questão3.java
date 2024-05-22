package AvaliaçãoFormativa;
import java.util.Scanner;
public class Questão3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		double valor, valor2, resultado=0, soma, sub, multi;
		String operacao;

		System.out.print("Informe o valor: ");
		valor = ler.nextDouble();

		System.out.print("Informe o valor 2: ");
		valor2 = ler.nextDouble();

		System.out.print("Informe a operação desejada + ou - ou *: ");
		operacao = ler.next();

		if (operacao.equals("+")) {
			resultado = valor + valor2;
			System.out.print("Resultado da adição: " +resultado);
		}
		else if (operacao.equals("-")) {
			resultado = valor - valor2;
			System.out.print("Resultado da subtração: " +resultado);
		}	
		else if (operacao.equals("*")) {
			resultado = valor * valor2;
			System.out.print("Resultado da multiplicação: " +resultado);
		}
		else
			System.out.print("Este tipo de operação é inválida");
		}
	}
