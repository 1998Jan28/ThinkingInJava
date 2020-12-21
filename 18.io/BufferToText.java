import java.nio.*;
import java.io.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class BufferToText {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception {
		FileChannel fc = new FileOutputStream("data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();

		fc = new FileInputStream("data2.txt").getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		fc.read(buffer);
		buffer.flip();

		System.out.println(buffer.asCharBuffer());

		buffer.rewind();
		String encoding = System.getProperty("file.encoding");
		System.out.println("Decode using " + encoding + ": " + Charset.forName(encoding).decode(buffer));

		fc = new FileOutputStream("data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
		fc.close();
		fc = new FileInputStream("data2.txt").getChannel();
		buffer.clear();
		fc.read(buffer);
		buffer.flip();
		System.out.println(buffer.asCharBuffer());

		fc = new FileOutputStream("data2.txt").getChannel();
		buffer = ByteBuffer.allocate(24);
		buffer.asCharBuffer().put("Some text");
		fc.write(buffer);
		fc.close();
		fc = new FileInputStream("data2.txt").getChannel();
		buffer.clear();
		fc.read(buffer);
		buffer.flip();
		System.out.println(buffer.asCharBuffer());
	}
}
