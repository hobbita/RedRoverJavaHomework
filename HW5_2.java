public class HW5_2 {
    /* Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4. */
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='е'){
                sum=sum+1;
            }
        }
        System.out.println(sum);
    }
}
