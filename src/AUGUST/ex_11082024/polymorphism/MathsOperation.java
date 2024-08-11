package AUGUST.ex_11082024.polymorphism;

public class MathsOperation {
    // Encapsulation
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method Overloading
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    String add(String a, String b){
        return  a + b;
    }

    String add(String a, int b){
        return  a + b;
    }
}
