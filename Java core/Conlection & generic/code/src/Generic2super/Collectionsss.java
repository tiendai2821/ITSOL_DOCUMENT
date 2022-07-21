package Generic2super;

import java.util.List;

public class Collectionsss {
    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++)
            dest.set(i, src.get(i));
    }

    public static void main(String[] args) {

    }
}
