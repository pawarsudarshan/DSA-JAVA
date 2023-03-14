package Sorting;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        ht.put(1,100);
        ht.put(100,1);
        ht.put(5,110);
        ht.put(110,5);
        ht.put(9,111);
        ht.put(111,9);
        Iterator<Integer> it = ht.keySet().iterator();
        while(it.hasNext()){
            System.out.println(ht.get(it.next()));
        }
    }
}
