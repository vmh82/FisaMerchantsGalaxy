package com.fisa.galaxy.enums;

public enum NumerosRomanosEnum {
	
	I(1), 
	V(5),
	X(10),
	L(50),
	C(100),
	D(500),
	M(1000);
	
	private int equivalenciaNumerica;
	
	
	NumerosRomanosEnum(int equivalenciaNumerica){
		this.equivalenciaNumerica = equivalenciaNumerica;
	}
	
	public int getEquivalenciaNumerica(){
		return this.equivalenciaNumerica;
	}
	

	public static NumerosRomanosEnum obtenerNumeroRomano(final char caracterBusqueda){
		for (NumerosRomanosEnum numeroRomano : NumerosRomanosEnum.values()){
			if (numeroRomano.name().charAt(0) == caracterBusqueda){
				return numeroRomano;
			}
		}
		return null;
	}
}
