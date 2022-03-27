package Java.Hashing;

import java.security.Key;
import java.util.*;

public class basicHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String b = sc.nextLine();
            map.put(a,b);
        }
        map.putIfAbsent(6,"abhi");
       System.out.println( map.containsKey(10));
      // System.out.println(map.entrySet());
       System.out.println(map);

       // Retrieving the key set
        Set<Integer> keySet = map.keySet();
        for (int key : keySet)
            System.out.print(key+" ");

        //Retrieving the collection view of values present in map
        Collection<String> values = map.values();
        for(String val : values)
            System.out.print(val+" - ");
    }
}
