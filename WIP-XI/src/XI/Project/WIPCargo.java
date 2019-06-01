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

    public static void main(String[] args) {
        int item = 4;
        int limit = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("มีไอเทม : " + item);
        System.out.println("ค่าสูงสุดของโกดังในการเก็บไอเท็ม : " + limit);

        System.out.println("หากต้องการ\nเก็บไอเท็ม กด 1\nนำไอเท็มออก กด 2\nเช็คไอเท็ม กด 3");

        System.out.print("โปรดใส่เลข : ");
        int x = sc.nextInt();

        if (x == 1) {
            if (item < limit) {
                System.out.print("ทำการเพิ่มไอเท็ม : ");
                int amount1 = sc.nextInt();
                if (item + amount1 > limit) {
                    System.out.println("ไอเท็มเกินลิมิต");
                } else {
                    System.out.println("จำนวนไอเทมรวม : " + (item + amount1));
                }

            } else {
                System.out.println("ไอเท็มเต็มแล้ว");

            }
            System.out.println("===============================================");
        } else if (x == 2) {
            if (item == 0) {
                System.out.println("ไม่มีไอเท็มในโกดัง");
            } else {
                System.out.print("นำไอเท็มออก : ");
                int amount2 = sc.nextInt();
                if (item < amount2) {
                    System.out.println("ไอเท็มไม่เพียงพอ");
                } else {
                    System.out.println("เหลือไอเท็มในโกดัง : " + (item - amount2));
                }

            }
        } else if (x == 3) {
            System.out.println("ทำการเช็คไอเท็ม");
            System.out.println("มีไอเทม : " + item);
        } else {
            System.out.println("ไม่มีคำสั่งดังกล่าว");
        }
    }
}