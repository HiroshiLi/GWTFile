package gwtfile.client;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.PushButton;



public class Login extends DialogBox {
	public Login() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		setWidget(layoutPanel);
		layoutPanel.setSize("373px", "122px");
		
		Label lblLogin = new Label("Login");
		lblLogin.setStyleName("title");
		layoutPanel.add(lblLogin);
		layoutPanel.setWidgetLeftRight(lblLogin, 0.0, Unit.PX, -2.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblLogin, 0.0, Unit.PX, 28.0, Unit.PX);
		
		Label lblUserId = new Label("User ID");
		layoutPanel.add(lblUserId);
		layoutPanel.setWidgetLeftWidth(lblUserId, 10.0, Unit.PX, 56.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblUserId, 50.0, Unit.PX, 18.0, Unit.PX);
		
		Label lblPassword = new Label("Password");
		layoutPanel.add(lblPassword);
		layoutPanel.setWidgetLeftWidth(lblPassword, 10.0, Unit.PX, 56.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblPassword, 90.0, Unit.PX, 18.0, Unit.PX);
		
		TextBox textBox = new TextBox();
		layoutPanel.add(textBox);
		layoutPanel.setWidgetLeftWidth(textBox, 72.0, Unit.PX, 208.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox, 34.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox textBox_1 = new TextBox();
		layoutPanel.add(textBox_1);
		layoutPanel.setWidgetLeftWidth(textBox_1, 72.0, Unit.PX, 208.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox_1, 74.0, Unit.PX, 34.0, Unit.PX);
		
		PushButton pshbtnNewButton = new PushButton("Login");
		layoutPanel.add(pshbtnNewButton);
		layoutPanel.setWidgetLeftWidth(pshbtnNewButton, 286.0, Unit.PX, 77.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(pshbtnNewButton, 34.0, Unit.PX, 74.0, Unit.PX);
		onModuleLoad();
	}

	public void onModuleLoad() {
		
	}
}
