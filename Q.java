package ex46;

class Q extends C {
    int d = 0;
    Q() {
        super(true);
    }
    boolean m1() {
        if (d == 1) {
            return true;
        }
        d++;
        return false;
    }
    void m2() {
        if (d == 2) {
            d++;
        }
    }
}

