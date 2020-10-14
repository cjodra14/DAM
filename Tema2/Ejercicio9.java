import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		byte numero;
		
		System.out.println("teclea un numero");
		numero=src.nextByte();
		
		switch(numero) {
		case 1:
			System.out.println("1,2,3,4,5,6,7,8,9,10");
		break;
		case 2:
			System.out.println("2,3,4,5,6,7,8,9,10");
		break;
		case 3:
			System.out.println("3,4,5,6,7,8,9,10");
		break;
		case 4:
			System.out.println("4,5,6,7,8,9,10");
		break;
		case 5:
			System.out.println("5,6,7,8,9,10");
		break;
		case 6:
			System.out.println("6,7,8,9,10");
		break;
		case 7:
			System.out.println("7,8,9,10");
		break;
		case 8:
			System.out.println("8,9,10");
		break;
		case 9:
			System.out.println("9,10");
		break;
		case 10:
			System.out.println("10");
		break;
		default:
			System.out.println("El numero es mayor a 10");
		break;
		
		}

	}

}
