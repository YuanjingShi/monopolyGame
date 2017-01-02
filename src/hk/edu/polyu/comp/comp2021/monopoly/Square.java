package hk.edu.polyu.comp.comp2021.monopoly;

/**
 * Created By Isaac Shi
 */
public abstract class Square {
	private String name;
	private int owner = -1;

	/**
	 *
	 * @param name : This is description
	 */
	public Square(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return : This is description
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @return : This a description
	 */
	public int getOwner(){return owner;}

	/**
	 *
	 * @param owner : This a description
	 */
	public void setOwner(int owner){this.owner = owner;}

	/**
	 * @param ioservice : This a description
	 * @param player : This is description
	 * @param board : This is description
	 */
	public abstract void squareMove(Player player, Board board, IOService ioservice);
}
