package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        // khai báo 1 LinkedList có tên là list
        // có kiểu là String
        LinkedList<String> list = new LinkedList<String>();
        // thêm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        // hiển thị các phần tử của list
        System.out.println("Các phần tử có trong list là: ");
        System.out.println(list);

        // duyệt phần tử
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // truy cập
        System.out.println(list.get(3));

        // xóa phần tử
        System.out.println(list.get(3));

        // tìm kiếm
        // kiểm tra xem PHP có tồn tại trong list hay không?
        System.out.println(list.contains("PHP"));
        // kiểm tra xem ANDROID có tồn tại trong list hay không?
        System.out.println(list.contains("ANDROID"));

    }
}
