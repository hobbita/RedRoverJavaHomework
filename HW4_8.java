public class HW4_8 {
    /* это 8я
    Дан массив произвольных целых чисел.
необходимо подсчитать количество положительных и отрицательных чисел в этом массиве.

   public static void main(String[] args) {
       int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9};
       int plus=0;
       int minus=0;
       for (int i=0; i< array.length;i++){
           int arr=array[i];
           if(arr<0){
               minus=minus+1;
           }else{
               plus=plus+1;
           }

       }
       System.out.println("отрицательных элементов " + minus);
       System.out.println("положительных элементов " + plus);

   }
   9
   Дан массив произвольных целых чисел.

проверить, отсортирован ли он, т.е. все ли числа в массиве стоят так, что каждое следующее число больше предыдущего.

   */
    public static void main(String[] args) {
        int[] array = {-1, -2, -3, -4, -5, -6, -7, -8, -9};
        boolean result=true;

        for (int i=0; i< array.length-1;i++){
            int arr=array[i];
            int arr1=array[i+1];
            if(arr>arr1){
                result=false;
            }
        }
        System.out.println("Этот массив отсортирован?  " + result);
    }

    // System.out.println("положительных элементов " + plus);

}

