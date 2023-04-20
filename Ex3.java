
package ListaExercicios2;
import java.util.Scanner;
public class Ex3{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A, B, C, RaizReal, X1, X2, Delta;
		System.out.println("Digite os valores dos coeficientes A B e C:");
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		Delta = Math.pow(B,2) - 4 * A * C;
		if(A == 0 && B == 0 && C != 0 ) {
			System.out.println("Coeficientes informados incorretamente.");
		}
		else if(A == 0 && B != 0) {
			System.out.println("Essa é uma equação de primeiro grau:");
			RaizReal = Math.pow((Math.pow(B,2) - 4 * C), 2);
			System.out.printf("O valor da raiz real é: %.2f", RaizReal);
		}
		else if(Delta < 0) {
			System.out.println("Esta equação não possui raízes reais.");
		}
		else if(Delta==0){
			System.out.println("Esta equação possui duas raízes reais iguais.");
			X1 = -B /2*A;
			System.out.printf("O valor das raizes é: %f\n", X1);
		}
		else{
			System.out.println("Esta equação possui duas raízes reais diferentes.");
			X1 = (-B + Math.sqrt(Delta))/(2*A);
			X2 = (-B - Math.sqrt(Delta))/(2*A);
			System.out.printf("O valor da raiz 1 é: %1f\nO valor da raiz 2 é: %f\n", X1, X2);	
		}
		scan.close();
	}
}