import java.io.*;
import java.util.concurrent.*;
import java.util.*;

public class Logon implements Serializable {
	private Date date = new Date();
	private String userName;
	private transient String password;

	public Logon(String name, String pwd) {
		userName = name;
		password = pwd;
	}

	public String toString() {
		return "logon info: \n userName: " + userName + "\ndate: " + date + "\npassword: " + password;
	}

	public static void main(String[] args) throws Exception {
		Logon a = new Logon("Hulk", "myLittlePony");
		System.out.println("logon a = " + a);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Logon.out"));
		out.writeObject(a);
		out.close();

		TimeUnit.SECONDS.sleep(1);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Logon.out"));
		System.out.println("Recovering object at: " + new Date());
		a = (Logon)in.readObject();
		System.out.println("logon a = " + a);
	}
}
