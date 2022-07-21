package Generic;
//Chúng ta cũng có thể viết các hàm chung có thể được gọi với các loại đối số khác nhau dựa
// trên loại đối số được truyền cho phương thức chung. Trình biên dịch xử lý từng phương thức.
//
public class Test3 {
    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("Write something");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}
