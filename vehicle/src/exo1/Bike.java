package exo1;

class Bike implements Vehicle{
    private String make;
    private int speed;

    public Bike(String make){
        this.make = make;
        this.speed = 0;
    }

    @Override
    public void star(){
        System.out.println("this bike star");
    }

    @Override
    public void stop(){
        System.out.println("this bike stop");
        this.speed = 0;
    }

    @Override
    public void speedUp(int increament){
        System.out.println("this bike increase its speed by: " + increament + "km/h");
        this.speed += increament;
    }

    @Override
    public void speedDown(int decreament){
        System.out.println("this bike decrease its speed by: " + decreament + "km/h");
        this.speed -= decreament;
    }
}