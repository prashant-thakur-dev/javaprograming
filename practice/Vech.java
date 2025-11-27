package src.practice;

public class Vech {
    String name;
    int tire;

    Vech(){
        System.out.println("no argument==================");
    }

    Vech(String name,int tire){
        this.name = name;
        this.tire = tire;
    }

    public void drive(){
        System.out.println("generic drive class+++++++++++++++++++++++");
    }
}
