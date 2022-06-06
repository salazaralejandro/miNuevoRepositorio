package ejemplosInicialesJAVA;

public class For {

	public static void main(String[] args) {
		//int valorInicial=0, valorFinal=0;
		System.out.println("Contando...");
	
		for(int num=1; num<=4; num++) {
			System.out.println("\nVamos por el n�mero " + num + "\n");
			for(int j=1; j<=3; j++)
			{
				System.out.println("Valor de j "+j);
			}
		}

		
		System.out.println("Fin de la cuenta");


	}



}
