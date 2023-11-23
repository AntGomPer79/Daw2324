import java.util.Scanner;
public class CalificaNotas{
	public static void main (String[] args) {
		Scanner teclat = new Scanner(System.in);
		int nota;

		System.out.print("Introduce una nota entera entre 0 i 10: ");
		nota = teclat.nextInt();
		teclat.nextLine();
		
		if(nota < 0 || nota > 10){
            System.out.println("Error nota inválida");
        }
        else if(nota < 5){
            System.out.println("Insuficiente");
        }
        else if(nota == 5){
            System.out.println("Suficiente");
        }
        else if(nota == 6){
            System.out.println("Bien");
        }
        else if(nota <= 8){
            System.out.println("Notable");
        }
        else{
            System.out.println("Sobresaliente");
        }
	}
}
