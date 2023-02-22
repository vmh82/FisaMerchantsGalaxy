package com.fisa.galaxy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.fisa.galaxy.Alfabeto.Guia;
import com.fisa.galaxy.enums.InstruccionesEnum;


public class GuiaTest {
	Guia guia;
	private static final String REGLA_ROMANO_GLOB = "glob is I";
	private static final String REGLA_CREDITOS = "pish pish Iron is 3910 Credits";
	private static final String REGLA_HOW_MUCH = "how much is pish tegj glob glob ?";
	private static final String REGLA_HOW_MANY = "how many Credits is glob prok Iron ?";
		
	@Test
	public void obtenerTipoInstruccionGlobTest(){
		guia = new Guia(REGLA_ROMANO_GLOB);
		assertTrue(InstruccionesEnum.ROMANOS == guia.obtenerTipoInstruccion());
	}
	
	@Test
	public void obtenerTipoInstruccionCreditosTest(){
		guia = new Guia(REGLA_CREDITOS);
		assertTrue(InstruccionesEnum.CREDITOS == guia.obtenerTipoInstruccion());
	}
	
	@Test
	public void obtenerTipoInstruccionHowMuchTest(){
		guia = new Guia(REGLA_HOW_MUCH);
		assertTrue(InstruccionesEnum.INSTRUCCION_HOW_MUCH == guia.obtenerTipoInstruccion());
	}
	
	@Test
	public void obtenerTipoInstruccionHowManyTest(){
		guia = new Guia(REGLA_HOW_MANY);
		assertTrue(InstruccionesEnum.INSTRUCCION_HOW_MANY == guia.obtenerTipoInstruccion());
	}
}