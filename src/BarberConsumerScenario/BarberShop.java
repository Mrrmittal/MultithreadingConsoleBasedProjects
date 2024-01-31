package src.BarberConsumerScenario;

import java.util.Scanner;
/*
Barber and Consumer Scenario by using wait() and notify() method.
 */

public class BarberShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barber obj = new Barber();
        Consumer[] consumers = new Consumer[10];


            for (int i = 0; i < consumers.length; i++) {
                consumers[i] = new Consumer(obj, sc.nextLine());
                consumers[i].start();
                synchronized (consumers[i]) {
                try {
                    consumers[i].wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
