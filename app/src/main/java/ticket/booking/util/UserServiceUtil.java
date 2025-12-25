package ticket.booking.util;
import org.mindrot.jbcrypt.BCrypt;

public class UserServiceUtil {
    public static String hashPassword(String plainPassword) { //plain password is converted into hashed password
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    public static boolean checkPassword(String plainPassword, String hashedPassword) { // plain password is checked with hashed password
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}
