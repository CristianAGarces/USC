import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	static int numero;

	public static void main (String []args) {
		Random random = new Random(); 
		
		//pedir al usuario un numero a encontrar
		System.out.println("Por favor Sr usuario ingrese un numero entero del 1 al 100");
		Scanner lectorConsola = new Scanner(System.in);
		numero=lectorConsola.nextInt();
		
		//generar numeros random con tope hasta 50 2 veces y mostrarlos en pantalla
		int num1 = random.nextInt(50);
		int num2 = random.nextInt(50);
		System.out.println("Los numeros que el sistema genero Random son: "+num1+" y "+num2);
		
		//si los numeros random sumados dan como resultado el numero ingresado por consola haga lo siguiente 
		if(num1+num2==numero) {
			System.out.println("Si");
		}else {
			System.out.println("no");
		}
	}
}
