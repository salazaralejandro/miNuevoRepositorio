package ejemplosInicialesJAVA;

public class WhileConContinue {

	public static void main(String[] args) {
		int num=0;
		System.out.println("Contando...");
		while(num<=10){			
			if(num==5){
				num++;
				continue;		//salta una iteraci�n, pero hay que tener muuucho cuidado	
			}	
			if(num==8)
				break;			//sale del bucle, pero hay que tener muuuuucho cuidado
			System.out.println("Vamos por el n�mero "+num);
			num++;
		}
		System.out.println("Fin de la cuenta");
	}

}
