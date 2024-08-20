package august.javaExtra.generics;

public class TClass {

    public static void main(String[] args) {
        Test<Integer> i1 = new Test<Integer>(6);
        System.out.println(i1.getObj());

        Test<Double> i2 = new Test<Double>(81.39);
        System.out.println(i2.getObj());

        Test<String> i3 = new Test<String>("Shashank");
        System.out.println(i3.getObj());
    }
}
class Test <T>{
    T obj;

    Test (T obj){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    };
}