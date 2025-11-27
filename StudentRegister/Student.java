package src.StudentRegister;

public class Student {
    String name;
    String uid;
    Address address;
    Subject subject;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", uid='" + uid + '\'' +
                ", address=" + address +
                ", subject=" + subject +
                '}';
    }

    Student(String name, String uid, Address address, Subject subject){
        this.name = name;
        this.uid = uid;
        this.address = address;
        this.subject = subject;
    }
}
