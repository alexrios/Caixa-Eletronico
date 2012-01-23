package test;

import org.junit.Assert;
import org.junit.Test;

public class CaixaEletronicoTest {
	
	@Test
	public void test_saca_10() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		Assert.assertEquals("1 - 10", caixaEletronico.sacar(10));
	}
	
	@Test
	public void test_saca_20() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		Assert.assertEquals("1 - 20", caixaEletronico.sacar(20));
	}

	@Test
	public void test_saca_30() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		Assert.assertEquals("1 - 20, 1 - 10", caixaEletronico.sacar(30));
	}
	
	@Test
	public void test_saca_50() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		Assert.assertEquals("1 - 50", caixaEletronico.sacar(50));
	}

	@Test
	public void test_saca_80() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		Assert.assertEquals("1 - 50, 1 - 20, 1 - 10", caixaEletronico.sacar(80));
	}
	
	@Test
	public void test_saca_100() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		Assert.assertEquals("1 - 100", caixaEletronico.sacar(100));
	}
	
	@Test
	public void test_saca_120() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		Assert.assertEquals("1 - 100, 1 - 20", caixaEletronico.sacar(120));
	}

	@Test
	public void test_saca_2320() {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		Assert.assertEquals("23 - 100, 1 - 20", caixaEletronico.sacar(2320));
	}
	
	
	

}
