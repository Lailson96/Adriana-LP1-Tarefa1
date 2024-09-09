import java.util.Scanner;
import java.util.SortedMap;

public class Atv6 {
    private double fahrenheit;

    public void conversao(){
        double resultado = (fahrenheit-32)/1.8;
        System.out.println("A conversão em Celsius é: "+ String.format("%.2f", resultado));
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Atv6 atv6 = new Atv6();
        System.out.println("Digite a temperatura em fahrenheit: ");
        atv6.fahrenheit= sc.nextDouble();
        atv6.conversao();
        sc.close();
    }
}
