/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 *
 * @author sittiwatlcp
 */

import java.util.Scanner;


public class _1_Exercise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int x  ;
         int y;
         
        System.out.print("เงินพ่อ : ");

        x = sc.nextInt();
        
        System.out.print("เงินแม่ : ");

        y = sc.nextInt();
               
        System.out.println("ผลรวม : " + (x+y));
    }
}
