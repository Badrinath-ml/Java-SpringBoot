package jar.dto;

public class R {
    private int n;
    private int sum;

    public R(int n, int sum) {
        this.n = n;
        this.sum = sum;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}