/*
 * WIP XI Computer Programing 
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {

    public static int item = 0;
    public static int limit = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add \n2.Remove \n3.Check");
        System.out.print("เลือกเมนู: ");
        int menu = sc.nextInt();
        if (menu == 1) {
            if (item < limit) {
                System.out.print(" ต้องการเพิ่มกี่ไอเท็ม: ");
                int amount = sc.nextInt();
                if (item + amount > limit) {
                    System.out.println(" ไอเท็มเกินลิมิต");
                } else {
                    item += amount;
                    System.out.println("ITEM: " + item);
                    System.out.println("LIMIT: " + limit);
                }
            } else {
                System.out.println("ไอเท็มเต็มแล้ว");
            }
        } else if (menu == 2) {
            if (item != 0) {
                System.out.print(" ต้องการลบกี่ไอเท็ม: ");
                int amount = sc.nextInt();
                if (amount <= item) {
                    item -= amount;
                    System.out.println("ITEM: " + item);
                    System.out.println("LIMIT: " + limit);
                } else {
                    System.out.println("ลบไม่ได้เพราะไอเท็มที่เหลืออยู่ไม่เพียงพอ");
                }
            } else {
                System.out.println("ไอเท็มไม่มีให้ลบแล้ว");
            }
        } else if (menu == 3) {
            System.out.println("ไอเท็มในโกดัง: " + item);
        }
        System.out.println("--------------------------------");
        main(null);
    }
}
