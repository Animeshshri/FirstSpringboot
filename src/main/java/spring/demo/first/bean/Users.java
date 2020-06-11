package spring.demo.first.bean;

public class Users {
	
	public String name;
	public Users(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Users [name=" + name + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int id;

}
