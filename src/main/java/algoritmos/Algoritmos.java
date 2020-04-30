package main.java.algoritmos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algoritmos {
	
	public int numerosMenores(List<Integer> valores, Integer target) {
		/* 
		 * Você recebera um array que contem apenas números inteiros e ira receber um numero alvo.
		 * Calcule quantos números do array são menores que o numero alto.
		 * Exemplo: Array[3, 6, 1, 0, 10, 8], Alvo: 5
		 * O resultado deverá retornar 3 pois apenas os números 3, 1 e 0 são menores que 5
		 */
		
		/* Algoritmo aqui */
		Integer total = 0;
		for(Integer valor: valores) if(valor < target) total++;
		

		return total;
	}
	
	public List<Integer> numerosParesEimpares(List<Integer> valores) {
		/* Você recebera um array que contem apenas números inteiro.
		 * Calcule quantos números do array são pares e quantos são ímpares.
		 * Exemplo: Array[3, 6, 1, 0, 10, 8]
		 * O resultado deverá retornar uma lista contendo dois valores [4, 2], 4 pares, 2 ímpares, 0 podem ser contados como pares.
		 */
		List<Integer> resultado = new ArrayList<Integer>();
		Integer pares = 0;
		Integer impares = 0;
		for(Integer valor: valores) {
			if(valor % 2 == 0) pares++; 
			else impares++;
		}
		
		resultado.add(pares);
		resultado.add(impares);

		return resultado;
	}
	
	public int joias(String jewels, String stones) {
		/* Você recebera duas strings, a primeira são quais pedras são jóias e a segunda é quais pedras você tem.
		 * Cada letra corresponde a uma jóia/pedra.
		 * Calcule quantas jóias existem entre as pedras.
		 * Exemplo: jóias =  "aA", pedras = "bbBBcCCDDaA"
		 * O resultado deverá retornar 2 pois "a" e "A" são jóias, e no meio das pedras podemos notar que existe um "aA" bem no final.
		 */
		
		List<String> j = Arrays.asList(jewels.split(""));
		List<String> s = Arrays.asList(stones.split(""));
		Integer total = 0;
		for(String joia: j) {
			if(s.contains(joia)) total++;
		}
		
		
		return total;
	}
	
	public String removerLetrasDuplicadas(String letras) {
		/* Você recebera uma string com varias letras aleatórias.
		 * Remova todas as letras duplicadas e retorne o resultado.
		 * Letras maiúsculas e minúsculas são consideradas iguais.
		 * Exemplo: string = "GyWYCpbGJslgzzFwGtQEEAaJMrbpGayPIIUtICck"
		 * O resultado deverá retornar "GyWCpbJslzFtQEAMrIUk".
		 */

		List<String> l = Arrays.asList(letras.split(""));
		List<String> found = new ArrayList<String>();

		for(String letra: l) {
			if(!found.contains(letra.toUpperCase()) && !found.contains(letra.toLowerCase())) found.add(letra);
		}
		
		
		return String.join("", found);
	}
	
	
	public List<Integer> encontrarItem(List<Integer> valores) {
		/* Você recebera uma lista com n numeros.
		 * Retorne os itens que estão nas posições 25%, 50% e 75% do array.
		 * Decimais devem arrendodar para o valor mais proximo para cima, exp: 2.5 arrendonda para 3, 5.3 arredonda para 6.
		 * Exemplo: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		 * O resultado deverá retornar [3, 5, 8].
		 */

		Integer len = valores.size();
		Integer a = (int) Math.ceil(len * 0.25);
		Integer b = (int) Math.ceil(len * 0.50);
		Integer c = (int) Math.ceil(len * 0.75);
		
		return List.of(valores.get(a), valores.get(b), valores.get(c));
	}

}
