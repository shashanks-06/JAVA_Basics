package AUGUST.ex_04082024.singleInhertence.realExample;

public class TestCase1  extends BaseTest{
    void testCase1(){

        startBrowser();
        //        new BaseTest().startBrowser();       -> Without "extends" keyword we have to use like this

        getDataFromSQL();           // MultiLevel Inheritance
//        new GrandBaseTest().getDataFromSQL();         -> Without "extends" keyword we have to use like this

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
