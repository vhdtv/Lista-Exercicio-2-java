package ListaExercicios2;
import java.util.Scanner;
public class Ex2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double ValorPago, ValorCompra, Troco;
		System.out.println("Digite o valor gasto na compra e o valor pago:");
		ValorCompra = scan.nextDouble();
		ValorPago = scan.nextDouble();
		if(ValorCompra>ValorPago) {
			System.out.printf("Valor pago inválido o valor da compra é: %d", ValorCompra);
		}
		else {
			Troco = ValorPago - ValorCompra;
			int ContaNotas50=0, ContaNotas20=0, ContaNotas10=0,
			ContaNotas5=0, ContaNotas2=0, ContaNotas1=0;
			while(Troco>0) {
				if(Troco>=50) {
					ContaNotas50++;
					Troco -=50;
				}
				else if(Troco>=20) {
					ContaNotas20++;
					Troco -=20;
				}
				else if(Troco>=10) {
					ContaNotas10++;
					Troco -=10;
				}
				else if(Troco>=5) {
					ContaNotas5++;
					Troco -=5;
				}
				else if(Troco>=2) {
					ContaNotas2++;
					Troco -=2;
				}
				else if(Troco>=1) {
					ContaNotas1++;
					Troco -=1;
				}
			}
			System.out.printf("O numero de notas de 50 é: %d\nO numero de notas de 20 é: %d\n"
				+ "O numero de notas de 10 é: %d\nO numero de notas de 5 é: %d\n"
				+ "O numero de notas de 2 é: %d\nO numero de notas de 1 é: %d\n",ContaNotas50, 
				ContaNotas20, ContaNotas10, ContaNotas5, ContaNotas2, ContaNotas1);
		}
		scan.close();
	}
	
}