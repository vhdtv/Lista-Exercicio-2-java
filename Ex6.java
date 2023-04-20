package ListaExercicios2;
import java.util.Scanner;
import java.util.Random;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Digite dois numeros que definiram o intervalo do numero"
        		+ "aleatorio que sera sorteado:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int menornum = Math.min(num1, num2);
        int maiornum = Math.max(num1, num2);
        int sorteado = random.nextInt(maiornum - menornum + 1) + menornum;
        System.out.println("O numero sorteado foi: " + sorteado);
        if (sorteado % 2 == 0) {
            System.out.println("O numero sorteado e par.");
        } else {
            System.out.println("O numero sorteado e impar.");
        }
        scan.close();
    }
}

