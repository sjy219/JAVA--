public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.set(new Integer(10));
        stringBox.set(new String("good"));

        System.out.println("int: " + integerBox.get());
        System.out.println("str: " + stringBox.get());
    }
}