import java.util.Scanner;
public class Atv17 {
    private double e1;
    private double e2;
    private double p1;
    private double api;
    private double x;
    private double sub;

    public double media(){
        double notaBase = p1 * 0.6 + ((e1 + e2) / 2) * 0.4;
        double bonus = (notaBase > 5.9) ? (notaBase - 5.9) / (notaBase - 5.9) * api * 0.5 : 0.0;
        double media = (notaBase * 0.5f) + bonus + x + (sub * 0.2);

        if (media > 10.0) {
            return 10.0;
        } else if (media < 0.0) {
            return 0.0;
        }

        return media;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        Atv17 atv17=new Atv17();

        System.out.println("Digite e1: ");
        atv17.e1= sc.nextDouble();

        System.out.println("Digite e2: ");
        atv17.e2= sc.nextDouble();

        System.out.println("Digite p1: ");
        atv17.p1= sc.nextDouble();

        System.out.println("Digite api: ");
        atv17.api= sc.nextDouble();

        System.out.println("Digite z: ");
        atv17.x=sc.nextDouble();

        System.out.println("Digite sub: ");
        atv17.sub= sc.nextDouble();

        System.out.print("A média é: "+ atv17.media());

        sc.close();
    }
}

