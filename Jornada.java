
public class Jornada {
	
	/*
	 * 15. A jornada de trabalho semanal de um funcionário é de 40 horas.
	 *  O funcionário que trabalhar mais de 40 horas receberá hora extra, 
	 *  cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
	 *  Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
	 *  o salário por hora e escreva o salário total do funcionário, que deverá ser
	 *  acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

	 */
    public float horas;
    public float salarioHora;

    public Jornada(float horas, float salarioHora){
        this.horas = horas;
        this.salarioHora = salarioHora;
    }
    
    public float total() {
        if(horas > 160){
            return (160 * salarioHora) + ((horas - 160) * (salarioHora * 1.5f));
        } else {
            return horas * salarioHora;
        }
    }

    public static void main(String[] args) {
        Jornada s = new Jornada(100, 50);
        
        System.out.println("O salário total do funcionário é: R$"+s.total());
    }
}
/*Horas Trabalhadas		Salário Hora	condicão 					Saída
	100					50				horas<160 					5000.0
										retorna horas*salarioHora
*/