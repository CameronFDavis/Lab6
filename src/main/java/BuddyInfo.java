public class BuddyInfo {

    private String name;
    private String phoneNumber;
    private String address;
    private Boolean status;

    public BuddyInfo(String name, String phoneNumber, String address, Boolean status) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.status = status;
    }

    public String toString(){
        return name+" "+phoneNumber+" "+address+" "+status;
    }


}
