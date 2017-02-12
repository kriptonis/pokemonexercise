package pt.premium.recruitment.ricardojafe;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({PokemonTest.class})
public class PokemonTestSuite {
	   public static void main(String[] args) {
		      Result result = JUnitCore.runClasses(PokemonTestSuite.class);

		      for (Failure failure : result.getFailures()) {
		         System.out.println(failure.toString());
		      }
		      System.out.println("The Suite was run with: "+((result.wasSuccessful()) ? "success" : "failures."));
		   }
}
