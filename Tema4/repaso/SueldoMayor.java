package repaso;

import java.util.Scanner;
class SueldoMayor {
	

	    SueldoMayor() {
	        
	        
	    }
	    
	    public void mayorSueldo(String nombre, float sueldo) {
	        float mayor=Float.MIN_VALUE;// constantes MAX_VALUE y MIN_VALUE
	        int pos=0;	            
	        for(int f=0;f<nombres.length;f++) {
	            if (sueldos[f]>mayor) {
	                mayor=sueldos[f];
	                pos=f;
	            }
	        }
	        System.out.println("El empleado con sueldo mayor es "+nombres[pos]);
	        System.out.println("Tiene un sueldo:"+mayor);
	    }
	    
	    public static void main(String[] ar) {

		     Scanner teclado=new Scanner(System.in);
		     String[] nombres=new String[5];
		     float[] sueldos=new float[5];
		     for(int f=0;f<nombres.length;f++) {
		            System.out.print("Teclear el nombre del empleado:");
		            nombres[f]=teclado.nextLine();
		            System.out.print("Teclear el sueldo:");
		            sueldos[f]=teclado.nextFloat();
		            teclado.nextLine();
		        }

	      SueldoMayor obj=new SueldoMayor();
	      obj.mayorSueldo(nombres,sueldos);
	    }
	}

/*
import java.util.Scanner;
class SueldoMayor {
	
	     Scanner teclado=new Scanner(System.in);
	     String[] nombres;//{"Juan","Pedro","Marcos","Andrea","Ana"};
	    
	     float[] sueldos;//{1,2,3,4,5};


	    SueldoMayor(int longitud) {
	    	nombres=new String[longitud];
	    	sueldos=new float[longitud];
	        
	        for(int f=0;f<nombres.length;f++) {
	            System.out.print("Teclear el nombre del empleado:");
	            nombres[f]=teclado.nextLine();
	            System.out.print("Teclear el sueldo:");
	            sueldos[f]=teclado.nextFloat();
	            teclado.nextLine();
	        }
	    }
	    
	    public void mayorSueldo() {
	        float mayor=Float.MIN_VALUE;// constantes MAX_VALUE y MIN_VALUE
	        int pos=0;	            
	        for(int f=0;f<nombres.length;f++) {
	            if (sueldos[f]>mayor) {
	                mayor=sueldos[f];
	                pos=f;
	            }
	        }
	        System.out.println("El empleado con sueldo mayor es "+nombres[pos]);
	        System.out.println("Tiene un sueldo:"+mayor);
	    }
	    public void menorSueldo() {
	        float menor=Float.MAX_VALUE;// constantes MAX_VALUE y MIN_VALUE
	        int pos=0;	            
	        for(int f=0;f<nombres.length;f++) {
	            if (sueldos[f]<menor) {
	                menor=sueldos[f];
	                pos=f;
	            }
	        }
	        System.out.println("El empleado con sueldo menor es "+nombres[pos]);
	        System.out.println("Tiene un sueldo:"+menor);
	    }
	    
	    
	    public static void main(String[] ar) {
	    	 Scanner src=new Scanner(System.in);
	    	int longitud=0;
	    	 System.out.print("Teclear cuantos empelado hay");
	            longitud=src.nextInt();
	    	
	      SueldoMayor obj=new SueldoMayor(longitud);
	      obj.mayorSueldo();
	      obj.menorSueldo();
	    }
	}*/
