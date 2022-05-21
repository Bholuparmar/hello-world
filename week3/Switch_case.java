package week3;

public class Switch_case {
    public static void main (String[]args){
        char ch = 'A';
        switch (ch){
           case 'A','e','i','o','u'->System.out.println("vowel");
            default -> System.out.println("wrong input");
        }
    }
}
