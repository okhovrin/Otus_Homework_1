public class Duck extends Animal implements Flying{
    public Duck(String name, String color, int weight, int age) {
        super(name, color, weight, age);
    }

    @Override
    public void fly() {
        System.out.println("я летаю");
    }
//    @Override
//    public String toString() {
//        return "Привет, я УТКА ! меня зовут " + name + ", мне " + age +" "+ choiceOfAge(age) + ", я вешу - " + weight + "кг, мой цвет - " + color;
//    }

//    @Override
//    public void iCanEat() {
//        System.out.println("я утка , я ем");
//    }
}
