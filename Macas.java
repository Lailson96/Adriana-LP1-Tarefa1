
public class Macas {
	/*
	 * / 9. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, 
	 * e R$ 1,00 se forem compradas pelo menos doze. Escreva um programa que leia o
	 *  número de maçãs compradas, calcule e escreva o custo total da compra.
	 */
    public int qtd;

    public Macas(int qtd){
        this.qtd = qtd;
    }

    public double Total() {
        if(qtd < 12){
            return qtd * 1.30;
        } else {
            return qtd * 1.00;
        }
    }

    public static void main(String[] args) {
        Macas m = new Macas(11); 
        System.out.println("O custo total da compra é: R$"+m.Total());
    }    
}
/*
Quantidade de Maçãs		calculo Total			Saída Custo Total
11						11 * 1.30				R$14.3
*/