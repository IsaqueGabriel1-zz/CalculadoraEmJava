import java.util.Scanner;

public class Calcular {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o primeiro valor ");
		int a = teclado.nextInt();
		System.out.print("Digite o segundo valor ");
		int b = teclado.nextInt();
		
		Calculadora calc = new Calculadora(a, b);
		calc.somar();
		calc.sub();
		calc.mult();
		calc.div();
	}
}
