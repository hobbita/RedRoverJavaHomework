public class HW4_5and4_6 {
    /* №5
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.

   public static void main(String[] args) {
       int[] array = {9, 2, -6, 4, 5, 12, 7, 8, 6};
       int min=Integer.MAX_VALUE;
       for (int i = 0; i < array.length; i++) {
           int elem=array[i];
           if(elem<min){
               min=elem;
           }
       }
       System.out.println(min);
   }
Задача №6
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.*/
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, -22, 12, 7, 8, 6};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int elem=array[i];
            if(elem>max){
                max=elem;
            }

        }System.out.println(max);
    }
}
