
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
		System.out.println("A soma �: " + res);
	}
	
	public void sub() {
		int res = this.val1 - this.val2;
		System.out.println("A subtracao � " + res);
	}
	
	public void div() {
		float res = this.val1 / this.val2;
		System.out.println("A divis�o � " + res);
	}
	
	public void mult() {
		int res = this.val1 * this.val2;
		System.out.println("A multiplica��o � " + res);
	}

}