package com.day5;
import java.util.Scanner;
public class P9 {
   public static void main(String args[]){
      System.out.println("Enter a character :");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
         System.out.println("Char is an vowel");
      }else{
         System.out.println("Char is a consonant");
      }
   }
}



