package ejemplosInicialesJAVA;

import java.io.*;

public class Entrada {
	static String inicializar(){
			String buzonModificado="";
			InputStreamReader flujo=new InputStreamReader(System.in);
			BufferedReader teclado=new BufferedReader(flujo);
			try{
				buzonModificado=teclado.readLine();
			}
			catch(Exception e){
				System.out.append("Entrada incorrecta)");
			}
			return buzonModificado;
	}
static int entero(){
	int valorModificado=Integer.parseInt(inicializar());
	return valorModificado;
	}
static double real(){
	double valorModificado=Double.parseDouble(inicializar());
	return valorModificado;
	}
static String cadena(){
	String valorModificado=inicializar();
	return valorModificado;
	}
static char caracter(){
	String valorModificado=inicializar();
	return valorModificado.charAt(0);
	}
}
