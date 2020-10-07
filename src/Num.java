public class Num {
    int value;
    int modulo;

    Num(int value, int modulo) {
        if (modulo == 0) this.value = value;
        else if (value < 0)
            this.value = value % modulo + modulo;
        else
            this.value = value % modulo;
        this.modulo = modulo;
    }

    Num(Num num) {
        this.value = num.getValue();
        this.modulo = num.getModulo();
    }

    Num plus(Num rhs) {
        if (this.modulo > rhs.getModulo()) return new Num(this.value + rhs.getValue(), this.modulo);
        else return new Num(this.value + rhs.getValue(), rhs.getModulo());
    }

    Num plus(int rhs) {
        return new Num(this.value + rhs, this.modulo);
    }

    Num mult(Num rhs) {
        if (this.modulo > rhs.getModulo()) return new Num(this.value * rhs.getValue(), this.modulo);
        else return new Num(this.value * rhs.getValue(), rhs.getModulo());
    }

    Num mult(int rhs) {
        return new Num(this.value * rhs, this.modulo);
    }

    Num minus(Num rhs) {
        if (this.modulo > rhs.getModulo()) return new Num(this.value - rhs.getValue(), this.modulo);
        else return new Num(this.value - rhs.getValue(), rhs.getModulo());
    }

    Num minus(int rhs) {
        return new Num(this.value - rhs, this.modulo);
    }


    int getModulo() {
        return modulo;
    }

    int getValue() {
        return value;
    }

//    public static void main(String args[]) {
//        Num a = new Num(5, 10);
//        Num b = new Num(4, 15);
//        Num c = a.mult(b);
//        Num d = c.mult(5);
//        System.out.println(c.getValue());
//        System.out.println(c.getModulo());
//        System.out.println(d.getValue());
//        System.out.println(d.getModulo());
//    }
}