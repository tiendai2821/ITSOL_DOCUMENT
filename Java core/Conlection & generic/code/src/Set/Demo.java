package Set;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set<Integer> hashsetInteger = new HashSet<>();
        hashsetInteger.add(454);
        hashsetInteger.add(5);
        hashsetInteger.add(6);
        hashsetInteger.add(77);
        hashsetInteger.add(77);

        // khai báo Set Interface trên treesetInteger
        // sử dụng TreeSet để triển khai
        Set<Integer> treesetInteger = new TreeSet<Integer>();
        treesetInteger.add(454);
        treesetInteger.add(5);
        treesetInteger.add(6);
        treesetInteger.add(77);

        System.out.println("Các phần tử có trong hashSetInteger: ");
        System.out.println(hashsetInteger);
        System.out.println("Các phần tử có trong treesetInteger");
        System.out.println(treesetInteger);

        // Tạo 1 Set thông qua 1 Collection đã tồn tại

        HashSet<String> hashSet = new HashSet<String>();


        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(44);
        listInteger.add(4);
        listInteger.add(13);
        listInteger.add(13);

        Set<Integer> setInteger = new TreeSet<Integer>(listInteger);

        System.out.println("Các phần tử trong setInteger");
        Iterator<Integer> ite = setInteger.iterator();
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }

        // khởi tạo danh sách các phần tử cho Set bằng cách lọc các phần tử trong 1 Collection theo điều kiện cho trước, ở đây là lọc các số chẵn
        List<Integer> listInteger2 = new ArrayList<Integer>();

        Set <Integer> setInteger2 = new TreeSet<Integer>();

        listInteger2.add(0);
        listInteger2.add(5);
        listInteger2.add(2);
        listInteger2.add(4);
        listInteger2.add(1);



        // lọc các phần tử là số chẵn trong listInteger
        // và thêm vào setInteger
        setInteger2 = listInteger2.stream().filter(number -> number % 2 == 0).collect(Collectors.toSet());
        System.out.println("Cacs phần tử trong setInteger");
        for(int numbers : setInteger2) {
            System.out.println(numbers);
        }

        // Khai báo và khởi tạo số phần tử cho Set bằng HashSet(), nhưng HashSet lưu trữ mặc định là 16 phần tử, nên nếu số phần tử lớn hơn 16 thì phải khởi tạo số phân tử đó
        Set<Float> setFloat = new HashSet<Float>(100);
        // hiển thị các phần tử có trong Set, tương tự  như List

        // sử dụng Iterator, tương tự

        setFloat.add(5.4f);
        setFloat.add(5f);
        setFloat.add(53f);
        setFloat.add(51f);
        Iterator<Float> ite1 = setFloat.iterator();
        while(ite1.hasNext()) {
            System.out.println(ite1.next());
        }
        // xóa phần tử
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");
        float so = sc.nextFloat();
        if(setFloat.contains(so)) {
            setFloat.remove(so);
            System.out.println("xoas thanh công");
            System.out.println("Danh sách sau khi xóa: "  + setFloat);
        }
        else {
            System.out.println("không xóa được");
        }

        // xóa tất cả phần tử
        setFloat.clear();
        if(setFloat.isEmpty()) {
            System.out.println("Danh sách các phần tử là rỗng" + setFloat);

        }
    }
}
