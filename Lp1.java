
public class Lp1 {
	/*17. Programa que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno:
Fórmula para cálculo de média de LP1.
(P10.6+((E1+E2)/2)0.4)0.5+(max(((P10.6+((E1+E2)/2)0.4)-5.9),0)/((P10.6+((E1+E2)/2)0.4)-5.9))(API0.5)+X+(SUB0.2)
	 */
    public float E1;
    public float E2;
    public float P1;
    public float API;
    public float X;
    public float SUB;

    public Lp1(float E1, float E2, float P1, float API, float X, float SUB) {
        this.E1 = E1;
        this.E2 = E2;
        this.P1 = P1;
        this.API = API;
        this.X = (X > 1.0f) ? 1.0f : X; 
        this.SUB = SUB;
    }

    public float Media() {
        float notaBase = P1 * 0.6f + ((E1 + E2) / 2) * 0.4f;
        float bonus = (notaBase > 5.9f) ? (notaBase - 5.9f) / (notaBase - 5.9f) * API * 0.5f : 0.0f;

        float media = (notaBase * 0.5f) + bonus + X + (SUB * 0.2f);

        if (media > 10.0f) {
            return 10.0f;
        } else if (media < 0.0f) {
            return 0.0f;
        }

        return media;
    }

    public static void main(String[] args) {
        Lp1 m = new Lp1(5.0f, 5.0f, 7.0f, 6.0f, .3f, 9.0f);  
        
        System.out.printf("Sua média de LP1 é: %.2f%n", m.Media());  
    }
}
/*	E1		E2		P1		API		X		SUB				cálculo														Saída Média LP1
	5.0		5.0		7.0		7.0		6		9.0				P1 * 0.6f + ((E1 + E2) / 2) * 0.4f; 						8,2
															(notaBase > 5.9f) ? (notaBase - 5.9f) / 
															(notaBase - 5.9f) * API * 0.5f : 0.0f;
															float media = (notaBase * 0.5f) + bonus + X + (SUB * 0.2f);

*/