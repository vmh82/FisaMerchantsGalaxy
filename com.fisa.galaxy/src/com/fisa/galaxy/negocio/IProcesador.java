package com.fisa.galaxy.negocio;

import com.fisa.galaxy.Alfabeto.Guia;

/**
 * Interface con reglas de negocio para realizar el procesamiento de las instrucciones a convertir
 * @author Victor Maldonado
 *
 */
public interface IProcesador {
	
	/**
	 * Leer archivo con instrucciones a convertir
	 */
	public void leerInstrucciones();
	/**
	 * Una vez realizada la lectura de la informacion se procede a tomar una desicion dependiendo de las reglas de conversion
	 */
	public void procesarInstrucciones();
	/**
	 * Verifica y obtiene el valor decimal de su numero romano y posterior lo almacena en un hash para posterior validacion si existen
	 * unidades galacticas
	 * @param instruccion
	 */
	void actualizarTransaccionEnNumerosRomanos(Guia instruccion);
	/**
	 * Realiza la verificacion si existen unidades galacticas y las transforma a equivalente en creditos
	 */
	void actualizarTransaccionDeUnidadesACreditos(Guia instruccion);
	/**
	 * Para responder a esta pregunta debemos basarnos en las transformaciones previas de de TransaccionesEnNumerosRomanos, TransaccionesDeUnidadesACreditos
	 * y en caso de requerir debemos de realizar una multiplicacion del valor de la moneda por la cantidad de unidades de media para posterior conseguir 
	 * su valor decimal
	 * @param instruccion
	 */
	void crearTransaccionHowMuch(Guia instruccion);
	/**
	 * Para responder a esta pregunta debemos basarnos en las transformaciones previas de de TransaccionesEnNumerosRomanos, TransaccionesDeUnidadesACreditos
	 * y en caso de requerir debemos de realizar una multiplicacion del valor de la moneda por la cantidad de unidades de media para posterior conseguir 
	 * su valor decimal
	 * @param instruccion
	 */
	void crearTransaccionHowMany(Guia instruccion);
	/**
	 * Se ejecuta en caso de no realizar un comprension de las pregunas que debe resolver el programa
	 */
	void crearTransaccionNoValida();
}
