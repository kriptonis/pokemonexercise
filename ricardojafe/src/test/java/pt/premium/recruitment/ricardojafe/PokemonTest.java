package pt.premium.recruitment.ricardojafe;

import static org.junit.Assert.*;

import org.junit.Test;

public class PokemonTest {

	@Test
	public void testCatchPokemon() {
		String input = "E";
		int result = Pokemon.catchPokemon(input);
		System.out.println("Running test: testCatchPokemon()");
		System.out.println("For input "+input+" the result was: "+result+" pokemon");
		assertEquals(2, result);
	}
	
	@Test
	public void testCatchPokemon2() {
		String input = "NESO";
		int result = Pokemon.catchPokemon(input);
		System.out.println("Running test: testCatchPokemon2()");
		System.out.println("For input "+input+" the result was: "+result+" pokemon");
		assertEquals(4, result);
	}
	
	@Test
	public void testCatchPokemon3() {
		String input = "NSNSNSNSNS";
		int result = Pokemon.catchPokemon("NSNSNSNSNS");
		System.out.println("Running test: testCatchPokemon3()");
		System.out.println("For input "+input+" the result was: "+result+" pokemon");
		assertEquals(2, result);
	}
	
	@Test
	public void testCatchPokemonNonValidChars() {
		String input = "BANANA!";
		int result = Pokemon.catchPokemon("BANANA!");
		System.out.println("Running test: testCatchPokemonNonValidChars()");
		System.out.println("For input "+input+" the result was: "+result+" pokemon");
		assertEquals(3, result);
	}
	
	@Test
	public void testCatchPokemonNonValidChars2() {
		String input = "%&74ud";
		int result = Pokemon.catchPokemon("%&74ud");
		System.out.println("Running test: testCatchPokemonNonValidChars2()");
		System.out.println("For input "+input+" the result was: "+result+" pokemon");
		assertEquals(1, result);
	}

	@Test
	public void testCatchPokemonPartialBacktrack() {
		String input = "NNNEEEOO";
		int result = Pokemon.catchPokemon("NNNEEEOO");
		System.out.println("Running test: testCatchPokemonPartialBacktrack()");
		System.out.println("For input "+input+" the result was: "+result+" pokemon");
		assertEquals(7, result);
	}
	
	@Test
	public void testCatchPokemonNoMoves() {
		String input = "";
		int result = Pokemon.catchPokemon("");
		System.out.println("Running test: testCatchPokemonNoMoves()");
		System.out.println("For input '"+input+"' the result was: "+result+" pokemon");
		assertEquals(1, result);
	}
	
	@Test
	public void testCatchPokemonNullMoves() {
		String input = null;
		int result = Pokemon.catchPokemon(null);
		System.out.println("Running test: testCatchPokemonNullMoves()");
		System.out.println("For input "+input+" the result was: "+result+" pokemon");
		assertEquals(1, result);
	}
}
