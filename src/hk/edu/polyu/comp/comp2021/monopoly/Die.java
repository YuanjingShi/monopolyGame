package hk.edu.polyu.comp.comp2021.monopoly;
import java.util.Random;

/**
 *  : This a description
 */
public class Die {
	/**
	 *
	 * @return : This a description
	 */
	public int getFace() {
		Random rand = new Random();
		int face = 1+rand.nextInt(4);
		return face;
	}
}
