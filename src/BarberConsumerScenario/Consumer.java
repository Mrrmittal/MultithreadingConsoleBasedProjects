package src.BarberConsumerScenario;

public class Consumer extends Thread{
    Barber obj;
    String name;

    public Consumer(Barber obj, String name ){
        this.obj = obj;
        this.name = name;
    }

    @Override
    public void run(){
        obj.cutHair(name);
    }
}
