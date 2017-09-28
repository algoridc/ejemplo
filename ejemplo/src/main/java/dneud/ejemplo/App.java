package dneud.ejemplo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	System.out.println( "prueba desde eclipse" );
    	System.out.println( "Hola Mundo!"+teclado("escribe un entero") );
    }
    public static int teclado(String txt) {
        //este modulo es para no tener que repetir el scanner
        //txt es el texto que quiero mostrar en pantalla
        System.out.println(txt);
        Scanner leer= new Scanner(System.in);
       int n=leer.nextInt();
       return n;
    }
}

