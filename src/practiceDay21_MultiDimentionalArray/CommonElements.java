package practiceDay21_MultiDimentionalArray;

public class CommonElements {

    public static void main(String[] args) {

        int [] arr1= {1,2,3,4,5};
        int [] arr2= {4,5,6,7,8};

        String commonElements = "";

        for (int i = 0; i < arr1.length; i++) {
            for (int each : arr2) {
                if (arr1[i] == each ) {
                    commonElements += each+" ";
                }
            }
        }
        System.out.println("commonElements = " + commonElements);
    }
}
