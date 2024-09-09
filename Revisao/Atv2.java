import java.util.Scanner;

public class Atv2 {
    private double eleitores;
    private double brancos;
    private double nulos;


    public void totalEleitores(){
        double validos=(eleitores-brancos-nulos);
        System.out.println("Total de eleitores: "+ eleitores );
        System.out.println(" Total de Votos em Branco: "+ String.format("%.2f",((brancos / eleitores) *100 )));
        System.out.println("Total de Votos em Nulos: "+ String.format("%.2f",(nulos / eleitores) *100));
        System.out.println("Total de Votos Validos: "+ String.format("%.2f",(validos  / eleitores) *100 ));

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Atv2 atv2 = new Atv2();

        System.out.println("Total de eleitores: ");
        atv2.eleitores= sc.nextInt();
        System.out.println("Total de Votos em Branco: ");
        atv2.brancos= sc.nextInt();
        System.out.println("Total de Votos em Nulos: ");
        atv2.nulos= sc.nextInt();

        atv2.totalEleitores();
        sc.close();
    }

}
