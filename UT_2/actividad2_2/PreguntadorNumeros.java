/**
*
*Autor: Antonio Gómez Pérez
*Este programa pide dos numeros y pide una operacion a aplicar a los dos números.
*
*
*/
import java.util.Scanner;
public class PreguntadorNumeros{
    public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);

    int DATO1, DATO2, RESULTADO, OPERANDO;
    
    System.out.println("introduce un numero: ");
    DATO1 = teclado.nextInt();
    teclado.nextLine();
    
    System.out.println("Introduce un segundo número: ");
    DATO2 = teclado.nextInt();
    teclado.nextLine();

    System.out.println("Introduce un tipo de operación:1 sumar,2 restar,3 mutiplicar,4 dividir);
    OPERANDO = teclado.nextInt();
    teclado.nextLine();

        
    RESULTADO = DATO1 + OPERANDO + DATO2;
    System.out.print("TU resultado es: " + RESULTADO);

    }
}
