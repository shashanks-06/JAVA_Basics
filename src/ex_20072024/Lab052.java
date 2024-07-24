package ex_20072024;

public class Lab052 {
    public static void main(String[] args) {
        // JDK -> 13

        char code = 'A';

        int val = switch (code){
            case 'A':
                yield  65;  // return
            case 'B':
                yield  66;
            default:
                throw new IllegalStateException("Unexpected Error: "+ code);

        };
        System.out.println(val);

    }
}
