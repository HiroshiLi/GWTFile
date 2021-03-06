package gwtfile.client;

import gwtfile.shared.FieldVerifier;

import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FileUpload;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTFile implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);
	private PushButton pshbtnAddFile;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		Login login = new Login();
		login.show();
		RootLayoutPanel panel = RootLayoutPanel.get();
		
		Label lblNewLabel = new Label("File Manager");
		lblNewLabel.setStyleName("title");
		panel.add(lblNewLabel);
		panel.setWidgetLeftRight(lblNewLabel, 0.0, Unit.PX, 0.0, Unit.PX);
		panel.setWidgetTopHeight(lblNewLabel, 0.0, Unit.PX, 31.0, Unit.PX);
		
		Label lblC = new Label("C:");
		lblC.setStyleName("address");
		panel.add(lblC);
		panel.setWidgetLeftRight(lblC, 10.0, Unit.PX, 12.0, Unit.PX);
		panel.setWidgetTopHeight(lblC, 86.0, Unit.PX, 26.0, Unit.PX);
		
		ScrollPanel scrollPanel = new ScrollPanel();
		panel.add(scrollPanel);
		panel.setWidgetLeftRight(scrollPanel, 10.0, Unit.PX, 12.0, Unit.PX);
		panel.setWidgetTopBottom(scrollPanel, 128.0, Unit.PX, 15.0, Unit.PX);
		
		FlexTable flexTable = new FlexTable();
		flexTable.setStyleName("filetable");
		scrollPanel.setWidget(flexTable);
		flexTable.setSize("100%", "237px");
		
		PushButton pshbtnNew = new PushButton("new folder");
		panel.add(pshbtnNew);
		panel.setWidgetRightWidth(pshbtnNew, 12.0, Unit.PX, 112.0, Unit.PX);
		panel.setWidgetTopHeight(pshbtnNew, 47.0, Unit.PX, 26.0, Unit.PX);
		
		FormPanel formPanel = new FormPanel();
		panel.add(formPanel);
		panel.setWidgetLeftRight(formPanel, 10.0, Unit.PX, 130.0, Unit.PX);
		panel.setWidgetTopHeight(formPanel, 43.0, Unit.PX, 37.0, Unit.PX);
		
		FlexTable flexTable_1 = new FlexTable();
		formPanel.setWidget(flexTable_1);
		flexTable_1.setSize("100%", "100%");
		
		FileUpload fileUpload = new FileUpload();
		flexTable_1.setWidget(0, 0, fileUpload);
		fileUpload.setWidth("282px");
		
		pshbtnAddFile = new PushButton("add file");
		flexTable_1.setWidget(0, 1, pshbtnAddFile);
	};

		// Create a handler for the sendButton and nameField
		class MyHandler implements ClickHandler, KeyUpHandler {
			/**
			 * Fired when the user clicks on the sendButton.
			 */
			public void onClick(ClickEvent event) {
				
			}

			/**
			 * Fired when the user types in the nameField.
			 */
			public void onKeyUp(KeyUpEvent event) {
				
			}

			/**
			 * Send the name from the nameField to the server and wait for a response.
			 */
			private void sendNameToServer() {
				
			}
		}
}
