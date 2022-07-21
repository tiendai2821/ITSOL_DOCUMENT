package List;
import java.util.*;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        java.util.ArrayList<String> arrListName = new java.util.ArrayList<>();
        arrListName.add("ee");
        arrListName.add("e2e");
        arrListName.add("e3e");
        arrListName.add("e3e");
        System.out.println(arrListName);

        java.util.ArrayList<String> listString = new java.util.ArrayList<String>();
        listString.add("Mercedes");
        listString.add("BMW");
        listString.add("volvo");
        listString.add("Lamborghini");
        System.out.println("print listString");
        System.out.println(listString);
//		duyệt theo kích thước của listString
//		sử dụng vòng lặp for thông thường
//		phương thức listString.size() sẽ trả về số phần tử của listString
//		và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
//		sau đó hiển thị giá trị của phần tử đó ra
        // hiển thị các phần tử trong List
        System.out.println("Các phần tử có trong listString là: ");
        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i) + "\t");
        }

        //  dùng vòng lặp for cải tiến
        System.out.println("Sử dụng vòng for cải tiến");
        for (String surf : listString) {
            System.out.println(surf + "\t");
        }
        System.out.println("Sử dụng Iterator");
        Iterator ite = listString.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

        // Thêm phần tử bằng phương thức addAll
        System.out.println("Danh sách phần tử sau khi thêm");
        List<String> car = new java.util.ArrayList<>();
        car.add("Ferrari");
        car.addAll(listString);
        Iterator ite1 = car.iterator();
        while(ite1.hasNext()){
            System.out.println(ite1.next());
        }

        // truy cập 1 phần tử
        System.out.println("Phần tử số 3 được tìm thấy: ");
        String str = car.get(3);
        System.out.println(str);

        // cập nhật giá trị phần tử
        System.out.println();
        car.set(3, "Mclaren");
        for (String str1:
             car) {
            System.out.println(str1);
        }
        System.out.println();
        car.add("Momo");
       for (int i = 0; i < car.size(); i++){
           System.out.println(car.get(i) + " index = " + i);
       }
        System.out.println("Sau khi xóa");
        car.remove(0);
        System.out.println();
        for (int i = 0; i < car.size(); i++){
            System.out.println(car.get(i) + " index = " + i);
        }



    }
}
