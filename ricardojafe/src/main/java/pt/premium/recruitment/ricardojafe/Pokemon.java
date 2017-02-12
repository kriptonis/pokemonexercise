package pt.premium.recruitment.ricardojafe;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Pokemon {

	/**
	 * Enunciado:
	 * "O Ash começa por apanhar o pokémon que está na casa onde começa.
	 * O programa deve ler uma linha do stdin, que contém uma sequência de movimentos.
	 * Cada movimento é descrito por uma letra N, S, E ou O (respetivamente: norte, sul, este, oeste)."
	 * 
	 * Documentaçãp da Implementação:
	 * Movimentos inválidos são ignorados e não contabilizados no numero total de pokemon.
	 * A casa inicial é contabilizada inicialmente, sendo que o jogador começa sempre com 1 pokemon.
	 * No entanto não é contabilizada de novo se o jogador voltar a passar pelo inicio.
	 * 
	 * A metáfora espacial é a de um plano matemático, infinitamente grande,
	 *  onde o jogador começa no centro do mesmo (coordenada 0,0 num eixo x,y).
	 *  
	 *  (normalmente escrevo a documentação/comentários/programação toda em ingles, escrevi esta parte em PT para
	 *  conformar com o enunciado, mas já tinha escrito o resto em EN)
	 * @param moves
	 * @return int - numero de pokemon que o Ashe apanhou!
	 */
	public static int catchPokemon(String moves){
		Set<String> pastCoordinatesSet = new LinkedHashSet<>();
		pastCoordinatesSet.add("00");//get that initial pokemon! Even if I don't move at all.
		int xCoord = 0;
		int yCoord = 0;
		if(moves == null)return pastCoordinatesSet.size();//compact form as this is simple null check
		
		for(int i = 0 ; i < moves.length() ; i++){
			switch(moves.toUpperCase().trim().charAt(i)){
				case 'N':yCoord++;break;//move along the y axis
				case 'S':yCoord--;break;//move along the y axis
				case 'E':xCoord++;break;//move along the x axis
				case 'O':xCoord--;break;//move along the x axis
				default:break;//just ignore invalid chars. Could write msg asking Ash "whatcha tryin to do" but maybe next sprint if needed.
			}
			pastCoordinatesSet.add(String.valueOf(xCoord)+String.valueOf(yCoord));//add pokemon to my collection! Duplicates not allowed! :)
		}
		return pastCoordinatesSet.size();//hey mom, look at all my pokemon!
	}
	
	public static void main(String[] args) {
		String gameOverMessage = "You've catched %d pokemon\n";
		
//		System.out.printf(gameOverMessage, catchPokemon("E")); //ans: 2
//		System.out.printf(gameOverMessage, catchPokemon("NESO"));//ans: 4
//		System.out.printf(gameOverMessage, catchPokemon("NNNN"));//ans: 5
//		System.out.printf(gameOverMessage, catchPokemon("NSNS"));//ans: 2
//		System.out.printf(gameOverMessage, catchPokemon("NSNSNSNSNS"));//ans: 2
//		System.out.printf(gameOverMessage, catchPokemon("BANANA!"));//ans: 3
//		System.out.printf(gameOverMessage, catchPokemon("NNNEEEOO"));//ans: 7
//		System.out.printf(gameOverMessage, catchPokemon(""));//ans: 1
//		System.out.printf(gameOverMessage, catchPokemon(null));//ans: 1
		
		Scanner scanner = new Scanner(System.in);
		String moves = scanner.nextLine();
		scanner.close();
		int pokemon = catchPokemon(moves);
		
		System.out.printf(gameOverMessage, pokemon);
	}

}
