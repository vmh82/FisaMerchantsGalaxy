package com.fisa.galaxy;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.fisa.galaxy.negocio.IConvertidor;
import com.fisa.galaxy.negocio.Impl.ConvertidorImpl;

public class ConvertidorTest {

	IConvertidor convertidor;
	@Before
	public void setUp() {
		convertidor = new ConvertidorImpl();
	}
		
	@Test
	public void romanoADecimalTest(){
		
		assertTrue(1 == convertidor.romanoADecimal("I"));
		assertTrue(2 == convertidor.romanoADecimal("II"));
		assertTrue(3 == convertidor.romanoADecimal("III"));
		assertTrue(4 == convertidor.romanoADecimal("IV"));
		assertTrue(52 == convertidor.romanoADecimal("LII"));
		assertTrue(900 == convertidor.romanoADecimal("CM"));
		assertTrue(88 == convertidor.romanoADecimal("LXXXVIII"));	
		
	}
}
