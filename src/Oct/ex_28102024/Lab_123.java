package Oct.ex_28102024;

public class Lab_123 {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);
        // 11-14(roar) To print it we have to write one place forward that is (11-15)


        // substring - many interviews
        String s1 = "Rohit";
        String s2 = s1.concat("Sahu");
        System.out.println(s2);

        // Separated by a delimeter that is comma ","
        String fruits = "apple,banana,cherry"; // delimter = ,
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        // We can use any delimetere in this case we have used "-"
        String fruits2 = "ABC-XYZ-QWE"; // delimter = ,
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);

        String s4 = "Rohit";
        System.out.println(s4.charAt(0));
        //System.out.println(s4.charAt(10));
        // StringIndexOutOfBoundsExceptionBecauseWeHave5WoedsOnly

        //Trim function basically removes all the leading and trailing space in the string
        String s5 = " Rohit ";
        System.out.println(s5.trim());

        // Basically tells the position of the alphabet in our case
        String s6 = "Rohit";
        System.out.println(s6.indexOf("o"));
        System.out.println(s6.indexOf("t"));

        // Basically tells that wether the given words are present or not true/false
        String s7 = "Rohit";
        System.out.println(s7.contains("oh"));
        System.out.println(s7.contains("zy"));

        String s8 = "Rohitchoudhary";
        System.out.println(s8.lastIndexOf("r"));

        String s9 = "Rohittrivedi";
        System.out.println(s9.replace("t","z"));
        System.out.println(s9.replaceAll("t","z"));

        String s10 = "Rohitsahuji";
        System.out.println(s10.startsWith("Roh"));
        System.out.println(s10.endsWith("ji"));
        System.out.println(s10.endsWith("zy"));

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);

        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);
    }
}
