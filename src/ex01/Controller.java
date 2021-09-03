package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import ex01.loginService.LoginServiceImpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	@FXML TextField fxId;	// 신빌더에서 지정한 클래스파일에서만 쓸수있다

	private Parent root;
	
	LoginServiceImpl lo = new LoginServiceImpl();
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void LoginProc() {
	/*	System.out.println("로그인 버튼 클릭");
		TextField t = (TextField)root.lookup("#fxId"); // FXML을 못쓸때 사용
		System.out.println(t.getText());				//// FXML을 못쓸때 사용
		System.out.println("FXML을 사용 : "+fxId.getText());*/
		lo.LoginProc(root);
	}
	
	public void CancelProc() {
		lo.CancelProc(root);
	}
	
	public void OpenMembershipFoorm() {
		lo.OpenMembershipFoorm();
	}
	
	
}
