package src.CountCounterVariable;

public class CountVariable {
    int count = 0;
    int incrementPerThread = 1000;

    public synchronized void count(){
            for(int i =0; i< incrementPerThread; i++){
                count += 1;
            }
            }
}
