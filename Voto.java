
public class Voto {
	/*11. Ler o ano atual e o ano de nascimento de uma pessoa. 
	 * Escrever uma mensagem que diga se ela poderá ou não votar este ano 
	 * (não é necessário considerar o mês em que a pessoa nasceu).
	 */

	    public int anoAtual;
	    public int anoNascimento;

	    public Voto(int anoAtual, int anoNascimento){
	        this.anoAtual = anoAtual;
	        this.anoNascimento = anoNascimento;
	    }
	    public String verificarIdade() {
	        if(anoAtual - anoNascimento >= 16){
	            return "Você pode votar.";
	        } else {
	            return "Você não pode votar.";
	        }
	    }
	    public static void main(String[] args) {
	        Voto i = new Voto(2024, 2003);
	        
	        System.out.println(i.verificarIdade());
	    }
	}

/*	Ano Atual		Ano Nascimento			condicão				Saída
	2024			2003					2024-2010>= 16			"Você poderá votar."

 */


