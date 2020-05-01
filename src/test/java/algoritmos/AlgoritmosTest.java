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
		
		assertEquals(0, algoritmos.numerosMenores(test1, 2));
		assertEquals(1, algoritmos.numerosMenores(test2, 4));
		assertEquals(7, algoritmos.numerosMenores(test3, 8));
		assertEquals(4, algoritmos.numerosMenores(test4, 6));
	}
	
	@Test
	void devera_trazer_o_total_de_numeros_pares_e_impares() {
		List<Integer> test1 = List.of(7, 8, 7, 8, 7, 8, 6, 3, 4, 8);
		List<Integer> test2 = List.of(4, 4, 7, 2, 4, 7, 6, 7, 8, 4);
		List<Integer> test3 = List.of(8, 3, 9, 7, 1, 1, 8, 6, 7, 2);
		List<Integer> test4 = List.of(4, 6, 6, 8, 9, 9, 4, 6, 3, 2);
		
		assertEquals(List.of(6, 4), algoritmos.numerosParesEimpares(test1));
		assertEquals(List.of(7, 3), algoritmos.numerosParesEimpares(test2));
		assertEquals(List.of(4, 6), algoritmos.numerosParesEimpares(test3));
		assertEquals(List.of(7, 3), algoritmos.numerosParesEimpares(test4));
		
	}
	
	@Test
	void devera_trazer_o_total_joias_entre_as_pedras() {
		assertEquals(3, algoritmos.joias("fmRXa", "sresjzwRlaTcizXBJYjX"));
		assertEquals(2, algoritmos.joias("OYjUa", "PTmnikZHUsXMJifkBnMY"));
		assertEquals(1, algoritmos.joias("bVfFN", "iNeRtkDthBNMRyRvtBmR"));
		assertEquals(3, algoritmos.joias("wNzbP", "PpdrGFeKzfHdEbvjXPSV"));
	}
	
	@Test
	void devera_remover_todas_as_letras_duplicadas() {
		assertEquals("GyWCpbJslzFtQEAMrIUk", algoritmos.removerLetrasDuplicadas("GyWYCpbGJslgzzFwGtQEEAaJMrbpGayPIIUtICck"));
		assertEquals("zCUOejXVNFrLSQMpGaTHW", algoritmos.removerLetrasDuplicadas("zCUOUeZoejUXXVNFrLSQOMQpGaLuEFOTRUFHcrQW"));
		assertEquals("vhiwUEGXbOCkYQFMdlJtA", algoritmos.removerLetrasDuplicadas("vhiwUEGvIXbGOCkhYQFMOhdFklMJlgkmVubtWWbA"));
		assertEquals("vRJYpKFwaIqlxZCHtMG", algoritmos.removerLetrasDuplicadas("vRJYVRpKFKwaIYkqlkpxlfZQWCHPtXXMLPZLLGRV"));
	}
	
	
	@Test
	void devera_retornar_itens_nas_casas_25_50_75_porcento() {
		List<Integer> test1 = List.of(7, 10, 6, 4, 9, 1, 3, 7, 8, 7, 7, 4, 10, 5, 10, 7, 5, 3, 2, 6);
		List<Integer> test2 = List.of(1, 3, 9, 2, 2, 6, 9, 3, 10, 10, 7, 2, 3, 6, 3, 1, 2, 10, 9, 1);
		List<Integer> test3 = List.of(7, 8, 10, 7, 8, 4, 10, 2, 9, 3, 10, 1, 7, 4, 1, 9, 3, 8, 8, 7);
		List<Integer> test4 = List.of(4, 4, 8, 7, 7, 4, 9, 1, 9, 9, 2, 10, 2, 9, 10, 4, 3, 6, 9, 5);
		
		assertEquals(List.of(1, 7, 7), algoritmos.encontrarItem(test1));
		assertEquals(List.of(6, 7, 1), algoritmos.encontrarItem(test2));
		assertEquals(List.of(4, 10, 9), algoritmos.encontrarItem(test3));
		assertEquals(List.of(4, 2, 4), algoritmos.encontrarItem(test4));
	}
	
	@Test
	void devera_retornar_string_em_formato_titulo() {
		assertEquals("O Rato Roeu A Roupa Do Rei De Roma", algoritmos.TitleName("o rato roeu a roupa do rei de roma"));
		assertEquals("Quem A Seu Inimigo Poupa, Nas Mãos Lhe Morre", algoritmos.TitleName("quem a seu inimigo poupa, nas mãos lhe morre"));
		assertEquals("Quem Com Cães Se Deita, Com Pulgas Se Levanta", algoritmos.TitleName("quem com cães se deita, com pulgas se levanta"));
		assertEquals("Quem Diz O Que Quer, Ouve O Que Não Quer", algoritmos.TitleName("quem diz o que quer, ouve o que não quer"));

	}
	
	@Test
	void devera_retornar_a_menor_diferenca_entre_os_digitos() {
		List<Integer> test1 = List.of(9, 50, 21, 100, 81, 83, 89, 32, 48, 4, 93, 41, 22, 80, 3, 37, 2, 90, 46, 88);
		List<Integer> test2 = List.of(50, 77, 57, 59, 45, 96, 8, 57, 67, 41, 43, 22, 24, 97, 31, 81, 39, 68, 32, 82);
		List<Integer> test3 = List.of(45, 45, 25, 86, 40, 19, 96, 5, 71, 14, 32, 33, 90, 20, 50, 98, 95, 15, 27, 15);
		List<Integer> test4 = List.of(83, 72, 91, 53, 55, 97, 8, 39, 27, 89, 79, 51, 91, 43, 39, 78, 66, 26, 28, 51);
		List<Integer> test5 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		assertEquals(List.of(21, 22, 1), algoritmos.menorDiferenca(test1));
		assertEquals(List.of(96, 97, 1), algoritmos.menorDiferenca(test2));
		assertEquals(List.of(19, 20, 1), algoritmos.menorDiferenca(test3));
		assertEquals(List.of(27, 26, 1), algoritmos.menorDiferenca(test4));
		assertEquals(List.of(1, 2, 1), algoritmos.menorDiferenca(test5));

	}
	
	
	

}
