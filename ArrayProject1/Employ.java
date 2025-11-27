package src.ArrayProject1;

import java.util.Objects;

public class Employ {
    private String name;
    private int id;
    private int age;
    private double salary;

    Employ(){

    }

    public Employ(String name, int id, int age, double salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employ employ = (Employ) o;
        return id == employ.id && age == employ.age && Double.compare(salary, employ.salary) == 0 && Objects.equals(name, employ.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age, salary);
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
