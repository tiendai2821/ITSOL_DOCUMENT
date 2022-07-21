package map;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
public class GetMapValue {
    public static void main(String[] args) {
        Map<String, String> maplanguage = new TreeMap<>();
        maplanguage.put("Java", "Huong doi tuong");
        maplanguage.put("Sql", "CSDL");
        maplanguage.put("C++", "Khong biet");

        Set<Map.Entry<String, String>> setLanguages = maplanguage.entrySet();
        System.out.println("Các entry có trong setLanguages:");
        System.out.println(setLanguages);

        Map<Character, Integer> mapChar = new TreeMap<>();
        mapChar.put('C', 4);
        mapChar.put('M', 3);
        mapChar.put('H', 7);

        // lấy toàn bộ key
        for(char c : mapChar.keySet()) {
            System.out.println("Key: " + c);
        }

        // lấy toàn bộ value

        for(Integer a : mapChar.values()) {
            System.out.println("value: " + a);
        }
        // dùng Iterator lấy toàn bộ entry

        Iterator<Map.Entry<Character, Integer>> ite = mapChar.entrySet().iterator();
        System.out.println("Các Entry trong maplanguages: ");
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }

        // thêm dữ liệu vào Map
        Map<String, String> mapStudents = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String masv, tensv ;
        System.out.println("Nhập số sinh viên");
        int sosv = sc.nextInt();
        masv = sc.nextLine();
        for(int i = 0; i < sosv; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            System.out.println("Nhập mã sinh viên");
            masv = sc.nextLine();
            System.out.println("Nhập tên sinh viên");
            tensv = sc.nextLine();
            mapStudents.put(masv, tensv);
        }
        // hiển thị thông tin sinh viên

        Iterator<Map.Entry<String, String>> ite2 = mapStudents.entrySet().iterator();
        System.out.println("Mã sinh viên và tên sinh viên: ");
        while(ite2.hasNext()) {
            Map.Entry<String, String> entry = ite2.next();
            System.out.println("Mã sinh viên: " + entry.getKey() + "Tên Sinh viên: " + entry.getValue());
        }

        // thêm sinh viên mới
        String addMasv, addTensv;
        System.out.println("Nhập thông tin sinh viên cần thêm:");
        System.out.println("Nhập mã sinh viên");
        addMasv = sc.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        addTensv = sc.nextLine();
        // phương thức containsKey() sẽ kiểm tra mã sinh viên vừa thêm mới đã tồn tại hay chưa
        if(mapStudents.containsKey(addMasv)) {
            System.out.println("Mã sinh viên mới" + addMasv + "đã tồn tại ");

        }
        else {
            mapStudents.put(addMasv, addTensv);
            sosv++;
            System.out.println("Danh sách các sinh viên sau khi thêm: ");
            System.out.println("số sinh viên hiện tại:" + sosv);
            System.out.println("Mã sinh viên \t Tên sinh viên");
            ite2 = mapStudents.entrySet().iterator();
            while(ite2.hasNext()) {
                Map.Entry<String, String> entry2 = ite2.next();
                System.out.println(entry2.getKey() + "\t\t" + entry2.getValue());
            }



        }
    }
}
