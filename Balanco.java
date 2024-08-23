
public class Balanco {
	/*16. Na empresa em que trabalhamos, há tabelas com o gasto de cada mês.
	 *  Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total.
	 *  Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março,
	 *  17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos. 
	 */
    public double janeiro;
    public double fevereiro;
    public double marco;

    public Balanco(double janeiro, double fevereiro, double marco){
        this.janeiro = janeiro;
        this.fevereiro = fevereiro;
        this.marco = marco;
    }

    public double Total() {
        return janeiro + fevereiro + marco;
    }

    public double Mensal() {
        return (Total() / 3);
    }

    public static void main(String[] args) {
        Balanco g = new Balanco(1000.99, 2000, 3000);

        System.out.println("A despesa total no trimestre foi de R$"+g.Total());

        System.out.printf("A média mensal de gastos foi de R$ %.2f ", g.Mensal());
    }
    
}
/*	Janeiro		Fevereiro	Março	calcularDespesaTotal()	calcularMediaMensal()			Saída Total		Saída Média Mensal
	1000,99		2000		3000	1000,99 + 2000 + 3000	(1000,99 + 2000 + 3000) / 3		R$ 2000,33 			R$6000.99

*/