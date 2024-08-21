public class Idade {
    /*Faça um algoritmo que leia a idade de uma pessoa 
     * expressa em anos, meses e dias e escreva a idade dessa pessoa 
     * expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. 
     1
     atributos
     */
        private int dia;
        private int mes;
        private int ano;
    //metodo contrutor
        public Idade(int dd, int mm, int aa){
            this.dia=dd;
            this.mes=mm;
            this.ano=aa;
        }
        public Idade(){
            this.dia=01;
            this.mes=01;
            this.ano=01;       	
        }
        public void total() {
        	int resultado =((mes*30)+(ano*365)+dia);
        	System.out.println(resultado);
        }
        
        
        public static void main(String []args){
        	Idade t1;
        	
        	t1=new Idade(2,2,2);
        	t1.total();
        	
        	
        }
        
} 

