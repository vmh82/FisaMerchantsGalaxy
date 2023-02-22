package com.fisa.galaxy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import com.fisa.galaxy.negocio.Impl.ProcesadorImpl;

public class ProcesadorTest {
	private ProcesadorImpl procesador;
	
	@Before
	public void setUp() {
		procesador = new ProcesadorImpl();
		this.procesador.setInstrucciones(DataUtil.generarDataPrueba());
		procesador.procesarInstrucciones();
	}
		
	@Test
	public void romanoADecimalTest(){
		assertEquals("I", procesador.getTransaccionEnNumerosRomanos().get("glob"));
		assertEquals("V", procesador.getTransaccionEnNumerosRomanos().get("prok"));
		assertEquals("X", procesador.getTransaccionEnNumerosRomanos().get("pish"));
		assertEquals("L", procesador.getTransaccionEnNumerosRomanos().get("tegj"));
	}
	
	@Test
	public void transaccionesDeUnidadACreditoTest(){
		assertTrue(17.0 == procesador.getTransaccionDeUnidadACreditos().get("Silver"));
		assertTrue(14450.0 == procesador.getTransaccionDeUnidadACreditos().get("Gold"));
		assertTrue(195.5 == procesador.getTransaccionDeUnidadACreditos().get("Iron"));
	}
}
