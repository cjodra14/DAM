package pruebaarrays;
import java.lang.Math;

public class Ejer6Arrays {
	int n[]=new int[6];
	
	void lista() {
		for(int x=0;x<n.length;x++) {
			n[x]=(int)((Math.random())*101);
			while(n[x]<1) {
				n[x]=(int)((Math.random())*101);
			}
			while(n[x]>100) {
				n[x]=(int)((Math.random())*101);
			}
			
		}
	}
	void visualizar() {
		for(int x=0;x<n.length;x++) {
			System.out.println(n[x]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejer6Arrays ob=new Ejer6Arrays();
		ob.lista();
		ob.visualizar();

	}

}
