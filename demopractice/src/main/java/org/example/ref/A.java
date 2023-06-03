package org.example.ref;

public class A {
    private int x;
    private B ob;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    public A() {
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }
}
