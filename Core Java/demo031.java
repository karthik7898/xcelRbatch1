import java.util.HashSet;

class HashSetDemo1 {
    void hSetMethod() {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add("MIGUEL DIAZ");
        hashSet.add(9999.99);
        System.out.println(hashSet);

        for (Object x : hashSet) {
            System.out.println(x);
        }
    }
}

public class demo031 {
    public static void main(String[] args) {
        HashSetDemo1 obj = new HashSetDemo1();
        obj.hSetMethod();
    }
}
