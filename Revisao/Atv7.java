import java.util.Scanner;
public class Atv7 {
    private double valor;

    public void  maiorOuMenor() {
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        }
        else{
                System.out.println("NÃO É MAIOR QUE 10! ");
            }

            }
            public static void main (String[]args){
                Scanner sc = new Scanner(System.in);
                Atv7 atv7= new Atv7();
                System.out.println("Digite o valor: ");
                atv7.valor = sc.nextDouble();
                atv7.maiorOuMenor();
                sc.close();
            }

        }

