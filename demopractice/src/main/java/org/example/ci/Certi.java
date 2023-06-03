package org.example.ci;

public class Certi {
    private String name;
    Certi(String name){
        super();
        this.name = name;
    }

    @Override
//    public String toString() {
//        return "Certi{" +
//                "name='" + name + '\'' +
//                '}';
//    }
    public String toString(){
        return name;
    }
}
