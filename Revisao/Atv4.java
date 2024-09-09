import java.io.File;
import java.util.Scanner;
public class Atv4 {
    private double custoFabrica;
    private double custoDistribuidor;
    private double custoImpostos;

    public double custoFinal(){
        double resultado = (custoFabrica + (custoFabrica* 0.28)+ (custoFabrica*0.45));
        return resultado;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Atv4 atv4= new Atv4();
        System.out.println("Valor de fabrica: ");
        atv4.custoFabrica= sc.nextDouble();


        System.out.println("O custo do carro ao consumidor será de: " + String.format("%.2f", atv4.custoFinal() ));
        sc.close();
    }
}

