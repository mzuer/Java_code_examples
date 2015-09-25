package ex46;


class N extends R {
    int i = 1;
    N() {
        super();
        b = false;
    }
    N(boolean b) {
        super(b);
        n++;
        i++;
    }
    boolean m1() {
    	System.out.println(b);
    	if (b) {
            b = false;
            System.out.println(b);
        } else {
            b = true;
            System.out.println(b);
            System.out.println(!b);

        }
        return !b;
    }
    void m3() {
        i++;
    }
}
