import java.util.Scanner;

public class Atv10 {
    private double nota1;
    private double nota2;

    public void calculaNota(){
        double media = ((nota1+nota2)/2);
        System.out.println("A media é: "+ String.format("%.2f", media));
        if(media<6){
            System.out.println("Reprovado! A media é: " + String.format("%.2f", media));
        }
        else {
            System.out.println("Parabens! Aprovado! A media é: " + String.format("%.2f", media));
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Atv10 atv10= new Atv10();
        System.out.println("Digite a nota 1: ");
        atv10.nota1= sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        atv10.nota2= sc.nextDouble();
        atv10.calculaNota();
        sc.close();
    }
}
