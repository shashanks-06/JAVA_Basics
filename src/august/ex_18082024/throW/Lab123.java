package august.ex_18082024.throW;

import java.util.Scanner;

public class Lab123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();

        if (name.equalsIgnoreCase("Shashank")){
            try {
                throw  new Exception("Not allowed");
            } catch (Exception e) {
                System.out.println("Exception !!");
            }
        }else {
            System.out.println("Allowed");
        }
    }
}

/*
  Used to handle the exception
 -> THROWS and TRY n CATCH BLOCK

 Used to create the Exception
 ->  THROW


*/

