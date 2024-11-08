package Oct.ex_23102024;

public class Lab_114 {
    public static void main(String[] args) {
        /* USER DEFINED FUNCTION ARE OF FOUR TYPES
        1. WITHOUT PARAMETERS AND WITHOUT RETURN TYPE
        2. WITHOUT PARAMETERS AND WITH RETURN TYPE
        3. WITH PARAMETERS AND WITHOUT RETURN TYPE
        4. WITH PARAMETERS AND WITH RETURN TYPE
         */


        // NOW WE WILL DISCUSS ABOUT EACH OF THE TYPES AS GIVEN BELOW
        //1. WITHOUT ARGUMENTS/ PARAMETERS AND WITHOUT RETURN TYPE
        // WE ARE INSIDE THE MAIN FUNCTION WE WILL CALL THE FUNCTION HERE BUT FIRSTLY WE HAVE TO DECLARE THE FUNCTION OUTSIDE THE MAIN CLASS.

        for(int i=0;i<99;i++){
            greet();
        }

        // 2. WITHOUT PARAMETERS AND WITH RETURN TYPE

        String returned_value=greet2();
        System.out.println(returned_value);


        int voting_age=age_of_vote();
        System.out.println(voting_age);
        if (voting_age>=18){
            System.out.println("You are allowed to vote");
        }
        else {
            System.out.println("You are not allowed to vote");
        }

        // 3. WITH PARAMETERS AND WITHOUT RETURN TYPE
        greet_with_your_name("Rohit");
        greet_with_your_name("Rahul");
        greet_with_your_name("Rekha");

        greet_with_your_first_name_last_name("Rohit","Sahu");
        greet_with_your_first_name_last_name("Rahul","Sahu");
        greet_with_your_first_name_last_name("Rekha","Sahu");
        greet_with_your_first_name_last_name("Krishna","Sahu");

        // 4. WITH PARAMETERS AND WITH RETURN TYPE
        int result= sum_of_two_numbers(3,20);
        System.out.println(result);




    }
    // 1. WITHOUT ARGUMENTS/ PARAMETERS AND WITHOUT RETURN TYPE
    static void greet(){
        System.out.println("Hey babe how are you");
    }

    // 2. WITHOUT PARAMETERS AND WITH RETURN TYPE
    static String greet2(){
        // WRITE THE CODE
        System.out.println("Hello i am type 2");
        return "Hii, i am completely fine baby";
    }
    static int age_of_vote(){
        //Write the code
        System.out.println("Vote age returned successfully");
        return 18;
    }

    // 3. WITH PARAMETERS AND WITHOUT RETURN TYPE
    static void greet_with_your_name(String Name){
        //Write your code
        System.out.println("Your name is " + Name);
    }

    static void greet_with_your_first_name_last_name(String Firstname,String Lastname){
        System.out.println("Your name is "+ Firstname+" "+ Lastname);
    }

    //4. WITH PARAMETERS AND WITH RETURN TYPE
    static int sum_of_two_numbers(int a,int b){
        return a+b;
    }


}
