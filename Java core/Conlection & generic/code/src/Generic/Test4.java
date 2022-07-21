package Generic;
//Generic Types Differ Based on Their Type Arguments:
//Consider the following Java code.
//

public class Test4<T> {
    T obj;
    Test4(T obj){this.obj = obj;}
    public T getObject(){
        return this.obj;
    }
}
class  Main{
    public static void main(String[] args) {
        // instance of Integer type
        Test4<Integer> iObj = new Test4<>(15);
        System.out.println(iObj.getObject());
        // instance of String type
        Test4<String> sObj = new Test4<String>("Fight to the death");
        System.out.println(sObj.getObject());
        // compare 2 Obj
        /// iObj = sObj;

    }
}
