package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
        while(true){
            int input = scanner.nextInt();
            if(input == 1){
                System.out.println("You approach the cave... It is dark and spooky...\n" +
                        "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                        "Gobbles you down in one bite!");
                break;
            }else if(input == 2){
                System.out.println("You are safe now!");
                break;
            }else{
                System.out.println("Your number should be either 1 or 2");
                continue;
            }
        }
    }
}
