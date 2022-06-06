package ejemplosInicialesJAVA;

public class ComparacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1=new String("jugador1");
		String cad2=new String(cad1);
		
		if(!cad1.equals(cad2))
			System.out.println("No son iguales");
		else
			System.out.println("Son iguales");
		
		if(cad1.compareTo(cad2)!=0)
			System.out.println("No son iguales");
		else
			System.out.println("Son iguales");
	}

}
