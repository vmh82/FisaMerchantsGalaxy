package com.fisa.galaxy.negocio.Impl;

import com.fisa.galaxy.enums.NumerosRomanosEnum;
import com.fisa.galaxy.negocio.IConvertidor;

public class ConvertidorImpl implements IConvertidor {

	@Override
	public int romanoADecimal(String romano) {
		int numeroDecimal = 0;
		int auxUltimoNumero = 0;
		for (int i = romano.length() - 1; i >= 0 ; i--) {
			NumerosRomanosEnum numeroRomano = NumerosRomanosEnum.obtenerNumeroRomano(romano.charAt(i));
			if (numeroRomano != null){
				numeroDecimal = calcularDecimal(numeroRomano.getEquivalenciaNumerica(), auxUltimoNumero, numeroDecimal);            
				auxUltimoNumero = numeroRomano.getEquivalenciaNumerica();
				}
			}
		return numeroDecimal;
	}

	@Override
	public int calcularDecimal(int equivalenciaNumericaRomano, int auxUltimoNumero, int numeroDecimal) {
		if (auxUltimoNumero > equivalenciaNumericaRomano){
			return numeroDecimal - equivalenciaNumericaRomano;
			} 
		return numeroDecimal + equivalenciaNumericaRomano;
	}
}
