package src.practic.Encapluation;

public class VoterDriver {
    public static void main(String[] args) {
        Voter v1 = new Voter();
        v1.setAge(15);
        int age = v1.getAge();

        System.out.println(age);
    }
}
