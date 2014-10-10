package es.softwareprocess.bogopicgen;
import java.math.BigInteger;
import java.security.SecureRandom;

//this piece of code comes from: http://stackoverflow.com/questions/41107/how-to-generate-a-random-alpha-numeric-string
public final class RandomTextGen {
  private static SecureRandom random = new SecureRandom();

  public static String nextSessionId() {
    return new BigInteger(130, random).toString(32);
  }
}

