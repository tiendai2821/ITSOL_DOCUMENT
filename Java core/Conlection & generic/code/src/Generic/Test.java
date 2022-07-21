package Generic;
// Java program to show working of user defined
// Generic classes

// We use < > to specify Parameter type
public class Test<T, U> {
    // object of type T is declared
    T obj1;
    U obj2;

    public Test(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
