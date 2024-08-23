
public class Notas {
/*
 * 10. Ler as notas da 1a. e 2a. avaliações de um aluno. 
 * Calcular a média aritmética simples e escrever uma mensagem que diga se o 
 * aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
 *  Escrever também a média calculada.

 */
	    public float n1;
	    public float n2;

	    public Notas(float n1, float n2){
	        this.n1 = n1;
	        this.n2 = n2;
	    }

	    public String calcularMedia() {
	        if ((n1 + n2) / 2 >= 6) {
	            return "Aprovado";
	        } else {
	            return "Reprovado";
	        }
	    }
	    public static void main(String[] args) {
	        Notas m = new Notas(7, 1);
	        System.out.println(m.calcularMedia());
	    }
	}

/*Nota 1	Nota 2	calcularMedia()		Saída
	7			1	(7 + 1) / 2 < 6		"Reprovado"
*/



