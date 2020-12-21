import java.nio.*;
import java.io.*;
import java.nio.channels.*;

public class ChannelCopy {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception {
		if(args.length != 2) {
			System.out.println("arguments: sourcefile destfile");
			System.exit(1);
		}
		FileChannel in = new FileInputStream(args[0]).getChannel(), out = new FileOutputStream(args[1]).getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		while(in.read(buffer) != -1) {
			buffer.flip();  // prepare for writing
			out.write(buffer);
			buffer.clear();  // prepare for reading
		}

		// in.transferTo(0, in.size(), out);
	}
}
