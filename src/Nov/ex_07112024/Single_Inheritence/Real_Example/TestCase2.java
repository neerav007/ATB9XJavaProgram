package Nov.ex_07112024.Single_Inheritence.Real_Example;

public class TestCase2 extends Common_BaseTest {
    TestCase2(){
        System.out.println("DC - Child");
    }

    void testcase2(){
        startBrowser();
        System.out.println("TC2 Executing");
        readExcelFile();
        closeBrowser();
    }

}