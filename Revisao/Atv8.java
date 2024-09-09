import java.util.Scanner;
public class Atv8 {
    private double valor;

    public void positivoOuNegativo(){
        if (valor<0){
            System.out.println("É negativo!");
        }
        else{
            System.out.println("É positivo! ");

        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Atv8 atv8= new Atv8();
        System.out.println("entre com um numero: ");
        atv8.valor= sc.nextDouble();
        atv8.positivoOuNegativo();
        sc.close();
    }

}
