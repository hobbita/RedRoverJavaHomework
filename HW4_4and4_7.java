public class HW4_4and4_7 {
    /*
    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести сумму всех значений массива.
public static void main(String[] args) {
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    int sum=0;
    for (int i=0; i< array.length;i++){
        int arr=array[i];
        sum=sum+arr;

    }
    System.out.println(sum);
}
7
* Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
 */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum=0;
        for (int i=0; i< array.length;i++){
            int arr=array[i];
            sum=sum+arr;

        }
        System.out.println(sum / array.length);

    }
}
