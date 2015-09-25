package ex46;

abstract class R extends C {
    boolean b = false;
    R() {
        super();
    }
    R(boolean b) {
        super(b);
        n++;
    }
    abstract boolean m1();
}
