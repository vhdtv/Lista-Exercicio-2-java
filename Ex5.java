package ListaExercicios2;
import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char operacao;
		double num1, num2, resultado;
		System.out.println("Digite qual operacao deseja executar:\n+ --> Soma.\n- --> Subtracao.\n"
				+ "/ --> Divisao.\n* --> Multiplicacao.\n^ --> Potencia.");
		operacao = scan.next().charAt(0);
		System.out.println("Agora digite dois numeros reais que deseja a resolucao:");
		num1 = scan.nextFloat();
		num2 = scan.nextFloat();
		switch(operacao) {
			case '+':
				resultado = num1 + num2;
				System.out.printf("O resultado da operacao e: %.2f", resultado);
			break;
			case '-':
				resultado = num1 - num2;
				System.out.printf("O resultado da operacao e: %.2f", resultado);
			break;
			case '*':
				resultado = num1 * num2;
				System.out.printf("O resultado da operacao e: %.2f", resultado);
			break;
			case'/':
				resultado = num1/num2;
				System.out.printf("O resultado da operacao e: %.2f", resultado);
			break;
			case '^':
				resultado = Math.pow(num1, num2);
				System.out.printf("O resultado da operacao e: %.2f", resultado);
			break;
			default:
				System.out.println("Simbolo de operacao invalido.\nDigite qual operacao deseja executar:\n+ --> Soma.\n"
						+ "- --> Subtracao.\n/ --> Divisao.\n* --> Multiplicacao.\n^ --> Potencia.");
		}
		scan.close();
	}
}
