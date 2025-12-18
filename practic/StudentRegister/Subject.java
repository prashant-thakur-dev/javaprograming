package src.practic.StudentRegister;

public class Subject {
    String java;
    String react;
    String sql;

    @Override
    public String toString() {
        return "Subject{" +
                "java='" + java + '\'' +
                ", react='" + react + '\'' +
                ", sql='" + sql + '\'' +
                '}';
    }

    Subject(String java, String react, String sql){
        this.java = java;
        this.react = react;
        this.sql = sql;
    }

}
