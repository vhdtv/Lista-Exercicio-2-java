package ListaExercicios2;
import java.util.Scanner;
public class Ex1{
	public static void main(String[] args) {
		double numero1, numero2, numero3, mediaaritmetica, maiornumero, menornumero;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 3 numeros reais:");
		numero1 = scan.nextDouble();
		numero2 = scan.nextDouble();
		numero3 = scan.nextDouble();
		mediaaritmetica = (numero1 + numero2 + numero3)/3;
		maiornumero = numero1;
		menornumero = numero1;
		if(numero2>maiornumero)
			maiornumero = numero2;
		if(numero3>maiornumero)
			maiornumero = numero3;
		if(numero2<menornumero)
			menornumero = numero2;
		if(numero3<menornumero)
			menornumero = numero3;
		System.out.printf("O maior numero é:%f\nO menor numero é: %f\n"
				+ "A media aritmetica dos 3 numeros é: %f",maiornumero, menornumero, mediaaritmetica);
		scan.close();
	}
}
