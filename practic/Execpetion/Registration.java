package src.practic.Execpetion;

public class Registration {
    public static void checkEligibility(int age) throws UnderAgeExeception{
        if(age >= 18){
            System.out.println("u are ok");
        }
        else {
            throw new UnderAgeExeception("not Eligible");
        }
    }
}
