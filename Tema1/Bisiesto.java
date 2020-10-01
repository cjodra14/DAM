import java.util.Scanner;
//visualiza true o false si un año es bisiesto o no
public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		boolean bisiesto;
		int anio, aniobis100, aniobis4, aniobis400;
		
		
		
		System.out.println("Teclea un numero:");
		anio=teclado.nextInt();
		bisiesto=anio%100==0?anio%400==0:anio%4==0;
		
		/*aniobis4=anio%4;
		aniobis100=anio%100;
		aniobis400=anio%400;
		bisiesto=((aniobis4|aniobis100&aniobis400)!=1);
		*/
		System.out.println(bisiesto);
		

	}

}
