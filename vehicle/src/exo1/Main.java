package exo1;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Audi");
        Bike bike = new Bike("Honda");

        car.star();
        car.stop();
        car.speedDown(30);
        car.speedDown(20);

        bike.star();
        bike.stop();
        bike.speedDown(10);
        bike.speedDown(5);

    }
}
