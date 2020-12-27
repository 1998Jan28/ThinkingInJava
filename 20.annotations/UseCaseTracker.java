import java.lang.reflect.*;
import java.util.*;

public class UseCaseTracker {
	public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
		for(Method m : cl.getDeclaredMethods()) {
			UseCase uc = m.getAnnotation(UseCase.class);
			if(uc != null) {
				System.out.println("Found Use Case: " + uc.id() + " " + uc.description());
				useCases.remove(new Integer(uc.id()));
			}
		}
		for(int i : useCases) {
			System.out.println("Warning: Miss use case-" + i);
		}
	}

	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 36, 37, 38, 39);
		trackUseCases(useCases, PasswordUtils.class);
	}
}
