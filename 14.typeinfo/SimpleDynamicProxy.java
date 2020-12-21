import java.lang.reflect.*;

class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;
	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("*** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
		if(args != null) {
			for(Object arg : args) {
				System.out.println(" " + arg);
			}
		}
		return method.invoke(proxied, args);
	}
}

interface Interface {
	void doSomething();
	void doSomethingElse(String arg);
}

class RealObject implements Interface {
	public void doSomething() {
		System.out.println("doSomething");
	}
	public void doSomethingElse(String arg) {
		System.out.println("doSomethingElse " + arg);
	}
}

public class SimpleDynamicProxy {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.doSomethingElse("bonobo");
	}

	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{ Interface.class }, new DynamicProxyHandler(real));
		consumer(proxy);
	}
}
