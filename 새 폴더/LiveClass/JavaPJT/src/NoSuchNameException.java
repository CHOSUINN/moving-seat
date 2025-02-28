
public class NoSuchNameException extends RuntimeException {
	
	
	private static final long serialVersionUID = 1L;
	private String name;
	
	public NoSuchNameException (String name) {
		super(name + "이라는 사람은 없어요!");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
