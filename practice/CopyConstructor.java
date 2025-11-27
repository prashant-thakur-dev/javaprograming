package src.practice;

public class CopyConstructor {
    String name;
    String color;
    String taste;

    CopyConstructor(){
        System.out.println("no argument");
    }
    CopyConstructor(String name,String color){
        this();
        this.name = name;
        this.color = color;
    }
    CopyConstructor(String name,String color,String taste){
        this(name,color);
        this.taste = taste;
    }

    public CopyConstructor(CopyConstructor c) {
        this.name = c.name;
        this.color = c.color;
        this.taste = c.taste;
    }
}
