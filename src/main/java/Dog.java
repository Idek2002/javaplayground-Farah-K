public class Dog extends Animal {
    private String owner;

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    @Override
    public void play() {
        System.out.println("DOG " + name + " is chasing its tail");
    }
}
    @Override
    public void play(Toy toy) {
        System.out.println("DOG " + name + " is planning to eat the toy"+ toy);}
@Override
public String toString() {
        return name;
        }
        }