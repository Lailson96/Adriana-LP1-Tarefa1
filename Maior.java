
public class Maior {
	private int num1;
	private int num2;
	public Maior(int n1, int n2) {
	this.num1=n1;
	this.num2=n2;
	}
	public void maior() {
		if (num1>num2) {
			System.out.println(num1 +"É MAIOR");
		}
		else {
			System.out.println(num2 +"É MAIOR");
		}
		
	}
	public static void main (String[] args) {
		Maior m1;
		m1= new Maior(3,2);
		m1.maior();
	}
}
