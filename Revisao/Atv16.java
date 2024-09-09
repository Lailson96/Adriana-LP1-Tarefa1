public class Atv16 {
    private double janeiro;
    private double fevereiro;
    private double marco;

    public Atv16(double janeiro, double fevereiro, double marco){
        this.janeiro=janeiro;
        this.fevereiro=fevereiro;
        this.marco=marco;
    }

    public Atv16(){
        this.janeiro=15000;
        this.fevereiro=23000;
        this.marco=17000;
    }

    public void balanco(){
        double resultado = ((janeiro+fevereiro+marco)/3);
        System.out.println(resultado);
        System.out.println(janeiro);
        System.out.println(marco);
        System.out.println(fevereiro);
        System.out.println(resultado);
    }
    public static void main(String [] args){
        Atv16 atv16= new Atv16(1500,23000,17000);
        atv16.balanco();
}
}