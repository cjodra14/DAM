package pruebaarrays;

public class Ejer5Arrays {
	final int NUMARRAY=12;
	double[]i=new double[NUMARRAY];
	
	Ejer5Arrays() {
		
	}
	
	void rellenarAlumnos() {
		for(int n=0;n<i.length;n++) {
			i[n]=((Math.random())*10);
		}
	}
	void visu() {
		for(int n=0;n<i.length;n++) {
			System.out.printf("%.2f",((float)(i[n])));
			System.out.println();
		}
	}
	void visuMediaAlum() {
		for(int n=0;n<i.length;n++) {
			System.out.print("La nota media del alumno "+(n+1)+" es un: ");
			System.out.printf("%.2f",((float)(i[n])));
			System.out.println();
		}
	}
	float calcMediaMan() {
		float media = 0;
		for(int n=0;n<8;n++) {
			media=(float) (media+(i[n]));
		}
		media=media/8;
		return media; 
	}
	void visuMediaMan(float media) {
		
			System.out.print("La nota media de los alumnos de la mañana es: ");
			System.out.printf("%.2f",(media));
			System.out.println();

	}
	float calcMediaTarde() {
		float media = 0;
		for(int n=8;n<i.length;n++) {
			media=(float) (media+(i[n]));
		}
		media=media/5;
		return media; 
	}
	void visuMediaTarde(float media) {
		
			System.out.print("La nota media de los alumnos de la tarde es: ");
			System.out.printf("%.2f",(media));
			System.out.println();

	}
	
	
	float calcMediaTotal() {
		float media = 0;
		for(int n=0;n<i.length;n++) {
			media=(float) (media+(i[n]));
		}
		media=media/i.length;
		return media; 
	}
	void visuMediaTotal(float media) {
		
			System.out.print("La nota media de los alumnos del centro es: ");
			System.out.printf("%.2f",(media));
			System.out.println();

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float mediaMan,mediaTarde,mediaTotal;
		Ejer5Arrays ob=new Ejer5Arrays();
		ob.rellenarAlumnos();
		ob.visuMediaAlum();
		System.out.println();
		mediaMan=ob.calcMediaMan();
		ob.visuMediaMan(mediaMan);
		System.out.println();
		mediaTarde=ob.calcMediaTarde();
		ob.visuMediaTarde(mediaTarde);
		System.out.println();
		mediaTotal=ob.calcMediaTotal();
		ob.visuMediaTotal(mediaTotal);

	}
}
