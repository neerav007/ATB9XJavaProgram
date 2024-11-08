package Nov.ex_08112024.Methodoverriding;

public class Lab_151 {
    public static void main(String[] args) {
        Rohit r = new Rohit();
        r.home();

        Father f  = new Father();
        f.home();

        // Dynamic Dispatch.
        Father f1 = new Rohit();
        f1.home();

        // WebDriver driver = new ChromeDriver();

//        Pramod p1  = new Father();
//        p1.home();



    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
    void f2(){

    }
}

class Rohit extends Father{

    @Override
    void home(){
        System.out.println("3BHK");
    }

    void f1(){
    }
}
