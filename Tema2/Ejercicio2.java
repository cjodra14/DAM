import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Tecelea un numero:");
		n1=teclado.nextInt();
		System.out.println("Teclea otro numero:");
		n2=teclado.nextInt();
		System.out.println("Teclear un tercer numero:");
		n3=teclado.nextInt();
		if
		(n1>n2) {
			System.out.println("La suma de las cantidades es: "+(n1+n2));
		}
		else if(n1<=n2) {
			System.out.println("La resta de la segunda es: "+(n2-n1));
		}
		else if(n2>n3) {
			System.out.println("La producto de las dos cantidades es: "+(n2*n3));
		}
		else{
			System.out.println("El cociente  "+(n3/n2));
		}
	
		/*
		System.out.println("El producto de los dos numeros es: "+(n1*n2));
		System.out.println("La suma de los dos numeros es: "+(n1+n2));
		if(n1>n2) {
			System.out.println("El numero mayor es: "+n1);
		}
		else if(n1==n2) {
			System.out.println("Los numeros son iguales");
		}
		else {
			System.out.println("El numero mayor es: "+n2);
		}
*/

	}

}
