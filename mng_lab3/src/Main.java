import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void bubbleSort(int arr[]){
        int size = arr.length;

        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
    }



    public static void main(String[] args) {
       int[] arr = {4, 3, 7, 8, 53, 6, 5, 2};

       System.out.println("Nieposortowana tablica: " + Arrays.toString(arr));
       Main.bubbleSort(arr);
       System.out.println("Posortowana tablica: " + Arrays.toString(arr));


    }
}