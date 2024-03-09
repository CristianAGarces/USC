import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String []args) {
		Scanner lectorConsola = new Scanner (System.in);
		int numEntero2, numEntero[]= new int [5];
		
		//lectura de los numeros de arreglo
		for(int i=0; i<numEntero.length;i++) {
			System.out.println("Por favor usuario ingrese 10 numeros enteros del 1 al 100");
			numEntero[i]=lectorConsola.nextInt();
		}
		
		//lectura del numero a determinar
		System.out.println("Ingrese un nuevo numero hasta el mismo valor maximo ya mencionado");
		numEntero2=lectorConsola.nextInt();
		
		//lectura de los numeros para determinar cuales sumados dan como resultado el ultimo numero ingresado
		boolean encontrado=false;
		for(int i=0;i<numEntero.length;i++){
			for(int j=i;j<numEntero.length;j++) {
				if(numEntero[i]+numEntero[j]==numEntero2) {
					//si el resultado es verdadero y encuentra los numeros que representen el ultimo ingresado salga del ciclo en que se encuentra
					System.out.println("Los numeros "+ numEntero[i] +" y "+ numEntero[j]+" dan como resultado a "+ numEntero2);
					encontrado=true;
					break;
				} 
			}
			//salga del segundo 2 bucle y no siga leyendo otras operaciones
			if(encontrado) {
				break;
			}
		}	
		//si no se encuentran valores entonces de como resultado negativo
		if(!encontrado){
			System.out.println("No se encontraron numeros que de como resultado a M");
		}
	}
}
