package ca.judacribz.codingtest1;

public class Single {
    private  static final Single ourInstance = new Single();

    public static synchronized Single getInstance() {
        return ourInstance;
    }

    private Single() {
    }
}
