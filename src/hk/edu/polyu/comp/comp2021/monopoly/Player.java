package hk.edu.polyu.comp.comp2021.monopoly;

/**
 * Create by Isaac Shi
 */
public class Player {
	private int totalWalk = 0;
	private int position = 0;
	private int id;
	private String name;
	private boolean brokeout = false;
	private boolean isAI = false;
	private final int STARTMONEY = 1500;
	private Money money = new Money(STARTMONEY);
	private int firstToss;
	private int secondToss;
	private int thirdToss;
	private int tossCount;

	/**
	 *
	 * @param id : This a description
	 * @param name : This a description
	 */
	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 *
	 * @return : This a description
	 */
	public int getTotalWalk() {
		return totalWalk;
	}

	/**
	 * @param ioservice : This a description
	 * @param die : This a description
	 * @return : This a description
	 */
	public int tossDie(Die die, IOService ioservice) {
		int face = die.getFace();
		ioservice.printConsole(this, getName() + " toss a die... Face is " + face);
		return face;
	}

	/**
	 *
	 * @return : This a description
	 */
	public int getCurrentPosition() {
		return position;
	}

	/**
	 *
	 * @param position : This a description
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 *  : This a description
	 */
	public void nextTurn() {
		totalWalk++;
	}

	/**
	 *
	 * @return : This a description
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @return : This a description
	 */
	public Money getMoney() {
		return money;
	}

	/**
	 *  : This a description
	 * @return : This a description
	 */
	public int getID() {
		return id;
	}

	/**
	 *  : This a description
	 * @return : This a description
	 */
	public boolean getAI(){
		return isAI;
	}

	/**
	 *
	 * @param x : This a description
	 */
	public void setAI(boolean x){
		this.isAI = x;
	}

	/**
	 *
	 * @param brokeout : This a description
	 * @param board : This a description
	 */
	public void setBrokeOut(boolean brokeout, Board board) {
		int playerID = this.getID();
		this.brokeout = brokeout;
		this.setUnown(playerID, board);
	}
	/**
	 *  : This a description
	 * @return : This a description
	 */
	public boolean isBrokeOut() {
		return brokeout;
	}

	/**
	 *
	 * @param playerID : This a description
	 * @param board : This a description
	 */
	public void setUnown(int playerID, Board board){
		final int OWN_NO = 20;
		for(int i = 0; i < OWN_NO; i++){
			if(board.getSquares(i) instanceof HouseSquare){
				if(board.getSquares(i).getOwner() == playerID) {board.getSquares(i).setOwner(-1); }
			}
		}
	}

	/**
	 *  : This a description
	 */
	public void setUnown(){

	}

	/**
	 *  : This a description
	 * @return first : This a description
	 */
	public int getFirstToss(){
		return this.firstToss;
	}
	/**
	 *  : This a description
	 * @return : This a description
	 */
	public int getSecondToss(){
		return this.secondToss;
	}
	/**
	 *  : This a description
	 * @return : This a description
	 */
	public int getThridToss(){
		return this.thirdToss;
	}
	/**
	 *  : This a description
	 * @return : This a description
	 */
	public int getTossCount(){
		return this.tossCount;
	}
	/**
	 *
	 * @param first : This is description
	 */
	public void setFirstToss(int first){
		this.firstToss = first;
	}
	/**
	 *  : This a description
	 * @param second : This is description
	 */
	public void setSecondToss(int second){
		this.secondToss = second;
	}
	/**
	 *  : This a description
	 *  @param third : This is description
	 */
	public void setThirdToss(int third){
		this.thirdToss = third;
	}
	/**
	 *  : This a description
	 *  @param count : This is description
	 */
	public void setTossCount(int count){
		this.tossCount = count;
	}

}
