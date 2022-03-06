import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> Buddies;
    public AddressBook(){
        Buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy){
        if(aBuddy != null){
            Buddies.add(aBuddy);
        }
    }
    public BuddyInfo removeBuddy(int index){
        if(index >=0 && index < Buddies.size()){
            return Buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "6135700772", "151 Barrow St", true);
        BuddyInfo buddy1 = new BuddyInfo("James", "6135700766", "141 Barrow St", true);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.addBuddy(buddy1);
        for( BuddyInfo Buddy :addressBook.Buddies){
            System.out.println(Buddy.toString());
        }
    }
}

