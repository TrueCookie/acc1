import java.util.*;

public abstract class Auth {
    private static HashMap<String, String> users = new HashMap<>();

    static {
        users.put("admin", "0000");
        users.put("Ivan", "Ivan");
    }

    public static boolean auth(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Login: ");
        String loginInput = scanner.nextLine();

        System.out.print("Password: ");
        String passwordInput = scanner.nextLine();

        return users.containsKey(loginInput) && users.get(loginInput).equals(passwordInput);
    }
}
