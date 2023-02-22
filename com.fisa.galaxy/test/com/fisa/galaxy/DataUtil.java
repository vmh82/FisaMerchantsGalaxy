package com.fisa.galaxy;

import java.util.ArrayList;
import java.util.List;

import com.fisa.galaxy.Alfabeto.Guia;

public final class DataUtil {

	
	public static List<Guia> generarDataPrueba(){
	List<Guia> instrucciones = new ArrayList<Guia>();
	String[] inputPrueba = new String[]{ "glob is I", 
			"prok is V", 
			"pish is X", "tegj is L",
			"glob glob Silver is 34 Credits", 
			"glob prok Gold is 57800 Credits", 
			"pish pish Iron is 3910 Credits",
			"how much is pish tegj glob glob ?", 
			"how many Credits is glob prok Silver ?",
			"how many Credits is glob prok Gold ?", 
			"how many Credits is glob prok Iron ?",
			"how much wood could a woodchuck chuck if a woodchuck could chuck wood ?" 
			};
		for (String line : inputPrueba){
			Guia instruccion = new Guia(line);
			instrucciones.add(instruccion);
		}
		return instrucciones;
	}	
}
