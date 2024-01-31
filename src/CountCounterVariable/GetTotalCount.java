package src.CountCounterVariable;

public class GetTotalCount {
    public static void main(String[] args) throws InterruptedException {

        CountVariable countVariable = new CountVariable();
        CountCountVariable[] myObj = new CountCountVariable[7];
        for(int i =0; i< myObj.length; i++){
            myObj[i] = new CountCountVariable(countVariable);
        }

        Thread[] myThreads = new Thread[7];
        for(int i =0; i< myThreads.length; i++){
            myThreads[i] = new Thread(myObj[i]);
            myThreads[i].start();
            myThreads[i].join();
        }


        System.out.println(countVariable.count);



    }

}
