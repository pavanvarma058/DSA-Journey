import java.util.ArrayList;

public class ArrayListExample {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println(list.contains(40));
        System.out.println(list.contains(29));
        list.set(0, 99);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
