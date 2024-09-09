import java.util.Scanner;
public class Atv13 {
    private double valor1;
    private double valor2;
    public void valorMaior(){
        if(valor1<valor2){
            System.out.println(valor1 +","+ valor2);
        }
        else {
            System.out.println (valor2+","+ valor1);
        }
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        Atv13 atv13= new Atv13();
        System.out.println("Digite o valor 1: ");
        atv13.valor1=sc.nextDouble();
        System.out.println("Digite o valor 1: ");
        atv13.valor2= sc.nextDouble();
        atv13.valorMaior();
        sc.close();
    }
}
