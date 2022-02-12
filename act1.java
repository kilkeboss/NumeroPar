//Programa que te dice si dos números son iguales
import java.util.Scanner;
public class act1{
	public static void main(String[ ] arg){
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca dos números: ");
		a =  in.nextInt();
		b =  in.nextInt();
		if (a==b) System.out.println("Son iguales");
		else System.out.println("Son diferentes");
	}
}