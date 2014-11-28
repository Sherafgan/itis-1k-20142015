
public class RF {
    private int num, den;
    public RF(int num, int den) throws ArithmeticException {
        if (den == 0) {
            throw new ArithmeticException("Илья, не смотри сюда!!");
        }
        this.den = den;
        this.num = num;
    }

    public RF() {
        num = 0;
        den = 1;
    }
}
