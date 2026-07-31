package TrainTicket.Booking.util;

import org.mindrot.jbcrypt.BCrypt;
//BCrypt ka use password ko securely store karne ke liye hota hai
//real backend system mein use hota hai jahan signup/login hota hai.
public class UserServiceUtil {
    public static String hashPassword(String plainPassword){
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());  //salt:- plainpassword ko hashing kr rha
    }
    public static boolean checkPassword(String plainPassword, String hashedpassword){
        return BCrypt.checkpw(plainPassword, hashedpassword); //hashed password and plainpassword ko check krega aur dono same hai toh boolean return krega
    }
}
