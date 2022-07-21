package Generic;

public class Test2<T> {
    T obj;

    public Test2(T obj) {
        this.obj = obj;
    }

    public void print(){
        System.out.println(this.obj);
    }
}
