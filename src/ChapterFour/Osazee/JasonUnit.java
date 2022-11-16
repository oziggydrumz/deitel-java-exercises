package ChapterFour.Osazee;

import java.util.Scanner;

public class JasonUnit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = input.nextInt();

        int counter = 1;
        while (counter <= 12) {

            System.out.println(number+" times "+ counter+ " is "+(counter * number));
            counter += 1;
        }
    }








}

