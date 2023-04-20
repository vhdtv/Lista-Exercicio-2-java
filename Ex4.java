package ListaExercicios2;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Opcao;
		double Raio, Perimetro, Area, Volume, pi=3.141592;
		System.out.println("Digite qual opcão deseja calcular:\n1-Perímetro de um círculo.\n"
				+ "2-Área de um círculo.\n3-Volume de uma esfera.");
		Opcao = scan.nextInt();
		System.out.println("Agora digite o raio do objeto que deseja calcular:");
		Raio = scan.nextInt();
		switch(Opcao) {
			case 1: 
				Perimetro = 2 * pi * Raio;
				System.out.printf("Perímetro de um círculo:%.2f", Perimetro);
			break;
			case 2:
				Area = pi * Math.pow(Raio, 2);
				System.out.printf("Área de um círculo:%.2f", Area);
			break;
			case 3:
				Volume = 4/3 * pi * Math.pow(Raio, 3);
				System.out.printf("Volume de uma esfera:%.2f",Volume);
			break;
			default:
				System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3.");
		}
		scan.close();	
	}
}
