public interface UserManagementService {
    boolean registerUser(String username, String password);
    boolean login(String username, String password);
}