import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;

class BonusServiceTest {

	@Test
	void ValidaValoresAbaixoDoLimiteParaOBonus() {
		BonusService bonus = new BonusService();
		BigDecimal salario = bonus.calcularBonus(new Funcionario("Otavio", LocalDate.now(), new BigDecimal("8000")));

		assertEquals(new BigDecimal("800.00"), salario);
	}

	@Test
	void ValidaValoresAcimaDoLimiteParaOBonus() {
		BonusService bonus = new BonusService();
		BigDecimal salario = bonus.calcularBonus(new Funcionario("Otavio", LocalDate.now(), new BigDecimal("25000")));

		assertEquals(new BigDecimal("0.00"), salario);
	}

	@Test
	void ValidaValoresIgualAoLimiteParaOBonus() {
		BonusService bonus = new BonusService();
		BigDecimal salario = bonus.calcularBonus(new Funcionario("Otavio", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.00"), salario);
	}

}
