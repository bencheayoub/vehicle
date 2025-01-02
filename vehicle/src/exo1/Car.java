package exo1;

class Car implements Vehicle{
    private String make;
    private int speed;

    public Car(String make){
    this.make = make;
    this.speed = 0;
    }

    @Override
    public void star(){
        System.out.println("this car star");
    }

    @Override
    public void stop(){
        System.out.println("this car stop");
        this.speed = 0;
    }

    @Override
    public void speedUp(int increament){
        this.speed += increament;
    }

    @Override
    public void speedDown(int decreament){
        this.speed += decreament;
    }
}
