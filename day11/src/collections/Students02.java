package collections;

public class Students02 {
    private String name;
    private int chinese;
    private int maths;

    public Students02() {

    }

    public Students02(String name, int chinese, int maths) {
        this.name = name;
        this.chinese = chinese;
        this.maths = maths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int sum() {
        int sum = this.chinese + this.maths;
        return sum;
    }
}
