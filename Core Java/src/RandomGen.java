import java.util.*;

public class RandomGen {

	public static void main(String[] args){
		
		Random random = new Random(System.nanoTime());

		  int randomInt = random.nextInt(10000000);
		  System.out.println(randomInt);
	}
}
