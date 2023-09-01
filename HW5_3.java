public class HW5_3 {
    /*Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29. */
    public static void main(String[] args) {
        String str = "Посмотрите как Рите нравится ритм";
        str = str.toLowerCase();
        String sub = "рит";
        int position = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'р' && str.charAt(i + 1) == 'и' && str.charAt(i + 2) == 'т') {
                position = i;
                System.out.println(position);
            }

        }
    }
}
