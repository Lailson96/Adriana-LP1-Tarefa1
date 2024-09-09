import java.util.Scanner;
public class Atv12 {
    private double valor1;
    private double valor2;
    public void valorMaior(){
        if(valor1>valor2){
            System.out.println(valor1+ " É maior ");
        }
        else {
            System.out.println(valor2+ " É maior ");
        }
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        Atv12 atv12= new Atv12();
        System.out.println("Digite o valor 1: ");
        atv12.valor1=sc.nextDouble();
        System.out.println("Digite o valor 1: ");
        atv12.valor2= sc.nextDouble();
        atv12.valorMaior();
        sc.close();
    }
}
