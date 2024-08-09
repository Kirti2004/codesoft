/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class NumberGame
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chances=5;
        int finals=0;
        boolean playAgain = true;
        System.out.println("welcome to game");
        System.out.println("Hye you have about  "+chances+"  chances to win this game");
        while(playAgain) {
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++) {
                System.out.println("chance"+(i+1)+"Enter your guess:");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("you won it.");
                    break;
                }
                else if(user>rand){
                    System.out.println("Too High");
                }
                else{
                    System.out.println("Too Low");
                }
            }
            if(guess==false){
                System.out.println("Sorry you lost the chance. the number is "+rand);
            }
            System.out.println("Do you want to play again(y/n)");
            String pA= sc.next();
            playAgain=pA.equalsIgnoreCase("y");
        }
        System.out.println("That's it, Hope you enjoy it");
        System.out.println("Here is your score"+finals);
    }
        public static int getrandN(int min,int max){
            return(int)(Math.random()*(max-min+1)+min);
        }
        
}