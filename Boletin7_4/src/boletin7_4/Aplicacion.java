
package boletin7_4;

public class Aplicacion {
    public void reintegro(Contabanc cb){
    cb.ingresar(25);
    cb.retirar(4);
    }
    
    public void arruinar(Contabanc cb){
    cb.arruinar(cb);
    }
}
