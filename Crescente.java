
public class Crescente {
	/*
	 * 13. Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

	 */
	    public int num1;
	    public int num2;

	    public Crescente(int num1, int num2){
	        this.num1 = num1;
	        this.num2 = num2;
	    }

	    public void crescente() {
	        if(num1 < num2){
	            System.out.println("Os números em ordem crescente são: "+num1+" e "+num2);
	        } else {
	            System.out.println("Os números em ordem crescente são: "+num2+" e "+num1);
	        }
	    }

	    public static void main(String[] args) {
	        Crescente n = new Crescente(200, 100);
	        
	        n.crescente();
	    }
	}
/*	Num1	Num2			condição			Saída
	789		123				789 > 123			Os números em ordem crescente são: 100 e 200

*/
