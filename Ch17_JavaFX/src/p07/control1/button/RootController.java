package p07.control1.button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class RootController implements Initializable {
	@FXML private CheckBox chk1;//안경
	@FXML private CheckBox chk2;//모자
	@FXML private ImageView checkImageView;//안경,모자
	@FXML private ToggleGroup group;
	@FXML private ImageView radioImageView;	//Bubble,Bar,AreaChart
	@FXML private Button btnExit;//종료이미지

	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		RadioButton 또는 ToggleButton 그룹내에서 선택 변경을 감시하기 - 선택이 변경되면 changed() 실행되고 세번째 매개값인 newValue에 마지막으로 선택된 컨트롤이 대입된다.
		//ToggleGroup의 selectedToggle 속성감시 리스너 설정
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				//newValue.getUserData().toString() + ".png").toString() : 선택된 컨트롤의 userData 속성값
				Image image = new Image(getClass().getResource("images/" + newValue.getUserData().toString() + ".png").toString());
				radioImageView.setImage(image);
			}
		});
	}
	//CheckBox 이벤트 처리
	public void handleChkAction(ActionEvent e) {
		if(chk1.isSelected() && chk2.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
		} else if(chk1.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		} else if(chk2.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		} else {
			checkImageView.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
		}
	}	
	//Button 이벤트 처리
	public void handleBtnExitAction(ActionEvent e) {
		Platform.exit();
	}
}
