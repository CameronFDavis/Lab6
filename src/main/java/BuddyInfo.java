public class BuddyInfo {

    private String name;
    private String phoneNumber;
    private String address;

    public BuddyInfo(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String toString(){
        return name+" "+phoneNumber+" "+address;
    }


}
