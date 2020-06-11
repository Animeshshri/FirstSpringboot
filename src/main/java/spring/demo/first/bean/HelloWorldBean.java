package spring.demo.first.bean;


public class HelloWorldBean {
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + ", toString()=" + super.toString() + "]";
	}

	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}
	

}
