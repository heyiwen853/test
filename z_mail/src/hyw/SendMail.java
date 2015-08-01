package hyw;

import org.apache.commons.mail.SimpleEmail;

public class SendMail {

	public static void main(String[] args) {
		send();
	}

	public static void send() {
		SimpleEmail email = new SimpleEmail();
		email.setTLS(true);
		email.setHostName("smtp.163.com");
		email.setAuthentication("@163.com", ""); // 用户名和密码
		try {
			email.addTo("@qq.com"); //接收人
			email.setFrom("@163.com"); // 发送方
			email.setSubject("粉红的云啊"); // 标题
			email.setMsg("飘香了山脚哇"); // 内容
			email.setCharset("utf-8");
			email.send();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}