import java.util.Scanner;
public class Atv9 {
    private int macas;
    public void precoMacas(){
        if (macas<12){
            System.out.println("O valor em Reais é: "+ String.format("%.2f", macas*1.30 ));
        }
        else{
            System.out.println("O valor em reais é "+ macas);
        }
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Atv9 atv9= new Atv9();
        System.out.println("Digite o numero de maçãs: ");
        atv9.macas=sc.nextInt();
        atv9.precoMacas();
        sc.close();

    }
}
