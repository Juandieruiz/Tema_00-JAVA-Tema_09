package tema05_Refactoring;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio1 {
	
	private static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

	public static void main(String[] args) {
		System.out.println("EJERCICIO 1");
		
		int entradaConsolaRespuestaLLueve = consultaConsolaLlueve();
		
		comoActuarConsultaLlueve(entradaConsolaRespuestaLLueve);
		
		entrada.close();
	}

	private static void comoActuarConsultaLlueve
	(int EntradaConsolaRespuestaLLueve) {
		if (EntradaConsolaRespuestaLLueve == 2) {
			System.out.println("Vamos a la playa");
		} else {
			int EntradaConsolaRespuestaParaguas = consultaConsolaParaguas();
			
			comoActuarConsultaParaguas(EntradaConsolaRespuestaParaguas);
		}
	}

	private static void comoActuarConsultaParaguas
	(int entradaConsolaRespuestaParaguas) {
		if (entradaConsolaRespuestaParaguas == 1){
			System.out.println("Coge el paraguas");
		}
		
		if (entradaConsolaRespuestaParaguas == 2) {
			System.out.println("Compra un paraguas");
		}		
	}

	private static int consultaConsolaLlueve() {
		System.out.println("¿Está lloviendo?: ");
		System.out.println("1 - Si / 2 - No");
		
		return entrada.nextInt();
	}
	
	private static int consultaConsolaParaguas() {
		System.out.println("¿Tienes un paraguas?: ");
		System.out.println("1 - Si / 2 - No");
		
		return entrada.nextInt();
	}
}
