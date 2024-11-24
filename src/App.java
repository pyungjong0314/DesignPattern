import java.util.*;

class AccountBalance {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap();
        map.put(1, 2);
        map.put(2, 3);
        Iterator iterator = map.keySet().iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}