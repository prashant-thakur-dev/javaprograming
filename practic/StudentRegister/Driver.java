package src.practic.StudentRegister;

public class Driver {
    @Override
    public String toString() {
        return "Driver{}";
    }

    public static void main(String[] args) {
        Student s = new Student("Raj","20BCS5784",
                new Address("A-598", "Sector-19","Noida","UP", 201301),
                new Subject("Java is a programing lang", "React is a framework", "SQL is a Query language"));
        Student s2 = new Student("Raju","20BCS",
                new Address("A-598", "Sector-19","Noida","UP", 201301),
                new Subject("Java ", "React is a framework", "SQL is a Query language"));

        System.out.println(s);
        System.out.println(s2);
//        System.out.println("Name: "+s.name);
//        System.out.println("UId: "+s.uid);
//        System.out.println("===============================================");
//        System.out.println("Address Detail :");
//        System.out.println("House No.: "+s.address.houseNo);
//        System.out.println("Locality: "+s.address.locality);
//        System.out.println("City: "+s.address.city);
//        System.out.println("State: "+s.address.state);
//        System.out.println("PIN Code: "+s.address.pinCode);
//        System.out.println("===============================================");
//        System.out.println("Sublect Detail :");
//        System.out.println("Java: "+s.subject.java);
//        System.out.println("React: "+s.subject.react);
//        System.out.println("Sql: "+s.subject.sql);
    }
}
