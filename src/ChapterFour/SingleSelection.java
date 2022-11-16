package ChapterFour;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args){
        Scanner inputCollector = new Scanner (System.in);


        System.out.println("enter input number");
        int userInput = inputCollector.nextInt();
        if(userInput > 10) {
            System.out.println("out of range");
        }else{if(userInput % 2 == 0)
            System.out.println("this is even");
            else
            System.out.println("this is odd biko");
        }

    }
}
