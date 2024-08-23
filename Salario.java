
public class Salario {
/*5. Uma revendedora de carros usados paga a seus funcionários vendedores 
 * um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.
 */

	    public int carrosVendidos; 
	    public float valorVendas;
	    public float salarioFixo;
	    public float comissao;

	    public Salario(int carrosVendidos, float valorVendas, float salarioFixo, float comissao) {
	        this.carrosVendidos = carrosVendidos;
	        this.valorVendas = valorVendas;
	        this.salarioFixo = salarioFixo;
	        this.comissao = comissao;
	    }
	    
	    
	    public float calculaSalario() {
	        return salarioFixo + (carrosVendidos * comissao) + (valorVendas * 0.05f);
	    }
	    
	    
	    public static void main(String[] args) {
	        Salario sf = new Salario(9, 110, 5500, 550);

	       System.out.println("O salário final será de: "+sf.calculaSalario());
	    }
	
}
/*Carros Vendidos	Valor Vendas	Salário Fixo	Comissão por Carro	calcularSalarioFinal()		Saída Salário Final
	9				 110			5500			550					5500 + (9 * 550) +			10455.5 
																		(110 * 0.05)  
																		

 */
