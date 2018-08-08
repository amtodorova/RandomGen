import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
	public static void main(String[] args) {

		String[] presiOrder = { "Comms", "Websites/ABP.org", "ABP UI", "Mobile", "Circumvention", "AA Partners",
				"AA Distribution Partners", "AAX", "Service Team", "Admin Team" };

		Collections.shuffle(Arrays.asList(presiOrder));
		System.out.println(Arrays.toString(presiOrder));

	}
}
