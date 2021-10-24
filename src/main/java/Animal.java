
public class Animal {
    //вот это вот поля
    String name;
    String color;
    int weight;
    int age;

    public void iCanEat(){
        System.out.println("я кушаю");
    }

    //поля бывают int boolean String и тд, может быть и другой класс

    //это методы, что важно - что возвращает и что передает, если ничего не возвращает то void
    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

//    public void drink(int liters) {
//        System.out.println("Я пью " + liters + " литров воды");
//    }

    public void eat() {
        System.out.println("Я ем");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, String color, int weight, int age) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // все классы наследуются от Object --> shift+shift - override methods --> можно увидеть какие методы можно переопределить
    //override ничего не делает , просто говорит о том, что ты переписываешь метод родительского
    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ", мне " + age +" "+ choiceOfAge(age) + ", я вешу - " + weight + "кг, мой цвет - " + color;
    }

    //переименовать метод везде shift + F6
    public static String choiceOfAge(int age) {
        if (age % 10 == 1) {
            return "год";
        } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
            return "года";
        } else return "лет";
    }
}
