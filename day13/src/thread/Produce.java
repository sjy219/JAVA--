package thread;

public class Produce implements Runnable {
    private Box bo;

    public Produce(Box bo) {

        this.bo = bo;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            bo.put(i);
        }
    }
}
