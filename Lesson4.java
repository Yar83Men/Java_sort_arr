package com.youtube.architect;
import java.util.Arrays;
/*
* Сортировка массива с строками ввиде чисел
* Sorting an array with strings as numbers
* */
public class Lesson4 {
    public static void main(String[] args) {
        String[] arr_strings_num = {"100", "9", "20", "11", "1", "02", "111"};
        int[] arr_int_num = new int[arr_strings_num.length];
        convert_to_int_arr(arr_strings_num, arr_int_num);
        Arrays.sort(arr_int_num);
        convert_to_str_arr(arr_strings_num, arr_int_num);

        System.out.println(Arrays.toString(arr_strings_num));
    }
    public static int[] convert_to_int_arr(String[] str, int[] str1){
        for (int i=0; i<str.length; i++){
            str1[i] = Integer.parseInt(str[i]);
        }
        return str1;
    }
    public static String[] convert_to_str_arr(String[] str, int[] str1){
        for (int i=0; i<str1.length; i++){
            str[i] = Integer.toString(str1[i]);
        }
        return str;
    }

}
