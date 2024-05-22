package AvaliaçãoFormativa;
import java.util.Scanner;
public class Questão2 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
       
		int A, B, Área;
        System.out.print("Insira a base do quadrado: ");
        A = ler.nextInt();
        
        System.out.print("Insira a altura do quadrado: ");
        B = ler.nextInt();
	
	    Área = A*B;
	    System.out.print("A área do quadrado é: " +Área);
	
	    ler.close();
	}
}
