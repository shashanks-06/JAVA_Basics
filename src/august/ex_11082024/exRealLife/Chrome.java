package august.ex_11082024.exRealLife;

public class Chrome extends BaseClass {

    @Override
    String openBrowser(String browser) {
        System.out.println("Opening the Chrome....,         // This Code is related to Chrome only\n");
        return "Ok Opening the Chrome\n";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the Chrome....,         // This Code is related to Chrome only\n");
        return "Ok Closing the Chrome\n";
    }

    @Override
    void takeScreenShot() {
        System.out.println("Taking SS by Chrome\n");
    }
}
