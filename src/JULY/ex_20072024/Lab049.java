package JULY.ex_20072024;

public class Lab049 {
    public static void main(String[] args) {

        int a = 10;                     // Supported
        switch (a) {

        }

        char ch = 'A'; // 65                // Supported
        switch (ch) {
        }

//        boolean b = true;             // Not Supported
//        switch (b) {
//        }

        long a11 = 30l;                 // Supported
        switch ((int) a11) {
        }

            int b = 98;
            switch (b) {
                case 98:
                    System.out.println("Val - 98");
//            case 98:                                  // Two condition with same name not possible
//                System.out.println("Val - 98");
            }


    }
}
