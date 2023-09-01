public class HW5_1 {
    /*Дана строка: 
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)*/
    public static void main(String[] args) {
        String str = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='о' || str.charAt(i)=='О'){
                char a=str.charAt(i);
                System.out.println(a);
            }
        }
        
    }
}
