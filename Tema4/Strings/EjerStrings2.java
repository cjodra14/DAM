package Strings;
import java.util.Scanner;
public class EjerStrings2 {
	Scanner src=new Scanner(System.in);
	String cadena1;
	
	EjerStrings2(){
		System.out.println("Teclea un texto para el String:");
		cadena1=src.nextLine();
		
	}
	
	void primMitad() {
		int n;
		n=(cadena1.length())/2;
		System.out.println(cadena1.substring(0,n));
	}
	
	public static void main(String[] args) {
		EjerStrings2 ob1=new EjerStrings2();
		ob1.primMitad();
		
		
	}
	

}
