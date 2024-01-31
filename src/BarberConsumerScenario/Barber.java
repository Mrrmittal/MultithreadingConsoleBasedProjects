package src.BarberConsumerScenario;

// Barber with cutHair method
public class Barber{
    String consumerName;
    public synchronized void cutHair(String consumerName){
        synchronized (this){
            System.out.println("Barber is working for consumer :" +consumerName);
        }
        notify();
    }
}
