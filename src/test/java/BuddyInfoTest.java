import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyInfoTest {
    protected String name, address,phoneNumber;

    // assigning the values
    @Before
    public void setUp(){
        name = "Tom";
        address = "151 Barrow St";
        phoneNumber = "6135700772";
    }

    // test method to create a buddy
    @Test
    public void testAdd(){
        BuddyInfo buddy = new BuddyInfo(name,phoneNumber,address);
        assertNotNull(buddy);
    }

}