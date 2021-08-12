package Exercises;

public abstract class Juego2 {
   private int vidas;
   private static int vidasPorDefecto ;
   private static int  record = 0;

    public Juego2(int vidasPorDefecto) {
        this.vidasPorDefecto = vidasPorDefecto;
        vidas = vidasPorDefecto;
    }

    public abstract void Juego2() ;
    public int getMuestraVidas() {
        return vidas;
    }

    public void setMuestraVidas(int vidas) {
        this.vidas = vidas;
    }
    public boolean quitaVidas(){
        vidas --;
        if(vidas>0){
            return true;}
        else
            System.out.println("Juego terminado");
        return false;
    }
    public void reinicioDePartida(){
    vidas = vidasPorDefecto;
    }
 public void actualizaRecord(){
        if(getMuestraVidas()==record){
            System.out.println("Alcanso el record");
        }
        if(getMuestraVidas()>record){
            record=vidas;
            System.out.println("numero de vidas es mayor");
        }
 }


}
