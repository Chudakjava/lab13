package com.company;
import java.util.Scanner;
interface GenericInterface<T> {
    // параметризированный метод
    T func(T t);
}
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    static String str1;
    static String ch;
    public static void main(String[] args) {
        System.out.println("Input word: ");
        str1 = scanner.next();
        System.out.println("Input letter: ");
        ch=scanner.next();
        GenericInterface<String> reverse = (str) -> {
            int strl=str.length(); String result="";
            char[] result1 = str.toCharArray();
            int x=strl/2; //int отбрасывает дробную часть, следовательно 5/2 будет 5
            int q=0;//если какая-либо из букв не равна букве с другой стороны, увеличиваем на 1
            for (int i=0,j=strl-1;i<x;i++,j--){//strl -1 потому что slovo[strl] = '\0'
                if (result1[i]!=result1[j]) q++;
            }

            if (q==0)
            {
                result=result+ch+str1;

            }
            else  result=result+str1+ch;

            return result;
        };
        System.out.println("Result = " + reverse.func(str1));
    }
}