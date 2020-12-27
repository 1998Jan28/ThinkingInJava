import java.nio.*;

public class UsingBuffers {
	private static void symmetricScramble(CharBuffer buff) {
		while(buff.hasRemaining()) {
			buff.mark();
			char c1 = buff.get();
			char c2 = buff.get();
			buff.reset();
			buff.put(c2).put(c1);
		}
	}
	public static void main(String[] args) {
		char[] data = "UsingBuffers".toCharArray();
		ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
		CharBuffer cb = bb.asCharBuffer();
		cb.put(data);
		System.out.println(cb.rewind());
		symmetricScramble(cb);
		System.out.println(cb.rewind());
		symmetricScramble(cb);
		System.out.println(cb.rewind());
	}
}
