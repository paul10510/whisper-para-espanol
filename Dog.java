public class Dog {
    
    private String breed;
    private String name;
    private int age;

    // create a constructor
    public Dog(String br, String nm, int a){
        breed = br;
        name = nm;
        age = a;
    }
    public Dog(){
    }

    public void walk() {
        System.out.print("I like long walks at the beach");
    }

    public void feed() {
        System.out.println("Yummy Ass! Gimme them cheeks Ms. Antoniou!");
    }

    public static void main(String[] args){
        String stateFish = "Landlocked";

String otherFish = "River";

stateFish = stateFish.concat("Salmon");

otherFish = stateFish.concat("Trout");

System.out.println(otherFish);
    }
}