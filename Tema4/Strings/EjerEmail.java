package Strings;
import java.util.Scanner;

public class EjerEmail {
	Scanner src=new Scanner(System.in);
	String email;
	EjerEmail(){
		System.out.println("teclea un email:");
		email=src.nextLine();
	}
	void arroba() {
		int arroba;
		arroba=email.indexOf('@');
		if(arroba<0) {
			System.out.println("No esta el @");
		}else {
			System.out.println("Si está el @ en la posición "+arroba);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerEmail ob1=new EjerEmail();
		ob1.arroba();

	}

}
