package map;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
public class Layvalue_khibietKey {
    public static void main(String[] args) {
        Map<String, String> mapCity = new TreeMap<>();
        mapCity.put("London", "England");
        mapCity.put("Lyon", "France");
        mapCity.put("LasVegas", "USA");
        mapCity.put("Paris", "France");
        System.out.println("Thông tin liên quan đến các thành phố:");
        Set<Map.Entry<String, String>> setCity = mapCity.entrySet();
        System.out.println(setCity);

        // Lấy key theo tên thành phố
        // và hiển thị những thứ liên quan
        System.out.println("Hiển thị");
        System.out.println("Paris" + mapCity.get("Paris"));
        // lấy thành phố có tên là Ha Noi
        // vì trong mapCity không có thành phố nào tên Ha Noi
        // nên hiển thị giá trị null

        System.out.println("Ha Noi: " + mapCity.get("Ha Noi"));
        // để kiêm tra xem 1 value có trong Map hay không
        // sử dụng phương thức containsValue()
        System.out.println("Kiểm tra thành phố Paris có tồn tại ko");
        if(mapCity.containsKey("Paris")) {
            System.out.println("có tồn tại");
        }
        else {
            System.out.println("ko tồn tại");
        }


        // thay thế 1 value của 1 entry
        System.out.println("Map city trước khi thay thế value" + mapCity);
        mapCity.replace("Paris", "Eiffen");
        System.out.println("Map city sau khi thay thế" + mapCity);
        // cách 2
        mapCity.replace("London", "England", "Chelsea");
        System.out.println(mapCity);
        // sao chép
        // tạo 1 map rỗng

        Map<String, String> mapCityCopy = new TreeMap<>();
        System.out.println("map mới trước khi sao chép");
        System.out.println(mapCityCopy);
        mapCityCopy.putAll(mapCity);
        System.out.println("Sau khi sao chép");
        System.out.println(mapCityCopy);
    }
}
