package AvaliaçãoFormativa;
import java.util.Scanner;
public class Questão1 {

	public static void main(String[] args) {
		
		double cel, far;
		
		Scanner ler = new Scanner(System.in);
			
		System.out.println("Mostre os graus fahrenheit: ");
		far = ler.nextDouble();
		
		cel = (far-32)*5/9;
		
		System.out.println("Conversão em celsius é: " +cel);
		ler.close();
	}
 
}
