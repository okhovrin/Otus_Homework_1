public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Barsik", "yellow");
        animal.age = 6;
        animal.weight = 16;
        animal.drink();

        Animal duck = new Duck("Pes", "brown", 14, 4);
        System.out.println(animal);
        System.out.println(duck);

        duck.iCanEat();
//        System.out.println(animal.toString());
    }
}
