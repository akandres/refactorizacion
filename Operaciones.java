package calculadora2;

import java.util.Arrays;

public enum Operaciones {
	/**
	 * Representa la operación de suma.
	 *  nombreOperacion es el Nombre de la operación.
	 *  simboloOperacion es el Símbolo de la operación.
	 *  infoOperacion es la Información de la operación.
	 *  idOperacion es el Identificador de la operación.
	 */
	SUMAR("Suma","+","Suma dos números",1),
	/**
	 * Representa la operación de resta.
	 *  nombreOperacion es el Nombre de la operación.
	 *  simboloOperacion es el Símbolo de la operación.
	 *  infoOperacion es la Información de la operación.
	 *  idOperacion es el Identificador de la operación.
	 */
	RESTAR("Resta","-","Resta dos números",2),
	/**
	 * Representa la operación de multiplicación.
	 *  nombreOperacion es el Nombre de la operación.
	 *  simboloOperacion es el Símbolo de la operación.
	 *  infoOperacion es la Información de la operación.
	 *  idOperacion es el Identificador de la operación.
	 */
	MULTIPLICAR("Multiplicación","*","Multiplica dos números",3),
	/**
	 * Representa la operación de división.
	 *  nombreOperacion es el Nombre de la operación.
	 *  simboloOperacion es el Símbolo de la operación.
	 *  infoOperacion es la Información de la operación.
	 *  idOperacion es el Identificador de la operación.
	 */
	DIVIDIR("División","/","Divide dos números",4),
	/**
	 * Representa la operación de suma al último resultado.
	 *  nombreOperacion es el Nombre de la operación.
	 *  simboloOperacion es el Símbolo de la operación.
	 *  infoOperacion es la Información de la operación.
	 *  idOperacion es el Identificador de la operación.
	 */
	SUMAR_RES("Sumar al resultado","+=","Suma un número al resultado actual",5),
	/**
	 * Representa la operación de resta al último resultado.
	 *  nombreOperacion es el Nombre de la operación.
	 *  simboloOperacion es el Símbolo de la operación.
	 *  infoOperacion es la Información de la operación.
	 *  idOperacion es el Identificador de la operación.
	 */
	RESTAR_RES("Restar al resultado","-=","Al resultado actual le resta un número",6),
	/**
	 * Representa la operación de multiplicación al último resultado.
	 *  nombreOperacion es el Nombre de la operación.
	 *  simboloOperacion es el Símbolo de la operación.
	 *  infoOperacion es la Información de la operación.
	 *  idOperacion es el Identificador de la operación.
	 */
	MULTIPLICAR_RES("Multiplicar al resultado","*=","Multiplica un número al resultado actual",7),
	/**
	 * Representa la operación de división al último resultado.
	 *  nombreOperacion es el Nombre de la operación.
	 *  simboloOperacion es el Símbolo de la operación.
	 *  infoOperacion es la Información de la operación.
	 *  idOperacion es el Identificador de la operación.
	 */
	DIVIDIR_RES("Dividir al resultado","/=","Resultado actual dividido por un número",8),
	/**
	 * Representa la operación de mostrar el último resultado.
	 *  nombreOperacion es el Nombre de la operación.
	 *  simboloOperacion es el Símbolo de la operación.
	 *  infoOperacion es la Información de la operación.
	 *  idOperacion es el Identificador de la operación.
	 */
	RESULTADO("Mostrar resultado","!","Muestra el último resultado",9),
	/**
	 * Representa la operación de generar un número aleatorio.
	 *  nombreOperacion es el Nombre de la operación.
	 *  simboloOperacion es el Símbolo de la operación.
	 *  infoOperacion es la Información de la operación.
	 *  idOperacion es el Identificador de la operación.
	 */
	RANDOM("Número aleatorio","¿?","Crea un número aleatorio 1-100", 10),
	/**
	 * Representa la operación de mostrar el historial.
	 *  nombreOperacion es el Nombre de la operación.
	 *  simboloOperacion es el Símbolo de la operación.
	 *  infoOperacion es la Información de la operación.
	 *  idOperacion es el Identificador de la operación.
	 */
	HISTORIAL("Historial","h","Muestra las cinco últimas operaciones",11);
	 
	/**
	 * Aqui se declaran las variables nombreOperacion, simboloOperacion, infoOperacion, idOperacion
	
	 */
	private final String nombreOperacion;
	private final String simboloOperacion;
	private final String infoOperacion;
	private final int idOperacion;
	/**
	 * Constructor operaciones que recibe nombre simbolo info e id como parametros y los asigna
	 
	 */
	Operaciones (String nombre, String simbolo, String info, int id){
		this.nombreOperacion = nombre;
		this.simboloOperacion = simbolo;
		this.infoOperacion = info;
		this.idOperacion = id;
	}
	/**
	 * Sets para el nombre, info, simbolo, id y opcionmenu
	
	 */
	public String getNombre() {return nombreOperacion;}
	public String getInfo() {return infoOperacion;}
	public String getSimbolo() {return simboloOperacion;}
	public int getId() {return idOperacion;}
	public String getOpcionMenu() {return idOperacion + ".- " + nombreOperacion;}
	

}