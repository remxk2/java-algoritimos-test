package test.java.algoritmos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.algoritmos.Algoritmos;

class AlgoritmosTest {
	
	Algoritmos algoritmos = new Algoritmos();

	@Test
	void devera_trazer_o_total_de_numeros_menores_que_o_alvo() {
		List<Integer> test1 = List.of(7, 8, 7, 8, 7, 8, 6, 3, 4, 8);
		List<Integer> test2 = List.of(4, 4, 7, 2, 4, 7, 6, 7, 8, 4);
		List<Integer> test3 = List.of(8, 3, 9, 7, 1, 1, 8, 6, 7, 2);
		List<Integer> test4 = List.of(4, 6, 6, 8, 9, 9, 4, 6, 3, 2);
		
		assertEquals(algoritmos.numerosMenores(test1, 2), 0);
		assertEquals(algoritmos.numerosMenores(test2, 4), 1);
		assertEquals(algoritmos.numerosMenores(test3, 8), 7);
		assertEquals(algoritmos.numerosMenores(test4, 6), 4);
	}
	
	@Test
	void devera_trazer_o_total_de_numeros_pares_e_impares() {
		List<Integer> test1 = List.of(7, 8, 7, 8, 7, 8, 6, 3, 4, 8);
		List<Integer> test2 = List.of(4, 4, 7, 2, 4, 7, 6, 7, 8, 4);
		List<Integer> test3 = List.of(8, 3, 9, 7, 1, 1, 8, 6, 7, 2);
		List<Integer> test4 = List.of(4, 6, 6, 8, 9, 9, 4, 6, 3, 2);
		
		assertEquals(algoritmos.numerosParesEimpares(test1), List.of(6, 4));
		assertEquals(algoritmos.numerosParesEimpares(test2), List.of(7, 3));
		assertEquals(algoritmos.numerosParesEimpares(test3), List.of(4, 6));
		assertEquals(algoritmos.numerosParesEimpares(test4), List.of(7, 3));
		
	}
	
	@Test
	void devera_trazer_o_total_joias_entre_as_pedras() {
		assertEquals(algoritmos.joias("fmRXa", "sresjzwRlaTcizXBJYjX"), 3);
		assertEquals(algoritmos.joias("OYjUa", "PTmnikZHUsXMJifkBnMY"), 2);
		assertEquals(algoritmos.joias("bVfFN", "iNeRtkDthBNMRyRvtBmR"), 1);
		assertEquals(algoritmos.joias("wNzbP", "PpdrGFeKzfHdEbvjXPSV"), 3);
	}
	
	@Test
	void devera_remover_todas_as_letras_duplicadas() {
		assertEquals(algoritmos.removerLetrasDuplicadas("GyWYCpbGJslgzzFwGtQEEAaJMrbpGayPIIUtICck"), "GyWCpbJslzFtQEAMrIUk");
		assertEquals(algoritmos.removerLetrasDuplicadas("zCUOUeZoejUXXVNFrLSQOMQpGaLuEFOTRUFHcrQW"), "zCUOejXVNFrLSQMpGaTHW");
		assertEquals(algoritmos.removerLetrasDuplicadas("vhiwUEGvIXbGOCkhYQFMOhdFklMJlgkmVubtWWbA"), "vhiwUEGXbOCkYQFMdlJtA");
		assertEquals(algoritmos.removerLetrasDuplicadas("vRJYVRpKFKwaIYkqlkpxlfZQWCHPtXXMLPZLLGRV"), "vRJYpKFwaIqlxZCHtMG");
	}
	
	
	@Test
	void devera_retornar_itens_nas_casas_25_50_75_porcento() {
		List<Integer> test1 = List.of(7, 10, 6, 4, 9, 1, 3, 7, 8, 7, 7, 4, 10, 5, 10, 7, 5, 3, 2, 6);
		List<Integer> test2 = List.of(1, 3, 9, 2, 2, 6, 9, 3, 10, 10, 7, 2, 3, 6, 3, 1, 2, 10, 9, 1);
		List<Integer> test3 = List.of(7, 8, 10, 7, 8, 4, 10, 2, 9, 3, 10, 1, 7, 4, 1, 9, 3, 8, 8, 7);
		List<Integer> test4 = List.of(4, 4, 8, 7, 7, 4, 9, 1, 9, 9, 2, 10, 2, 9, 10, 4, 3, 6, 9, 5);
		
		assertEquals(algoritmos.encontrarItem(test1), List.of(1, 7, 7));
		assertEquals(algoritmos.encontrarItem(test2), List.of(6, 7, 1));
		assertEquals(algoritmos.encontrarItem(test3), List.of(4, 10, 9));
		assertEquals(algoritmos.encontrarItem(test4), List.of(4, 2, 4));
	}
	
	

}
