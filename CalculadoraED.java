package calculadora2;

import java.util.Scanner;

public class CalculadoraED {

	public static void main(String[] args) {
		/**
		 * Imprime la cabecera de la calculadora, mientras no se introduzca una x
		 
		 */
		CerebroCalculadoraED cce = new CerebroCalculadoraED();
		Scanner teclado = new Scanner(System.in);
		String entrada;
		do {
			imprimirCabecera();
			imprimirSeleccionOp();
			
			entrada = teclado.next();
			if (validarEntrada(entrada)) {
				cce.procesarOperacion(entrada);
			}else {
				System.out.println("Entrada no reconocida");
			}
		} while (!entrada.equals("x"));
		imprimirDespedida();
	}
	/**
	 * Este método imprime la cabecera de la calculadora
	 
	 */
	private static void imprimirCabecera() {
		System.out.println("*----------------------------------*");
		System.out.println("*----------Calculadora ED----------*");
		System.out.println("*----------------------------------*");
	}
	/**
	 * Este método imprime la despedida de la calculadora
	 
	 */
	private static void imprimirDespedida() {
		System.out.println("*-----------------------------------------*");
		System.out.println("*----¡Gracias por usar Calculadora ED!----*");
		System.out.println("*-----------------------------------------*");
	}
	/**
	 * Este método imprime la operación que se ha seleccionado
	 
	 */
	private static void imprimirSeleccionOp() {
		Operaciones[] ops = Operaciones.values();
		for(Operaciones op: ops)
		{
			System.out.println(op.getOpcionMenu());
	    }
		System.out.println("¿Qué operación desea realizar? (x para terminar)");
	}
	/**
	 * Este método verifica que se haya introducido una entrada válida
	 
	 */
	private static boolean validarEntrada(String entrada) {
		if (entrada.equals("x")) {
			return true;
		} else {
			boolean opValida = false;
			Operaciones[] ops = Operaciones.values();
			for(Operaciones op: ops)
			{
				if(Integer.toString(op.getId()).equals(entrada)) {
					opValida = true;
				}
		    }
			return opValida;
		}
	}
	
	

}