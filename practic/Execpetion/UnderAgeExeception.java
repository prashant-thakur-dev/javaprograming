package src.practic.Execpetion;

public class UnderAgeExeception extends Exception{
    UnderAgeExeception(){

    }
    UnderAgeExeception(String msg){
        super(msg);
    }
}
