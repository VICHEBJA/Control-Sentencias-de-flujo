package ec.edu.vista;

public class Aplicacion {
    public static void main(String[] args) {
     //Aplicacion.metodoA();
     //System.out.println("NUMERO RANDOMICO\n"+metodoA());
        validarpares(); 
        factorial();
    }
    public  static int metodoA()
    { //return 5;
    return (int) (Math.random()*100) ;
    }
    public void metodoB(){
    System.out.println("ESTUDIEN");
    }
    public static void validarpares(){
        int x=metodoA();
    if(x%2==0){System.out.println(x+"\tES PAR");}
    else{System.out.println(x+"\tES IMPAR");}
    }
    public static void factorial(){
    int x=metodoA();
    int acum= 1;
     for (int i=1;i<=x;i++)
         acum*=i;
    System.out.println(acum+"\tES el factorial de "+x);
     
    }
}
