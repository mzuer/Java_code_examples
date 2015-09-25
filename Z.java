package ex46;


class Z extends R {
    int o;
    Z() {
        super();
        o++;
    }
    Z(boolean b) {
        super(b);
        o = 4;
    }
    boolean m1() {
        return !b;
    }
    void m3() {
        o++;
    }
}