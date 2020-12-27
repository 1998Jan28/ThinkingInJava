import java.util.*;

public class PasswordUtils {
	@UseCase(id = 37, description = "Passwords must contain at least one numeric")
	public boolean validatePssword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}

	@UseCase(id = 38)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}

	@UseCase(id = 39, description = "New Passwords can't equal previously used ones")
	public boolean checkForNewPassword(List<String> prevPasswords, String password) {
		return !prevPasswords.contains(password);
	}
}
