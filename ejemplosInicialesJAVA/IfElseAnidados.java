package ejemplosInicialesJAVA;

public class IfElseAnidados {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un número entero");
		num=Entrada.entero();
		
		if (num > 0) {
			System.out.println("El número es positivo");
		} else {
			if (num < 0) {
				System.out.println("El número es negativo");
			} else {
				System.out.println("El número es cero");
			}
			if (num == 33) {
				System.out.println("La edad de cristo");
			} else {
				System.out.println("No es la edad de cristo");
			}
		}
		// ...O también...
		
		/* if (num>0){
			System.out.println("El número es positivo");
		}
		else {
			if(num<0){
				System.out.println("El número es negativo");
			}		
			else {
				System.out.println("El número es cero");
			}
			
		}*/
		 
		
		

	}

}
