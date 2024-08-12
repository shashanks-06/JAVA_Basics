package august.ex_04082024.singleInhertence.realExample;

public class TestCase2  extends BaseTest{
    void testCase2(){

        startBrowser();
//        new BaseTest().startBrowser();       -> Without "extends" keyword we have to use like this

        System.out.println(gold);           // MultiLevel Inheritance

        /*
         *   here will be
         *   the no. of
         *   test cases
         *   written
         *   -----
         *   -----
         */

        closeBrowser();
//        new BaseTest().closeBrowser();       -> Without "extends" keyword we have to use like this

    }
}
