
public class MayorMenorPrint {
	MayorMenorPrint(){
		System.out.println("Programa que visualiza el n�mero mayor y el menor");
	}
	void calcularMayor(int n1, int n2, int n3) {
		if(n1>n2 &&n1>n3) {
			System.out.println(n1+" es el numero mas alto");
		}else if(n3>n2) {
			System.out.println(n3+" es el numero mas alto");
		}else {
			System.out.println(n2+" es el numero mas alto");
		}
	}
	void calcularMenor(int n1, int n2, int n3) {
		if(n1<n2&&n1<n3) {
			System.out.println(n1+" es el numero mas bajo");
		}else if(n3<n2) {
			System.out.println(n3+" es el numero mas bajo");
		}else {
			System.out.println(n2+" es el numero mas bajo");
		}
	}

	public static void main(String[] args) {
		MayorMenorPrint call=new MayorMenorPrint();
		call.calcularMayor(5,6,10);
		call.calcularMenor(5,6,10);

	}

}
