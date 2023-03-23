//: object/ShowProperties.java

package object;

public class ShowProperties {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}

} /// :~
