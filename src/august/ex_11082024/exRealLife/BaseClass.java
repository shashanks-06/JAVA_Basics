package august.ex_11082024.exRealLife;

abstract class BaseClass extends GrandBaseClass{
    // Web Automation
    // Single Inheritance
    // Hide the Functionality of the open and close Browser.

    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);

//    @Override
//    void takeScreenShot() {
//        System.out.println("Taking SS by Chrome");
//    }
    @Override
    void takeScreenShot(){
        System.out.println("Taking SS");
}
}
