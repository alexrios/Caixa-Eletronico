package test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class CaixaEletronicoTest {
	
	CaixaEletronico caixaEletronico;
	
	@Before
	public void setup(){
		caixaEletronico = new CaixaEletronico();
	}
	
	@Test
	public void test_saca_10() {
		HashMap<String, Integer> saque = caixaEletronico.sacar(10);
		assertEquals(Integer.valueOf(1), saque.get("10"));
	}
	
	@Test
	public void test_saca_20() {		
		HashMap<String, Integer> saque = caixaEletronico.sacar(20);
		assertEquals(Integer.valueOf(1), saque.get("20"));
	}

	@Test
	public void test_saca_30() {
		HashMap<String, Integer> saque = caixaEletronico.sacar(30);
		assertEquals(Integer.valueOf(1), saque.get("10"));
		assertEquals(Integer.valueOf(1), saque.get("20"));
	}
	
	@Test
	public void test_saca_50() {
		HashMap<String, Integer> saque = caixaEletronico.sacar(50);
		assertEquals(Integer.valueOf(1), saque.get("50"));
	}

	@Test
	public void test_saca_80() {
		HashMap<String, Integer> saque = caixaEletronico.sacar(80);
		assertEquals(Integer.valueOf(1), saque.get("10"));
		assertEquals(Integer.valueOf(1), saque.get("20"));
		assertEquals(Integer.valueOf(1), saque.get("50"));
	}
	
	@Test
	public void test_saca_100() {
		HashMap<String, Integer> saque = caixaEletronico.sacar(100);
		assertEquals(Integer.valueOf(1), saque.get("100"));
	}
	
	@Test
	public void test_saca_120() {
		HashMap<String, Integer> saque = caixaEletronico.sacar(120);
		assertEquals(Integer.valueOf(1), saque.get("20"));
		assertEquals(Integer.valueOf(1), saque.get("100"));
	}

	@Test
	public void test_saca_2320() {
		HashMap<String, Integer> saque = caixaEletronico.sacar(2320);
		assertEquals(Integer.valueOf(23), saque.get("100"));
		assertEquals(Integer.valueOf(1), saque.get("20"));
	}

}