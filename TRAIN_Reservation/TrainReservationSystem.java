import java.util.*;
package TRAIN_Reservation;

public class TrainReservationSystem {
    
	private static String userId = "pankaj";
    private static String password = "12345";

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Login Form
            System.out.println("=== Train Reservation System ===");
            System.out.print("Enter User ID: ");
            String enteredUserId = scanner.nextLine();
            System.out.print("Enter Password: ");
            String enteredPassword = scanner.nextLine();

            if (authenticateUser(enteredUserId, enteredPassword)) {
                System.out.println("Login Successful!");
                System.out.println();

                // Reservation System
                System.out.println("=== Reservation System ===");
                System.out.println("Enter your reservation details here...");

                // Cancellation Form
                System.out.println();
                System.out.println("=== Cancellation Form ===");
                System.out.println("Enter your cancellation details here...");

                // Perform reservation or cancellation operations
                // ...

            } else {
                System.out.println("Invalid User ID or Password. Login failed!");
            }
        }
    }

    /**
     * @param enteredUserId
     * @param enteredPassword
     * @return
     */
    private static boolean authenticateUser(String enteredUserId, String enteredPassword) {
    return enteredUserId.equals(userId) && enteredPassword.equals(password);
}

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        TrainReservationSystem.userId = userId;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        TrainReservationSystem.password = password;
    }

    @Override
    public String toString() {
        return "TrainReservationSystem []";
    }



}
