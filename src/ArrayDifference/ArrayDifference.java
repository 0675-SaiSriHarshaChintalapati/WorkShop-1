package ArrayDifference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDifference {
    public static void main(String[] args) {
        int[] array = {1,5,2,2,3,7,8,9};
        int target=3;
        ArrayDifference(array,target);
    }
    public static void ArrayDifference(int[] array, int target) {
        System.out.println(Arrays.toString(array));
        Set<Integer> elements=new HashSet<>();
        Set<String> pairs=new HashSet<>();
        for (int num:array) {
            if(elements.contains(num-target)) {
                pairs.add((num-target)+"," +num);
            }
            if(elements.contains(num+target)) {
                pairs.add(num+","+(num+target));
            }
            elements.add(num);
        }
        for (String pair : pairs) {
            System.out.println(pair);
        }
    }
}



