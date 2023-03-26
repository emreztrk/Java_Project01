package Project01;

import java.util.Objects;
import java.util.Scanner;

public class MainProject {
    public static void main(String[] args) {
        Scanner scStr=new Scanner(System.in);
        Scanner scUser=new Scanner(System.in);
        Scanner scPass=new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name=scStr.nextLine();
        String s1=name.substring(0,1).toUpperCase();
        String capFirst=s1+name.substring(1);

        System.out.print(capFirst + " welcome, please enter your lastname: ");
        String lastname=scStr.nextLine();
        String s2=lastname.substring(0,1).toUpperCase();
        String capSecond=s2+lastname.substring(1);
        System.out.println(capFirst+" "+capSecond + ", if your name is correct, press 'Y' to continue");
        System.out.println();


        String reading= "";
        do {
            reading=scStr.next();
            if (!reading.equalsIgnoreCase("y")){
                System.out.println("Your choice is not correct, Please try again.");
                System.out.println(capFirst+" "+capSecond + " if your name is correct, press 'Y' to continue");
            }

        }while (!reading.equalsIgnoreCase("y"));
        System.out.println("Your name and lastname has been successfully registered in the system...");

        System.out.println("Enter your username: ");
        String username=scUser.nextLine();

        String password;
        String passwordConfirm;

        do {
            System.out.print("Enter your password: ");
            password=scPass.nextLine();
            System.out.print("Enter your password again: ");
            passwordConfirm=scPass.nextLine();

            if (!password.equals(passwordConfirm)){
                System.out.println("Passwords does not match, please try again");
            }
        }while (!password.equals(passwordConfirm));
        System.out.println("Congrats, "+username + " you have registered in the system.");




    }
}
