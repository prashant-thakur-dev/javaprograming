package src.MethodChain;

public class Student {
    private String name;
    private int age;

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Student display(){
        System.out.println("Name: " + name + " Age: "+ age);
        return this;
    }

}
