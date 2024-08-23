
public class Maior {
	/*
	 * 12. Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

	 */
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
/*
 * Número 1		Número 2	verificarMaiorNumero()	Saída
	3			2				3 > 2					2
*/
