package Exercises;

public class JuegoAdivinaPar extends JuegaAdivinaNumero {


    public JuegoAdivinaPar(int vidasPorDefecto, int b) {
        super(vidasPorDefecto, b);
    }

    @Override
    public boolean validaNumero(int nuemroPorAdivinar) {
       // return super.validaNumero(nuemroPorAdivinar);
        if (nuemroPorAdivinar%2 == 0)
        {
            return true;
        }else {
            System.out.println("erro no es el numero par");
            return false;
        }

    }
}
