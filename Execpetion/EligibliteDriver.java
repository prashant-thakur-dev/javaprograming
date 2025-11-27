package src.Execpetion;

public class EligibliteDriver {
    public static void main(String[] args) {
        try {
            Registration.checkEligibility(15);
        } catch (UnderAgeExeception e) {
            System.out.println("there is an exeception");
            e.printStackTrace();
        }
    }
}
