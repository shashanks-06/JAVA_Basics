package august.ex_18082024.throW;

public class Lab125 {
    public static void main(String[] args) {
        String s = null;

        try {
            if(s == null){
                throw new Exception("Add a proper String or not null String");
            }
            s.trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
