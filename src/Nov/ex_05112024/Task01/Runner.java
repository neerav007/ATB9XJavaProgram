package Nov.ex_05112024.Task01;

public class Runner {
    public static void main(String[] args) {
        // CREATING 5 OBJECTS AND SETTING THEIR ATTRIBUTES
        Dog d1 = new Dog();
        d1.name = "Buddy";
        d1.breed = "Golden Retriever";
        d1.age = 3;
        d1.weight = 25.0;
        d1.colour = "Golden";

        Dog d2 = new Dog();
        d2.name = "Max";
        d2.breed = "Labrador";
        d2.age = 4;
        d2.weight = 28.0;
        d2.colour = "Black";

        Dog d3 = new Dog();
        d3.name = "Tyson";
        d3.breed = "German Shepherd";
        d3.age = 2;
        d3.weight = 21.0;
        d3.colour = "Golden black";

        Dog d4 = new Dog();
        d4.name = "Maxi";
        d4.breed = "Pub";
        d4.age = 3;
        d4.weight = 22.0;
        d4.colour = "White Black";

        Dog d5 = new Dog();
        d5.name = "Rocky";
        d5.breed = "Desetchund";
        d5.age = 3;
        d5.weight = 26.0;
        d5.colour = "Black Golden";

        // DISPLAYING INFORMATION OF EACH DOG
        d1.displayInfo();
        d2.displayInfo();
        d3.displayInfo();
        d4.displayInfo();
        d5.displayInfo();


    }
}
