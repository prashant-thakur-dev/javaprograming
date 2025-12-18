package src.practic.practice;

import java.util.Objects;

public class Circle {
    int r=1;
    int x=10;
    public void getArea(){
        System.out.println(Math.PI*r*r);
    }
    public static void getArea(int r){
        System.out.println(Math.PI*r*r);
    }
    @Override
    public String toString(){
        return "Radius is: "+ r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, x);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Circle c = (Circle) obj;
        return c.r == this.r && c.x == this.x;
    }

}
