package boletin7_4;

public class Boletin7_4 {

    public static void main(String[] args) {
        Contabanc cb1=new Contabanc("63825","Fran Romay",60);
        Aplicacion a1=new Aplicacion();
        System.out.println("Num. conta:"+cb1.getnc());
        System.out.println("Titular: "+cb1.gett());
        System.out.println("Saldo: "+cb1.gets());
        a1.reintegro(cb1);
        a1.arruinar(cb1);
        System.out.println("Num. conta:"+cb1.getnc());
        System.out.println("Titular: "+cb1.gett());
        System.out.println("Saldo: "+cb1.gets());
    }
    
}
