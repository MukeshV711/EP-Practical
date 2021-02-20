public class Bean {

	private int id;

	private String name;

	private String password;

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private int section;

	private int year;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;

	}

	public int getSection() {

		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

}