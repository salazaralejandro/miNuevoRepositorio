package ejemplosInicialesJAVA;

public class EjemploCasting {

	public static void main(String[] args) {
			
		int num1;
		int num2;
		double division;
		
		System.out.println("Introduzca un número:");
		num1=Entrada.entero();
		
		System.out.println("Introduzca otro:");
		num2=Entrada.entero();
		
		 division=((double)num1/(double)num2); //12 entre 7 devuelve 1 
		//division=(double)(num1/num2); //12 entre 7 devuelve.....
		System.out.println("La división entera entre "+num1+" y "+num2+" es "+division);
	}

}
