package com.fisa.galaxy;

import com.fisa.galaxy.negocio.IProcesador;
import com.fisa.galaxy.negocio.Impl.ProcesadorImpl;

public class Main {

	public static void main(String[] args) {
		IProcesador procesador = new ProcesadorImpl();
		procesador.leerInstrucciones();
		procesador.procesarInstrucciones();

	}

}
