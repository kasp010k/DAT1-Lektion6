package MadsTheCaptain.DetViLavedeIKlassen;

import java.util.Scanner;

public class MainTheCap {

    public static void main(String[] args) {
        System.out.println("Normie REEEEEEEEEEEE");
        //int in; Declare
        //in = 0; initialize

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int tal = input.nextInt();


        if ((tal%2==0)&&(tal%5==0)&&(tal!=0)){
            System.out.println("HiFive");
            System.out.println("HiEven");

        }else if (tal%2==0&&tal!=0){
            System.out.println("HiEven");

        }else if (tal%5==0&&tal!=0){
            System.out.println("HiFive");

        }else {
            System.out.println("HiNothing");

        }



    }
}
