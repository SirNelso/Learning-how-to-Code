package exercise8;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        int[] testCopy = new int[test.length];

        System.arraycopy(test, 0, testCopy, 0, test.length);

       for(int i = 0; i < test.length; i++){
        System.out.println("Array 1 " + test[i]);
        System.out.println("Array 2 " + testCopy[i]);
       }
    }
    
}
