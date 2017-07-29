package colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {
	/**
	 * Usando o framework Collection Map
	 * @param args
	 */
	public static void main(String[] args){
		//CHAVE VALOR
		Map<String, String>	pais	=	new	HashMap<>();
		
		pais.put("BR", "Brasil");
		pais.put("RU", "R�ssia");
		pais.put("UE", "Uni�o Europeia");
		pais.put("FR", "Fran�a");
		pais.put("FR", "Fran�a");
		
		System.out.println(pais); //imprime oque esta dentro do map
		
		System.out.println(pais.containsKey("BR"));	//imprime se contem este �ndice
		System.out.println(pais.containsKey("AM"));
		
		System.out.println(pais.containsValue("Alemanha"));	//imprime se contem este valor
		System.out.println(pais.remove("BR")); //remove o valor deste �ndice
		System.out.println(pais.get("FR")); //retorna o conteudo da chave
		
		System.out.println();
		//recupera todas as chaves do map, N�O ACEITA CHAVE DUPLICADA
		Set<String>	keys	=	pais.keySet();
		for(String key : keys){	//imprime as que obter
			System.out.println(key + ":" + pais.get(key));	//imprime a chave e o conteudo dela
		}
	}
}
