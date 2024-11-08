package Oct.ex_30102024;

public class Lab_132 {
    public static void main(String[] args) {
        int [] a = new int [3];
        a [0]=39;
        a [1]=40;
        a[2]=42;
       // for (int i=0; i<a.length;i++){
         //   System.out.println(a[i]);
        //}
        // For Each Loop Only For Lazy Person
        for (int i : a){
            System.out.println(i);
        }
        String [] names={"Rahul","Rohit","Rekha","Krishna"};
        for (String name: names){
            System.out.println(name);
        }
        for (String n: names){
            System.out.println(n);
        }
        int [] numbers= {1,2,3,5,4};
        for (int number: numbers){
            System.out.println(number);
        }

    }
}
