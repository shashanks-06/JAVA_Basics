package ex_27072024;

public class Lab071 {
    public static void main(String[] args) {
        // Strings - immutable in nature
        String s1 = "John";     // Both String will be present , only the references will change
        s1 = "Doe";             // First "s1" ref to "John" , now to "Doe"

        // StringBuilder , StringBuffer
        StringBuffer stringBuffer = new StringBuffer("John");
        stringBuffer.append("Doe");     // Here, 'John' will be get deleted and stringBuffer now assigned to 'JohnDoe'
//        StringBuffer.append("Ji");    // Not possible to append again -> non-static method append(java.lang.String) cannot be referenced from a static context

        StringBuilder stringBuilder = new StringBuilder("John");
        stringBuilder.append("Doe");    // Here, 'John' will be get deleted and stringBuffer now assigned to 'JohnDoe'
        stringBuilder.append("Ji");
        // Thread Safety?

//        stringBuilder -> Not Thread Safe - People Love it for Performance
//        Extra Functionalities in case of StringBuilder
        System.out.println(stringBuilder.reverse().toString());


//        Feature       |      StringBuffer           |       StringBuilder
//  -------------------------------------------------------------------------
//     Thread Safety    |    Not Synchronized         |        Synchronized
//     Performance      |        Fast                 |           Slow

    }
}
