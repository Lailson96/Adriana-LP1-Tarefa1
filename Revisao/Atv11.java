import java.util.Scanner;
public class Atv11 {
    private int nascimento;
    public void voto(){
        if(2024 - nascimento>16){
            System.out.println("Pode votar: ");
        }
        else{
            System.out.println("Não pode votar: ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Atv11 atv11= new Atv11();
        System.out.println("Digite seu ano de nascimento: ");
        atv11.nascimento= sc.nextInt();
        atv11.voto();
        sc.close();
    }
}
