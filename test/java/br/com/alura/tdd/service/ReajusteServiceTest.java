package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class ReajusteServiceTest {

	@Test
	void reajusteAbaixoSeDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("João", LocalDate.now(), new BigDecimal("1000.00"));

		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());

	}

	@Test
	void reajusteMédioSeDesempenhoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("João", LocalDate.now(), new BigDecimal("1000.00"));

		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());

	}

	@Test
	void reajusteAltoSeDesempenhoForOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("João", LocalDate.now(), new BigDecimal("1000.00"));

		service.concederReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1300.00"), funcionario.getSalario());

	}

}
