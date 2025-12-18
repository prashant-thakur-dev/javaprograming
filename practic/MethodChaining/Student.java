package src.practic.MethodChaining;

public class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Student s)) return false;
        return this.id == s.id && this.name.equals(s.name);
    }
}

// it is achieve by '.' operator
