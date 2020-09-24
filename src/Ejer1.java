
public class Ejer1 {

	//Ejercicios 1 y 2
	//Programa que visualiza datos del centro de Estudios: Ceinmark.	
	public static void main(String[] args) {
		System.out.println("Ciclo: Desarrollo de Aplicaciones Web");
		System.out.println("Modulo: Programacion");
		System.out.println("Centro: Ceinmark");
		System.out.println("Calle: Iturribide 22-24-26");
		System.out.println("Telef: 944157298");
		System.out.println( "Web: www.ceinmark.com");
		System.out.println();
	
//Ejercicios 3
		byte n1=1;
		short n2=1000;
		int n3=25000;
		long n4=-3000000L;
		float n5=3.14f;
		double n6=-2.5468412d;
		boolean n7=true;
		char n=',';
		
//Visualizacion de las variables separadas por comas, utilizando un char como coma.
		
	System.out.println("Valores de las variables "+n1+n+n2+n+n3+n+n4+n+n5+n+n6+n+n7);
	System.out.println();
	
//Visualizacion de los datos en una columna
	System.out.println(n1);
	System.out.println(n2);
	System.out.println(n3);
	System.out.println(n4);
	System.out.println(n5);
	System.out.println(n6);
	System.out.println(n7);
	System.out.println(n);
	System.out.println();
		
//Declarar variable con numeros negativos e introducir valores superiores para prueba
	//byte n11=130; // Nos recomiendo escribir byte n11=(byte) 130;o cambiar a int
	short n12=-32768;
	//int n13=-2147483650; //Indica que esta fuera de rango
	long n14=-4946512885646L;
	
	
	System.out.print(n12);
	System.out.println(n14);
	System.out.println();
	
	
	
//Declarar varias variable sen una sola linea
	int n20=700, n21=-134, n22=892, n23=1000;
	
	System.out.println(n20+" "+n21+" "+n22+" "+n23);
	System.out.println();
	
	}

}
