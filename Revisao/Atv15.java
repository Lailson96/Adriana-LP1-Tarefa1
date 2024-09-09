import java.util.Scanner;
public class Atv15 {
    private int horasDoMes;
    private int salarioHora;

    public void pagamento(){
        if(horasDoMes<160){
            System.out.println("Salario sem H.E: "+ ( horasDoMes*salarioHora));
        }
        else{
            int he = horasDoMes-160;
            System.out.println("Salario com H.E: "+(horasDoMes*salarioHora+(he*(salarioHora*0.5))));
        }
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Atv15 atv15=new Atv15();
        System.out.println("Entre com as horas trabalhadas: ");
        atv15.horasDoMes= sc.nextInt();
        System.out.println("Entre com o salario mensal: ");
        atv15.salarioHora= sc.nextInt();
        atv15.pagamento();
        sc.close();
    }
}
