import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int[] arr = new int[10];
       int count = 0;
        System.out.print("Input Your Number(If input -1 exit to output):");
        while (true) {
            int num = input.nextInt();

            if (num == -1) break;

            if (count == arr.length) {
                arr = resizeArray(arr);
            }
            arr[count] = num;
            count++;
            }
        System.out.println("Output of the array:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + ", ");
        }
        }

    private static int[] resizeArray(int[] array) {
        int newSize = array.length + 1; // increase the size
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}

