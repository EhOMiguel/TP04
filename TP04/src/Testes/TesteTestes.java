package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import View.TelaCadastrarPessoa;

class TesteTestes {
TelaCadastrarPessoa tcp = new TelaCadastrarPessoa();
	@Test
	void testTestes() {
		int teste1 = tcp.testes("miguelmsoliveira@", "12345678910", "10987654321");
		assertEquals(3, teste1);
		int teste2 = tcp.testes("miguelmsoliveira@gmail.com", "12345678910", "10987654321");
		assertEquals(3, teste2);
		int teste3 = tcp.testes("@miguelmsoliveira", "123456789", "123456");
		assertEquals(0, teste3);
	}
}
