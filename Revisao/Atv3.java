import java.util.Scanner;
public class Atv3 {

    private double salarioAtual;
    private double reajuste;

    public void ajusteSalarial(){
        double resultadoMensal= (salarioAtual +salarioAtual * reajuste/100);
        double resultadoAnual=(resultadoMensal*12);
        System.out.println("Novo salario mensal será: "+ resultadoMensal);
        System.out.println("E o salario anual: "+ resultadoAnual);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Atv3 Atv3 = new Atv3();
        System.out.println("Digite o salario atual: ");
        Atv3.salarioAtual=sc.nextDouble();
        System.out.println("Qual será o reajuste: ");
        Atv3.reajuste= sc.nextDouble();

        Atv3.ajusteSalarial();
        sc.close();

    }
}
