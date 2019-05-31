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
         
        int  เมียเอาเงินผม ;
        int  เงินที่ผมมี ;
         
        System.out.print("เมียเอาเงินผม : ");

        เมียเอาเงินผม = sc.nextInt();
        
        System.out.print("เงินที่ผมมี : ");

        เงินที่ผมมี = sc.nextInt();
               
        System.out.println(" - เงินที่ผมมี : " + (เมียเอาเงินผม - เงินที่ผมมี));
    }
}
