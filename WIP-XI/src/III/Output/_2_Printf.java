/*
 * WIP XI Computer Programing 
 */

package III.Output;

/**
 *
 * @author sittiwatlcp
 */
public class _2_Printf {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Wick";
        String nickName = "Wick";
        double ownWallet = 20000000;
        double friendWallet = 100000000;
        
        System.out.printf("สวัสดี เราชื่อ %s %s (%s) เรามีเงิน %f บาท และเพิ่อนเรามีเงิน %.2f บาท \n", firstName, lastName, nickName, ownWallet, friendWallet);
    }
}
