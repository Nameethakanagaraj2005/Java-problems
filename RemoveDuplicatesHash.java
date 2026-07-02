import java.util.HashSet;

public class RemoveDuplicatesHash{
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 2, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates: " + set);
    }
}