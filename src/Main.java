public class Main {
    public static void main(String[] args) {
        AnimalHouse<Animal> fishHouse = new AnimalHouse<Animal>();
        AnimalHouse<Animal> snakeHouse = new AnimalHouse<Animal>();
        Snake snake = new Snake();
        snake.length = 20.3;
        Fish fish = new Fish();
        fish.name = "Nemo";
        fishHouse.animal = fish;
        snakeHouse.animal = snake;
    }
}

