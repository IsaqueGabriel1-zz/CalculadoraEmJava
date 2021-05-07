
public class Calculadora {
	private int val1;
	private int val2;
	
	
	public Calculadora(int val1, int val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public void somar() {
		int res = this.val1 + this.val2;
		System.out.println("A soma é: " + res);
	}
	
	public void sub() {
		int res = this.val1 - this.val2;
		System.out.println("A subtracao é " + res);
	}
	
	public void div() {
		float res = this.val1 / this.val2;
		System.out.println("A divisão é " + res);
	}
	
	public void mult() {
		int res = this.val1 * this.val2;
		System.out.println("A multiplicação é " + res);
	}

}