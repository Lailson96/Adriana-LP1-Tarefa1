
public class Eleitor {
	/*
	 * 2. Escreva um algoritmo para ler o número total de eleitores de um município,
	 *  o número de votos brancos, nulos e válidos. Calcular e escrever o percentual
	 *   que cada um representa em relação ao total de eleitores.

	 */
    public double eleitores;
    public double brancos;
    public double nulos;
    public double validos;

    public Eleitor(double eleitores, double brancos, double nulos, double validos) {
        this.eleitores = eleitores;
        this.brancos = brancos;
        this.nulos = nulos;
        this.validos = validos;
    }
    public double calcularBrancos() {
        return ((brancos / eleitores) * 100);
    }

    public double calcularNulos() {
        return ((nulos / eleitores) * 100);
    }

    public double calcularValidos() {
        return ((validos / eleitores) * 100);
    }

    
    public static void main(String[] args) {
        Eleitor e = new Eleitor(1000, 450, 250, 200);

        //  
        System.out.println("Resultados da Eleição: ");

        System.out.println("Votos brancos: " + e.calcularBrancos()+"%");
        System.out.println("Votos nulos: " + e.calcularNulos()+"%");
        System.out.println("Votos validos: " + e.calcularValidos()+"%");
    }
}
/*
Eleitores	Brancos	Nulos	Válidos	calcularBrancos()	calcularNulos()		calcularValidos()		Saídas
1000		450		250		200		(450/1000) * 100	(250 / 1000) * 100	(200 / 1000) * 100		Votos brancos: 45.0%
																									Votos nulos: 25.0%
																									Votos validos: 20.0%

*/