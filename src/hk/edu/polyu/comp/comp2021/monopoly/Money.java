package hk.edu.polyu.comp.comp2021.monopoly;

/**
 * Created by Isaac Shi
 */
public class Money {
	private int money;

	/**
	 *  : This a description
	 */
	//public Money() {
	//	this(0);
	//}

	/**
	 *
	 * @param money : This a description
	 */
	public Money(int money) {
		this.money = money;
	}

	/**
	 *
	 * @return : This a description
	 */
	public int getMoney() {
		return money;
	}

	/**
	 *
	 * @param amount : This a description
	 */
	public void addMoney(int amount) {
		money += amount;
	}

	/**
	 *  : This a description
	 */
	public void taxMoney(){
		final double TAXRENT = 0.9;
		if(money%10 == 0) {
			money *= TAXRENT;
		}else{
			int x = money%10;
			money -= money%10;
			money *= TAXRENT;
			money += x;
		}
	}

	/**
	 *
	 * @param amount : This a description
	 */
	public void substractMoney(int amount) {
		money -= amount;
	}

	/**
	 *
	 * @return : This a description
	 */
	public boolean isBrokeOut() {
		return money < 0;
	}
}
