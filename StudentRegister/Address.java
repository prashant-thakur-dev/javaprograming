package src.StudentRegister;

public class Address {
    String houseNo;
    String locality;
    String city;
    String state;
    int pinCode;

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }

    Address(String houseNo, String locality, String city, String state, int pinCode){
        this.houseNo = houseNo;
        this.locality = locality;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }



}
