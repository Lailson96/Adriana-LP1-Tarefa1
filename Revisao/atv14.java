import java.util.Scanner;
public class atv14 {
    private int inicio;
    public  int fim;
    public void duracao(){
        if (inicio<fim){
            int resultado = (fim-inicio);
            System.out.println(resultado);
        }
        else{
            int resultado2 = ((24-inicio) + fim );
            System.out.println(resultado2);
        }
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        atv14 atv14= new atv14();
        System.out.println("Digite o inicio: ");
        atv14.inicio=sc.nextInt();
        System.out.println("Digite o fim: ");
        atv14.fim= sc.nextInt();
        atv14.duracao();
        sc.close();
    }
}
