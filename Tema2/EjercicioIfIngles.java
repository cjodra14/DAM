import java.util.Scanner;

public class EjercicioIfIngles {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//stings de los dias de la semana
		String l=new String("lunes");
		String m=new String("martes");
		String x=new String("miercoles");
		String j=new String("jueves");
		String v=new String("viernes");
		String dia=new String("");
		
		
		//Declaracion de variables
		byte dd, mm, aprobados, suspensos, asistencia, faltas, alumnos;
		int coste;
		
	//Introducir el dia de la semana, dia numerico y mes
		System.out.println("Introduce el dia de la semana");
		dia=teclado.next();
		System.out.println(dia);
		if(dia==l) {
			System.out.println("todo bien");
		}
		else {
			System.out.println("El dia de la semana que ha introducido es erroneo");
		}
		
		
	
		

		
		
	}

}
