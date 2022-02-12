//Lee números hasta apretar 0. Mientras tanto se dirá si los números son pares o impares
import java.util.Scanner;

//clase principal
public class act2{

	public static void main(String [] arg){

		//declaracion de variables
		int x=1;

		Scanner in = new Scanner(System.in);

		//Bucle, cuando se introduce 0 se sale de este, mientras estara preguntando numeros
		//para ver si son pares o no
		while (x!=0) {

			//pide por pantalla introducir un numero
			System.out.println("Introduzca numero");

			//pide el numero
			x=in.nextInt();

			//condicional que mira si es par o no
			if (x%2==0){
			System.out.println("Es par");
			}
			else{
			System.out.println("Es impar");
			}
		}
		
		
	}
}