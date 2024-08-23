
public class Temperatura {
	/*
	 * 6. Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, 
	 * calcular e escrever o valor correspondente em graus Celsius. Observação: 
	 * Para testar se a sua resposta está correta saiba que 100°C = 212°F

	 */
    public float fahrenheit;

    public Temperatura(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public float converte() {
        return (fahrenheit - 32) * 5/9;
    }
    public static void main(String[] args) {
        Temperatura t1 = new Temperatura(212.0f);
        System.out.println("O valor em Celsius é: "+t1.converte());
   }
}
/*
Fahrenheit			converterParaCelsius()				Saída Celsius
212.0			(212 - 32) * 5/9 = 180 * 5/9 = 100.0	100.0
*/