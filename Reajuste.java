
public class Reajuste {
	/*3. Escreva um algoritmo para ler o salário mensal atual de um funcionário e o 
	 * percentual de reajuste. Calcular e escrever o valor do novo salário.
	 */
    public float salario;

    public Reajuste(float salario) {
        this.salario = salario;
    }

    public float novoSalario() {
        return salario + (salario * 0.09f);
    }

    public static void main(String[] args) {
        Reajuste s = new Reajuste(2800);

        System.out.println("O salário inicial era de: R$ "+s.salario);
        System.out.println("O salário novo é: R$ "+s.novoSalario());

    }
}
/*
 * Salário Inicial	Percentual de Reajuste	novo salario			Saída
	2800				0,09				2800 + (2800 * 0.09f)	R$ 3052.00
*/
