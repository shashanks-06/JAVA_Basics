package AUGUST.ex_11082024;

public class RealTimeInheritance {
    public static void main(String[] args) {
    BaseClass t1 = new TestCase1();     // Dynamic Dispatch // Runtime
//  t1.setBrowser("Opera", true); // USE THIS  // -> no need to use as we used setBrowser function in TestCase1 constructor
    t1.openBrowser();
    t1.openBrowser("Brave");
    t1.closeBrowser();

    }
}

//  SINGLE INHERITANCE
class TestCase1 extends BaseClass{
    // TestCase is A Type of BaseClass - Single Inheritance
    TestCase1(){
        super();        // DC of Parent (BaseClass)
        this.setBrowser("Edge", true);// OR USE THIS  // this is calling own overridden function setBrowser

    }

    // Method Overriding of parent method (setBrowser)
    @Override
    public void setBrowser(String browser, boolean isAuth){
        super.setBrowser(browser, isAuth);
    }
}


class BaseClass{

    // DC &  PC CONSTRUCTOR
    BaseClass(){
        System.out.println("DC - BaseClass");
    }
    BaseClass(String a){
        System.out.println("PC - BaseClass");
    }

    // GETTER AND SETTER METHODS
    private String browser;

    public String getBrowser(){
        return this.browser;
    }
    public void setBrowser(String browser, boolean isAuth){
        if (isAuth){
            this.browser = browser;
        }else {
            System.out.println("Not Allowed");
        }
    }

    // METHOD OVERLOADING
    public void openBrowser(){
        System.out.println("Opening the Browser");
    }

    public void openBrowser(String a){
        System.out.println("Opening the " + a);
    }

    public void closeBrowser(){
        System.out.println("Closing the Browser");
    }
}
