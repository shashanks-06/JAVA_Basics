package august.ex_11082024.exRealLife;

public class FireFox extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Opening the FireFox....,         // This Code is related to FireFox only\n");
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the FireFox....,         // This Code is related to FireFox only\n");
        return "";
    }

    @Override
    void takeScreenShot() {
        System.out.println("Taking SS by FireFox");
    }
}
