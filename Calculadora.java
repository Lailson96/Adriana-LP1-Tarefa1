public class Calculadora{
    //atributos
    private int num1;
    private int num2;
// método construtor
    public Calculadora(int n1, int n2){
     //atributo recebe valor
     this.num1 = n1;
     this.num2 = n2;
}
    //public Calculadora(int n1, boolean v){
     //atributo recebe valor
    //    this.num1 = 8;
     //   this.num2 = 9;
    //}
    public Calculadora(){
     //atributo recebe valor
     this.num1 = 1;
     this.num2 = 3;
}
//método de acesso * modificar o valor
    public void setNum1(int num1){
        this.num1=num1;
    }
//método de acesso * obter o valor
    public int getNum1(){
        return(this.num1);
    }

//métodos
   // public int somar1(){
     //   return(num1+num2);
    //}

    public void somar2(){
        int resultado = num1+num2;
        System.out.println(resultado);
    }
    public void subtrair(){
        int resultado = num1-num2;
        System.out.println(resultado);
    }
 
     public static void main(String []args){
        //declarando a variável / objeto
        Calculadora c1;
        // criando o objeto/ instância
        c1=new Calculadora();
        //c1.num1=5;
        //c1.num2=2;
       // System.out.println(c1.somar1());
        c1.somar2();
        //declaração e instânciação do objeto c2
        Calculadora c2 = new Calculadora();
        c2.subtrair();
        c2.setNum1(20);
        System.out.println("Novo valor de num1: "+c2.getNum1());
        c2.subtrair();

     }
}