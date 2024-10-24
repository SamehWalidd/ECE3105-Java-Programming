public class MyInteger {
    private int value;

    public MyInteger(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int v) {
        return v % 2 == 0;
    }

    public static boolean isOdd(int v) {
        return v % 2 != 0;
    }

    public static boolean isPrime(int v) {
        if (v <= 1) return false;
        for (int i = 2; i <= Math.sqrt(v); i++) {
            if (v % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myI) {
        return myI.isEven();
    }

    public static boolean isOdd(MyInteger myI) {
        return myI.isOdd();
    }

    public static boolean isPrime(MyInteger myI) {
        return myI.isPrime();
    }


    public boolean equals(int v) {
        return this.value == v;
    }

    public boolean equals(MyInteger v) {
        return this.value == v.getValue();
    }

}