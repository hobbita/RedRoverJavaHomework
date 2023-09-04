public class HW6_3 {
/*
    public class OppositesAttract {

        public static boolean isLove(final int flower1, final int flower2) {

        }

    }


public static void main(String[] args) {
    int one=1;
    int two=4;
    boolean result;
    if ((one%2==0 && two%2!=0)||(two%2==0 && one%2!=0))
    {
        result=true;
        System.out.println(result);
    }
    else result=false;
    System.out.println(result);

}
public static void main(String[] args) {
    Integer a=123;
    System.out.println(a.toString());
}
Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.

public static void main(String[] args) {

    int[] array = {34, -345, -1, 100};
    int min=Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
        int elem=array[i];
        if(elem<min){
            min=elem;
        }
    }
    System.out.println(min);
}
public static void main(String[] args) {
  //  1 sheep...2 sheep...3 sheep...
    String result="";
    for (int i = 1; i < num; i++) {
        result += i + " sheep...";
    }*/
    public static int SUM(int a, int b){
        return a+b;
    }
    public static int MIN(int a, int b){
        return a-b;
    }
    public static int MUL(int a, int b){
        return a*b;
    }
    public static int DEL(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        int a=SUM(5,5);
        System.out.println(a);
        int b=MIN(10,5);
        System.out.println(b);
        int c=MUL(10, 5);
        System.out.println(c);
        int d=DEL(10, 5);
        System.out.println(d);
    }

}
