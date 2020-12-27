public enum OzWitch {
	WEST("dir west"),
	NORTH("dir north"),
	EAST("dir east"),
	SOUTH("dir south");

	private String desc;

	private OzWitch(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public static void main(String[] args) {
		for(OzWitch witch : OzWitch.values()) {
			System.out.println(witch + " : " + witch.getDesc());
		}
	}
}
