import java.util.*;
public class Ejer17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int n1, n2, suma=0, i;
		
		System.out.println("Introduce el primer numero:");
		n1=src.nextInt();
		System.out.println("Introduce el segundo numero");
		n2=src.nextInt();
		
		for(i=1;i<n1;i++) {
			if(n1%i==0) {
				suma=suma+i;
			}
			
		}
		
		if(suma==n2) {
			suma=0;
			for(i=1;i<n2;i++) {
				if(n2%i==0) {
					suma=suma+i;
				}
				
			}
			if(suma==n1) {
				System.out.println("Son amigos");
			}else {
				System.out.println("No son amigos");
			}
			
		}
		else {
			System.out.println("No son amigos");
		}
			
		

	}

}
