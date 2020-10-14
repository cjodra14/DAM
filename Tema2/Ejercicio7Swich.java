import java.util.Scanner;
public class Ejercicio7Swich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		byte dia, mes;
		
		System.out.println("Introduce el dia numericamente");
		dia=src.nextByte();
		
		if(1<=dia&&dia<=31) { //comprueba que el dia introducido esté entre el 1 y el 31
			
			System.out.println("Introduce el mes numericamente");
			mes=src.nextByte();
			
			if(1<=mes&&mes<=12) { //Comprueba que el mes introducido este entre el 1 y el 12
				
				switch(mes) {
				case '1' :
					System.out.println("el resultado de la suma es: ");
				break;
				case '2':
					System.out.println("El resultado de la resta es: ");
				break;
				case '3':
					System.out.println("El resultado de la multiplicacion es:");
				break;
				case '4':
					System.out.println("El resultado de la división es: ");
				break;
				case '5' :
					System.out.println("el resultado de la suma es: ");
				break;
				case '6':
					System.out.println("El resultado de la resta es: ");
				break;
				case '7':
					System.out.println("El resultado de la multiplicacion es:");
				break;
				case '8':
					System.out.println("El resultado de la división es: ");
				break;
				case '9' :
					System.out.println("el resultado de la suma es: ");
				break;
				case '15':
					System.out.println("El resultado de la resta es: ");
				break;
				case '11':
					System.out.println("El resultado de la multiplicacion es:");
				break;
				case '12':
					System.out.println("El resultado de la división es: ");
				break;
				
				default :
			}
			
				
			}
			else {
				 System.out.println("Los meses solo pueden ir del 1 al 12");
			}
		}
		else {
			 System.out.println("Los dias solo pueden ir del 1 al 31");
		}
	}

}
