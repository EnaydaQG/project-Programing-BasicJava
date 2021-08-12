package Exercises;

public class JuegaAdivinaNumero extends Juego2 {
    int valorPorAdivinar;
    public JuegaAdivinaNumero(int vidasPorDefecto, int b) {
        super(vidasPorDefecto);
        valorPorAdivinar=b;
    }

    @Override
    public void Juego2() {
   reinicioDePartida();
   int numero;
   System.out.println("adivina un numero del 1 al 10");
   reinicioDePartida();
   numero= Keyboard.LeeEntero();
   if (numero==valorPorAdivinar){
System.out.println(" Acertaste !!!!");
        }
   else{
       if(quitaVidas()) {
         if (valorPorAdivinar>numero)
           System.out.println("El numero a adivinar es menor");
         else
             System.out.println("El numero a adivinar es mayor");
       }
   }
   System.out.println("inserta otro numero");
   numero = Keyboard.LeeEntero();
   if(validaNumero(numero)){

   }else quitaVidas();
    }
    public boolean validaNumero(int nuemroPorAdivinar){
        return true;
    }
}
