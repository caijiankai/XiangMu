package cn.strutsdemo;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action {

	private String name="";
	private String message="";
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.setMessage("Hello !" +this.getName());
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
