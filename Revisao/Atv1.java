import java.util.Scanner;

public class Atv1 {
    private int idadeAnos;
    private int idadeMeses;
    private int idadeDias;


    public double diasVividos() {
        int resultado = idadeDias + (idadeAnos * 365) + (idadeMeses * 30);
        return  resultado;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Atv1 atv1 = new Atv1();


        System.out.println("Digite sua idade em anos: ");
        atv1.idadeAnos = sc.nextInt();
        System.out.println("Digite sua idade em meses: ");
        atv1.idadeMeses = sc.nextInt();
        System.out.println("Digite sua idade em dias: ");
        atv1.idadeDias = sc.nextInt();

        System.out.println("O total de dias vividos é: " + atv1.diasVividos());


        sc.close();
    }
}
