package Exercises;

public class JuegaAdivinaImpar extends JuegaAdivinaNumero{
    public JuegaAdivinaImpar(int vidasPorDefecto, int b) {
        super(vidasPorDefecto, b);
    }

    @Override
    public boolean validaNumero(int nuemroPorAdivinar) {
        //return super.validaNumero(nuemroPorAdivinar);
    if(nuemroPorAdivinar%2==0){
        System.out.println("error no es un numero impar");
        return false;
    }else
        return true;
    }
}
