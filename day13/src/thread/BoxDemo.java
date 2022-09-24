package thread;

/*
 * 需求：生产者消费者拿去牛奶问题
 * 思路：
 *   1.奶箱类：定义一个成员变量，表示第X瓶奶，提供存储牛奶和获取牛奶的操作
 *   2.生产者类(Produce)，实现Runnable接口，重写run()方法，调用存储牛奶的操作
 *   3.消费者类(Customer),实现Runnable接口，重写run()方法，调用获取牛奶的操作
 *   4.测试类（BoxDemo),里面有main方法：
 *       1.创建奶箱对象，这是共享数据区域
 *       2.创建生产者对象，把奶箱对象作为构造方法的参数传递，因为这个类中要调用存储牛奶的操作
 *       3.创建消费者对象，把奶箱对象作为参数传递，因为这个类里要调用获取牛奶的操作
 *       4.创建2个线程对象，分别把生产者对象和消费者对象作为构造方法参数传递
 *       5.启动线程
 *
 * */

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        Produce produce = new Produce(box);
        Customer customer = new Customer(box);

        Thread pro = new Thread(produce);
        Thread cus = new Thread(customer);

        pro.start();
        cus.start();
    }
}
