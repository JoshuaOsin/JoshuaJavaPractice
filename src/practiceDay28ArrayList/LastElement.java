package practiceDay28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElement {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.addAll(Arrays.asList(1,2,3,4,5));

        arr.set(arr.size()-1,0);

        System.out.println(arr);

        int temp = arr.get(0);

        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);



    }
}
