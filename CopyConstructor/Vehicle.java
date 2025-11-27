package src.CopyConstructor;

public class Vehicle {
    int vechId;
    String name;
    Vehicle(int vechId){
        this.vechId = vechId;
    }
    Vehicle(String name){
        this.name = name;
    }
    Vehicle(Vehicle v){
        this.name = v.name;
        this.vechId = v.vechId;
    }
    Vehicle(int vechId,String name){
        this(vechId);
        this.name = name;
    }
    Vehicle(Vehicle v2,String s){
        this(s);
        this.vechId = v2.vechId;
    }
}
