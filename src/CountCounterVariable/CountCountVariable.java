package src.CountCounterVariable;


public class CountCountVariable implements Runnable {
    CountVariable obj;

    public CountCountVariable(CountVariable obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        obj.count();
        }
}
