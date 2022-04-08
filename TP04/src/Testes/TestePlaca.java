package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import View.TelaCadastrarCCA;

class TestePlaca {
TelaCadastrarCCA tcca = new TelaCadastrarCCA();
	@Test
	void testTesteplaca() {
		assertTrue(tcca.testeplaca("1234567"));
		assertFalse(tcca.testeplaca("123"));
	}
	

}
