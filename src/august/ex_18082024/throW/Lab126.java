package august.ex_18082024.throW;

public class Lab126 {
    public static void main(String[] args) {
        String s1 = "Shashank";     // same for equalsIgnoreCase --> shashank
        String s2 = "shashank";     // same for equalsIgnoreCase --> Shashank

        if (s1.equalsIgnoreCase(s2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}

// final -> constant
// finally -> block of code with the try and catch
// finalize -> Object class function - threading use case
