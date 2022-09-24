package thread;

public class Box {
    private boolean status = false;
    private int milk = 0;
    public Box() {
    }

    public synchronized void put(int milk) {
        if (status) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送到的第" + this.milk + "瓶牛奶");
        status = true;
        notifyAll();
    }

    public synchronized void get() {
        if (!status) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("这是消费者拿走的第 " + this.milk + "瓶牛奶");
        status = false;
        notifyAll();
    }
}
