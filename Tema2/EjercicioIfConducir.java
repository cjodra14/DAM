import java.util.Scanner;

public class EjercicioIfConducir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		byte edad;
		int cc, mma;
		char tipoVehic='a';
		
		
		
//-----------------------------------------
		System.out.println("�Para que vehiculo quieres obtener el permiso?(a para coche, m para moto");
		if(tipoVehic=='m') {
			
		}
		else {
			System.out.println("�Cual es la mma del automovil que desea conducir?");
			mma=teclado.nextInt();
			if(mma<3500) {
				System.out.println("Tecelee su edad:");
				edad=teclado.nextByte(); 
				if(edad>=18) {
					System.out.println("PUEDES TENER PERMISO DE CONDUCCI�N");
					
				}
				else {
					
				}
			}
			else {
				
			}
			
		}
		

	}

}
