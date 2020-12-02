package facturacion;

public class Vendedor {
	String dni;
	String nombre;
	byte categoria;
	float sueldoBase;
	
	Vendedor(){
		
	}
	Vendedor(String dni, String nom, byte cat, float sueldo){
		this.dni=dni;
		nombre=nom;
		categoria=cat;
		sueldoBase=sueldo;
	}
	Vendedor(String dni, String nom){
		this.dni=dni;
		nombre=nom;
	}
	Vendedor(String dni,float sueldo){
		this.dni=dni;
		sueldoBase=sueldo;
	}
	
	float calculoSueldo(byte cat, float sueldo) {
		if(cat==1) {
			sueldoBase=sueldo*1.02F;
		}else {
			sueldoBase=sueldo*1.05F;
		}
		return sueldo;
	}
	void visualizar(float sueldo) {
		System.out.println("El empleado "+dni+" tiene un sueldo de: "+sueldo);
	}

}
