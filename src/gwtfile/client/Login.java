package gwtfile.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.Button;

public class Login implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();
		
		Label lblNewLabel = new Label("Login");
		lblNewLabel.setStyleName("title");
		rootLayoutPanel.add(lblNewLabel);
		rootLayoutPanel.setWidgetLeftWidth(lblNewLabel, 0.0, Unit.PX, 363.0, Unit.PX);
		rootLayoutPanel.setWidgetTopHeight(lblNewLabel, 0.0, Unit.PX, 30.0, Unit.PX);
		
		Label lblUserId = new Label("User ID");
		rootLayoutPanel.add(lblUserId);
		rootLayoutPanel.setWidgetLeftWidth(lblUserId, 11.0, Unit.PX, 56.0, Unit.PX);
		rootLayoutPanel.setWidgetTopHeight(lblUserId, 64.0, Unit.PX, 18.0, Unit.PX);
		
		Label lblPassword = new Label("Password");
		rootLayoutPanel.add(lblPassword);
		rootLayoutPanel.setWidgetLeftWidth(lblPassword, 11.0, Unit.PX, 56.0, Unit.PX);
		rootLayoutPanel.setWidgetTopHeight(lblPassword, 113.0, Unit.PX, 18.0, Unit.PX);
		
		TextBox textBox = new TextBox();
		rootLayoutPanel.add(textBox);
		rootLayoutPanel.setWidgetLeftWidth(textBox, 73.0, Unit.PX, 192.0, Unit.PX);
		rootLayoutPanel.setWidgetTopHeight(textBox, 48.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox textBox_1 = new TextBox();
		rootLayoutPanel.add(textBox_1);
		rootLayoutPanel.setWidgetLeftWidth(textBox_1, 73.0, Unit.PX, 192.0, Unit.PX);
		rootLayoutPanel.setWidgetTopHeight(textBox_1, 97.0, Unit.PX, 34.0, Unit.PX);
		
		PushButton pshbtnNewButton = new PushButton("New button");
		pshbtnNewButton.setHTML("Login");
		rootLayoutPanel.add(pshbtnNewButton);
		rootLayoutPanel.setWidgetLeftWidth(pshbtnNewButton, 271.0, Unit.PX, 77.0, Unit.PX);
		rootLayoutPanel.setWidgetTopHeight(pshbtnNewButton, 48.0, Unit.PX, 83.0, Unit.PX);
	}
}
