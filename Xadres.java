
	public class Xadres{
		/*
		 * 14. Ler a hora de início e a hora de fim de um jogo de Xadrez
		 *  (considere apenas horas inteiras, sem os minutos) e calcule a duração do
		 *   jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas 
		 *   e que o jogo pode iniciar em um dia e terminar no dia seguinte.

		 */
	    public int inicio;
	    public int fim;

	    public Xadres(int inicio, int fim){
	        this.inicio = inicio;
	        this.fim = fim;
	    }

	    public int Duracao() {
	        if(inicio < fim){
	            return fim - inicio;
	        } else {
	            return 24 - inicio + fim;
	        }
	    }

	    public static void main(String[] args) {
	        Xadres j = new Xadres(15, 17);
	        
	        System.out.println("A duração do jogo foi de "+j.Duracao()+" horas.");
	    }
	}
/*	Hora Início		Hora Fim	calcularDuracaoJogo()	Saída
	15				17				17 - 15				2
*/
