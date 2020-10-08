import java.util.Scanner;

public class EjercicioIfIngles {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
//strings de los dias de la semana
		String l=new String("lunes");
		String m=new String("martes");
		String x=new String("miercoles");
		String j=new String("jueves");
		String v=new String("viernes");
		String dia=new String("");
		String examen=new String();
		
		
//Declaracion de variables
		byte dd, mm, aprobados, suspensos, asistencia, alumnos, alumnosPracticas;
		float total, coste, costeTotal ;
		
//---------------------------------------------------------------------		
		
	//Introducir el dia de la semana, dia numerico y mes
		System.out.println("Introduce el dia de la semana");
		dia=teclado.next();
		
		
		
		//Comprueba dia de la semana, dia y mes está bien introducido
//-------------------------------------------------------------------------------------------------
		
		if(dia.equals(l)|dia.equals(m)|dia.equals(x)|dia.equals(j)|dia.equals(v)) { //Compara el string introducido en dia con los strings asignados
			
			System.out.println("Introduce el dia numericamente");
			dd=teclado.nextByte();
			
			
			if(1<=dd&&dd<=31) { //comprueba que el dia introducido esté entre el 1 y el 31
				
				System.out.println("Introduce el mes numericamente");
				mm=teclado.nextByte();
				
				if(1<=mm&&mm<=12) { //Comprueba que el mes introducido este entre el 1 y el 12
					
					System.out.println("La fecha introducida es el "+dia+","+dd+"/"+mm);
					
//-----------------------------------------------------------------------------------------------					
					
					if(dia.equals(l)|dia.equals(m)|dia.equals(x)) {//Comprobamos si habia clase de nivel
						System.out.println("Hubo examen ese dia?(responder con si o no");//preguntar si hubo examen ese dia
						examen=teclado.next();
						
//-------------------------------------------------------
//		Esta parte nos visualiza en caso de niveles si hubo examen los datos
//--------------------------------------------------------
						
						if(examen.equals("si")) {
						System.out.println("Hubo examen");
						System.out.println("Cuantos alumnos aprobaron");
						aprobados=teclado.nextByte();
						System.out.println("Cuantos alumnos suspendieron");
						suspensos=teclado.nextByte();
						if(dia.equals(l)) {
							System.out.println("En el nivel Inicial");
							System.out.println("Hubo "+aprobados+" aprobados");
							System.out.println("Hubo "+suspensos+" suspensos");
							total=(((float)aprobados/((float)aprobados+(float)suspensos))*100);
							System.out.println("Lo que es el % "+total+" de aprobados");
							
						}
						else if(dia.equals(m)) {
							System.out.println("En el nivel Intermedio");
							System.out.println("Hubo "+aprobados+" aprobados");
							System.out.println("Hubo "+suspensos+" suspensos");
							total=(((float)aprobados/((float)aprobados+(float)suspensos))*100);
							System.out.println("Lo que es el % "+total+" de aprobados");
						}
						else {
							System.out.println("En el nivel Avanzado");
							System.out.println("Hubo "+aprobados+" aprobados");
							System.out.println("Hubo "+suspensos+" suspensos");
							total=(((float)aprobados/((float)aprobados+(float)suspensos))*100);
							System.out.println("Lo que es el % "+total+" de aprobados");
						}
						
						
						}
						else {
							System.out.println("No hubo examen");
						}
						

						
					}
//------------------------------------Practica Hablada------------------------	
					else {
						
						if(dia.equals(j)) {//Si no habia clase de nivel comprueba si era practica hablada
							System.out.println("Hay practica hablada");
							
						}
//---------------------------------Clase de ingles para viajeros-----------------------
						
						else { //Si no era tampoco practica hablada es ingles para viajeros
							System.out.println("Hay ingles para viajeros");
							
						//Comprobación de si comienza el nuevo curso
							if((dd==1&&mm==1)|(dd==1&&mm==7)) {
								System.out.println("Comienzo de nuevo ciclo");
							}
							else {
								System.out.println("El curso ya está comenzado");
							}
							
						}
					}
				}
				
				
				
//---------------------------------------------------------------------------------------------//
//			Debajo de esto tenemos los casos que dan error al introducir la fecha			/////
//---------------------------------------------------------------------------------------------//
				else {
					
					 System.out.println("Los meses solo pueden ir del 1 al 12");
					 
				}
			}
			else {
				
			 System.out.println("Los dias solo pueden ir del 1 al 31");
			 
			}
			
		}
		
		else {
			
			System.out.println("El dia de la semana que ha introducido es erroneo");
			
		}
		
		
	
		

		
		
	}

}
