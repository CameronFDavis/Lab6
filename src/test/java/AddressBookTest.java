import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AddressBookTest {
    protected ArrayList<BuddyInfo> Buddies;

    // assigning the values
    @Before
    public void setUp(){
        Buddies = new ArrayList<>();
    }

    // test method to add a buddy to the list
    @Test
    public void testAdd(){
        BuddyInfo buddy = new BuddyInfo("Tom", "6135700772", "151 Barrow St",true);
        Buddies.add(buddy);
        assertTrue(Buddies.get(0)==buddy);

    }

}