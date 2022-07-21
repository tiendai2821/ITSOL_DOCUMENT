package Generic;

public class Demo1 {
    public static void main(String[] args) {
        Test<String, Integer> obj = new Test<String, Integer>("Maybach", 100000);
        obj.print();
        Test<Integer, Float> obj2 = new Test<Integer , Float>(2, 5.4f);
        obj2.print();
        //

        Test2<String> test2 = new Test2<String>("Never die");
        test2.print();
        Test2<Integer> test21 = new Test2<>(3);
        test21.print();
    }
}
