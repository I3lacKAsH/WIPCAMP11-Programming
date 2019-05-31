/*
 * WIP XI Computer Programing 
 */

package V.Selection;

/**
 *
 * @author sittiwatlcp
 */
public class _4_IF_ELSE_IF {
    public static void main(String[] args) {
        
        int score = 2000;
        
        if(score >= 70){
            System.out.println("Your score is excellent.");
            System.out.println("You grant grade S.");
        } else if(score >= 40){
            System.out.println("Your score is good.");
            System.out.println("You grant grade A.");
        } else if(score >= 30){
            System.out.println("Your score is fair.");
            System.out.println("You grant grade B.");
        } else {
            System.out.println("Your score is poor.");
            System.out.println("You grant grade C.");
        }
        
    }
}
