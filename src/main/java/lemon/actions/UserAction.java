/**
 * 
 */
package lemon.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author lemon
 *
 */
public class UserAction extends ActionSupport {
	private String name;
	private String pwd;
	private String msg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("execute...");
		return this.SUCCESS;
	}
	
	public String login() {
		System.out.println("login...");
		ActionContext context = ActionContext.getContext();
		Object uname = context.getSession().get("username");
		if (name.equals("lemon") && pwd.equals("abc")) {
			msg = "��¼�ɹ�����ӭ�㣺"+name;
			return this.SUCCESS;
		}
		else {
			msg = "�û������������";
			return this.ERROR;
		}
	}
	
	public String register() {
		System.out.println("register...");
		return this.SUCCESS;
	}
}
