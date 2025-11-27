package src.Object;

public class Student {
    String name;
    Student(String name){
        this.name = name;
        System.out.println(name+ " with constructor");
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Student s = (Student) obj;
        return this.name.equals(s.name);
    }

    public String toString(){
        return "Student name = "+name;
    }
}
