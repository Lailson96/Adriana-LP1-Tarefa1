
public class Voto {
	//11
	private int ano;
	public Voto(int n1) {
		this.ano=n1;
	}
	public void verificarAno() {
		int resultado= 2024-ano;
		if (resultado>=18 ) {
		System.out.println("Pode votar!");
		}
		else {
		System.out.println ("Não pode votar");
		}
	}
	public static void main(String[] args) {
		Voto v1;
		v1= new Voto(2002);
		v1.verificarAno();
	}
}
