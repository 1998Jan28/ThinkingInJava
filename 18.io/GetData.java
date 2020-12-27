import java.nio.*;

public class GetData {
	private static final int BSIZE = 1024;
	public static void main(String[] args) {
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		int i = 0;
		while(i++ < buff.limit()) {
			if(buff.get() != 0) {
				System.out.println("non-zero");
			}
		}
		System.out.println("i = " + i);
		
		buff.rewind();
		buff.asCharBuffer().put("Howdy!");
		char c;
		while((c = buff.getChar()) != 0) {
			System.out.print(c + " ");
		}
		System.out.println();

		buff.rewind();
		buff.asShortBuffer().put((short)123);
		System.out.println(buff.getShort());

		buff.rewind();
		buff.asIntBuffer().put(66666);
		System.out.println(buff.getInt());

		buff.rewind();
		buff.asLongBuffer().put(6666666L);
		System.out.println(buff.getLong());

		buff.rewind();
		buff.asFloatBuffer().put(666.666f);
		System.out.println(buff.getFloat());

		buff.rewind();
		buff.asDoubleBuffer().put(666.666);
		System.out.println(buff.getDouble());
		buff.rewind();
	}
}
