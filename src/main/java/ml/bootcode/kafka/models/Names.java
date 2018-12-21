package ml.bootcode.kafka.models;

public class Names {

	private long userId;
	private String name;

	public Names(long userId, String name) {
		this.userId = userId;
		this.name = name;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Names [userId=" + userId + ", name=" + name + "]";
	}
}
