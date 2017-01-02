package hk.edu.polyu.comp.comp2021.test;
import hk.edu.polyu.comp.comp2021.monopoly.HouseSquare;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Isaac on 2016/12/3.
 */
public class HouseSquareTest {
    private HouseSquare house;
    private final int HOUSE_NO = 200;

    /**
     * This is the description
     * @throws Exception :This is the description
     */
    @Before
    public void setUp() throws Exception {
        house = new HouseSquare("Polyu", HOUSE_NO,10);
    }

    /**
     * This is the description
     * @throws Exception :This is the description
     */
    @Test
    public void setOwner() throws Exception {
        house.setOwner(3);
        int test = house.getOwner();
        assertEquals(3,test);
    }

}