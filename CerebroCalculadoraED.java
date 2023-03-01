package calculadora2;

import java.util.Scanner;
/**
 * La clase CerebroCalculadoraED representa el "cerebro" de la calculadora. 
 * Esta clase es responsable de realizar cálculos y almacenar un historial de operaciones.
 */
public class CerebroCalculadoraED {

	private double resultado, numero1, numero2;
	private String[] historial;
	Scanner tecladoCce = new Scanner(System.in);
	 /**
     * Constructor de la clase CerebroCalculadoraED.
     * Inicializa el historial con una longitud de 5 elementos y establece el resultado en 0.
     */
	CerebroCalculadoraED() {
		historial = new String[5]; 
		resultado = 0;
	}
	 /**
     * Procesa la operación dada por el usuario.
     * op es una cadena que representa la operación deseada por el usuario
     */
	public void procesarOperacion(String op) {
		Operaciones operacion;
		System.out.println("proceso " + op);
		switch (op) {
		case "1":
			operacion = Operaciones.SUMAR;
			operarSuma(operacion);
			break;
		case "2":
			operacion = Operaciones.RESTAR;
			operarResta(operacion);
			break;
		case "3":
			operacion = Operaciones.MULTIPLICAR;
			operarMultiplica(operacion);
			break;
		case "4":
			operacion = Operaciones.DIVIDIR;
			operarDivide(operacion);
			break;
		case "5":
			operacion = Operaciones.SUMAR_RES;
			operarSumaRes(operacion);
			break;
		case "6":
			operacion = Operaciones.RESTAR_RES;
			operarRestaRes(operacion);
			break;
		case "7":
			operacion = Operaciones.MULTIPLICAR_RES;
			operarMultiplicaRes(operacion);
			break;
		case "8":
			operacion = Operaciones.DIVIDIR_RES;
			operarDivideRes(operacion);
			break;
		case "9":
			operacion = Operaciones.RESULTADO;
			mostrarResultadoActual(operacion);
			break;
		case "10":
			operacion = Operaciones.RANDOM;
			numeroAleatorio(operacion);
			break;
		case "11":
			operacion = Operaciones.HISTORIAL;
			operarHistorial(operacion);
			break;
		default:
			System.out.println("ERROR: La operación " + op + " no es conocida.");
		}
	}
	/**
     * Realiza una operación de suma entre dos números.
     * op es un objeto Operaciones que representa la operación SUMAR
     * Da información sobre la operación, pide dos números, muestra el resultado y lo añade al historial
     */
	private void operarSuma(Operaciones op) {
		infoOperacion(op);
		pedirDosNumeros();
		this.resultado = this.numero1 + this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
     * Realiza una operación de resta entre dos números.
     * op es un objeto Operaciones que representa la operación RESTAR
     * Da información sobre la operación, pide dos números, muestra el resultado y lo añade al historial
     */
	private void operarResta(Operaciones op) {
		infoOperacion(op);
		pedirDosNumeros();
		this.resultado = this.numero1 - this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
     * Realiza una operación de multiplicación entre dos números.
     * op es un objeto Operaciones que representa la operación MULTIPLICAR
     * Da información sobre la operación, pide dos números, muestra el resultado y lo añade al historial
     */
	private void operarMultiplica(Operaciones op) {
		infoOperacion(op);
		pedirDosNumeros();
		this.resultado = this.numero1 * this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
     * Realiza una operación de división entre dos números.
     * op es un objeto Operaciones que representa la operación DIVIDIR
     * Da información sobre la operación, pide dos números, muestra el resultado y lo añade al historial
     */
	private void operarDivide(Operaciones op) {
		infoOperacion(op);
		pedirDosNumeros();
		this.resultado = this.numero1 / this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
     * Realiza una operación de suma entre dos números, uno que pide y otro que es el resultado anterior
     * op es un objeto Operaciones que representa la operación SUMAR
     * Da información sobre la operación, pide un número, muestra el resultado y lo añade al historial
     */
	private void operarSumaRes(Operaciones op) {
		infoOperacion(op);
		pedirUnNumero();
		this.resultado = this.resultado + this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
     * Realiza una operación de resta entre dos números, uno que pide y otro que es el resultado anterior
     * op es un objeto Operaciones que representa la operación RESTAR
     * Da información sobre la operación, pide un número, muestra el resultado y lo añade al historial
     */
	private void operarRestaRes(Operaciones op) {
		infoOperacion(op);
		pedirUnNumero();
		this.resultado = this.resultado - this.numero2; //Aqui habia un + en vez del -
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
     * Realiza una operación de multiplicación entre dos números, uno que pide y otro que es el resultado anterior
     * op es un objeto Operaciones que representa la operación MULTIPLICAR
     * Da información sobre la operación, pide un número, muestra el resultado y lo añade al historial
     */
	private void operarMultiplicaRes(Operaciones op) {
		infoOperacion(op);
		pedirUnNumero();
		this.resultado = this.resultado * this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
     * Realiza una operación de división entre dos números, uno que pide y otro que es el resultado anterior
     * op es un objeto Operaciones que representa la operación DIVIDIR
     * Da información sobre la operación, pide un número, muestra el resultado y lo añade al historial
     */
	private void operarDivideRes(Operaciones op) {
		infoOperacion(op);
		pedirUnNumero();
		this.resultado = this.resultado / this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
     * Muestra el resultado de la última operación
     * op es un objeto Operaciones que representa la operación 
     * Da información sobre la operación y muestra el resultado
     */
	private void mostrarResultadoActual(Operaciones op) {
		infoOperacion(op);
		System.out.println("El valor actual del resultado es: " + this.resultado + "\n");
	}
	/**
     * Muestra un número aleatorio
     * op es un objeto Operaciones que representa la operación RANDOM
     * Da información sobre la operación y muestra el resultado
     */
	private void numeroAleatorio(Operaciones op) {
		infoOperacion(op);
		this.resultado = (double)(Math.random()*100+1);
		System.out.println("El número aleatorio generado es: " + this.resultado + "\n");
		anadirHistorial(op); //Error de llamamiento al método corregido
	}
	/**
     * Muestra el historial, las 5 ultimas operaciones
     * op es un objeto Operaciones que representa la operación HISTORIAL
     
     */
	private void operarHistorial(Operaciones op) {
		System.out.println("*** Historial de las cinco últimas operaciones ***");
		for (String hist : historial) {
			if (historial!=null) {
			System.out.println(hist);
		}}
		System.out.println("\n");
	}
	/**
     * Muestra información sobre la operación pasada como parámetro
     * op es un objeto Operaciones que representa la operación 
     
     */
	private void infoOperacion(Operaciones op) {
		System.out.println("//////////////////////////////");
		System.out.println("-> " + op.getNombre() + " - " + op.getInfo());
	}
	/**
     * Pide un número introducido por teclado
     
     
     */
	private void pedirUnNumero() {
		System.out.println("Introduce el número: ");
		this.numero1 = this.resultado;
		this.numero2 = tecladoCce.nextDouble();
	}
	/**
     * Pide dos números introducidos por teclado
  
     
     */
	private void pedirDosNumeros() {
		System.out.println("Introduce el primer número: ");
		this.numero1 = tecladoCce.nextDouble();
		System.out.println("Introduce el segundo número: ");
		this.numero2 = tecladoCce.nextDouble();
	}
	/**
     * Muestra el último resultado
     * op es un objeto Operaciones que representa la operación 
     
     */
	private void mostrarResultado(Operaciones op) {
		System.out.println("El resultado de la operación " + op.getNombre().toLowerCase() + " es:");
		System.out.println(Double.toString(numero1) 
				+ " " + op.getSimbolo() + " " 
				+ Double.toString(numero2) + " = "
				+ Double.toString(resultado) + "\n");
	}
	/**
     * Añade las últimas operaciones al historial
     * op es un objeto Operaciones que representa la operación 
     
     */
	private void anadirHistorial(Operaciones op) {
		String nuevaOperacion = op.getNombre() + " -> " 
				+ Double.toString(numero1) 
				+ " " + op.getSimbolo() + " " 
				+ Double.toString(numero2) + " = "
				+ Double.toString(resultado);
		this.historial[4] = this.historial[3];
		this.historial[3] = this.historial[2];
		this.historial[2] = this.historial[1];
		this.historial[1] = this.historial[0];
		this.historial[0] = nuevaOperacion;
	}
	
	public void anadirHistorialAleatorio(Operaciones op) {
		String nuevaOperacion = op.getNombre() + " -> " 
				+ Double.toString(resultado);
		this.historial[4] = this.historial[3];
		this.historial[3] = this.historial[2];
		this.historial[2] = this.historial[1];
		this.historial[1] = this.historial[0];
		this.historial[0] = nuevaOperacion;
	}


}