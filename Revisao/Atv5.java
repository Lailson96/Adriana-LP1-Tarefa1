import java.util.Scanner;

public class Atv5 {
    private double salarioFixo;
    private double carrosVendidos;
    private double comissaoFixa;
    private double valorVendas;

    public void salarioTotal(){
        double resultado;
        resultado= (salarioFixo+ (valorVendas *0.5)+ (carrosVendidos*comissaoFixa));
        System.out.println("O salario total é de : "+ String.format("%.2f", resultado));
    }
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        Atv5 atv5 = new Atv5();
        System.out.println("Digite a quantidade de carros vendidos: ");
        atv5.carrosVendidos=sc.nextDouble();
        System.out.println("Digite o salario fixo: ");
        atv5.salarioFixo=sc.nextDouble();
        System.out.println("Digite a comissão por carro: ");
        atv5.comissaoFixa=sc.nextDouble();
        System.out.println("Digite o valor das vendas : ");
        atv5.valorVendas=sc.nextDouble();
        atv5.salarioTotal();

        sc.close();
    }
}
