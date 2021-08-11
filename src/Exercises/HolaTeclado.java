package Exercises;

public class HolaTeclado {

public static void main( String args[] ) {
            String nombre;
            int edad;
            System.out.print( "Dime tu nombre: " );
            nombre = Keyboard.LeeCadena();
            System.out.print( "Dime tu edad: " );
            edad = Keyboard.LeeEntero();

             System.out.println( "Hola " + nombre +
                     ", tienes " + edad + " años" );
             }
 }

