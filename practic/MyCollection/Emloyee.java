package src.practic.MyCollection;

public class Emloyee implements Comparable<Emloyee>{
    int id;
    String name;
    double salary;

    public Emloyee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emloyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Emloyee emloyee) {
        return this.id-emloyee.id;
    }
}
