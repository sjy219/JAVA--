package thread;

public class Customer implements Runnable{
    private Box bo;

    public Customer(Box bo) {
        this.bo = bo;
    }

    @Override
    public void run() {
        while (true) {
            bo.get();
        }
    }
}
