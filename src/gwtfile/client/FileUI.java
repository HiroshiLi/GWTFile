package gwtfile.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.ScrollPanel;

public class FileUI extends Composite {
	
	public FileUI() {
		
		DockLayoutPanel dockLayoutPanel = new DockLayoutPanel(Unit.EM);
		initWidget(dockLayoutPanel);
		dockLayoutPanel.setSize("532px", "277px");
		
		Label lblNewLabel = new Label("File Mannager");
		lblNewLabel.setStyleName("title");
		dockLayoutPanel.addNorth(lblNewLabel, 2.4);
		
		FormPanel formPanel = new FormPanel();
		dockLayoutPanel.addNorth(formPanel, 2.9);
		
		FileUpload fileUpload = new FileUpload();
		formPanel.setWidget(fileUpload);
		fileUpload.setSize("525px", "29px");
		
		FlexTable flexTable = new FlexTable();
		dockLayoutPanel.addWest(flexTable, 10.2);
		
		PushButton pshbtnDeletFile = new PushButton("Delet File");
		flexTable.setWidget(0, 0, pshbtnDeletFile);
		
		PushButton pshbtnNewFolder = new PushButton("New Folder");
		flexTable.setWidget(1, 0, pshbtnNewFolder);
		
		Label lblNewLabel_1 = new Label("C :");
		lblNewLabel_1.setStyleName("address");
		dockLayoutPanel.addNorth(lblNewLabel_1, 1.7);
		
		ScrollPanel scrollPanel = new ScrollPanel();
		dockLayoutPanel.add(scrollPanel);
		
		FlexTable flexTable_1 = new FlexTable();
		flexTable_1.setStyleName("filetable");
		scrollPanel.setWidget(flexTable_1);
		flexTable_1.setSize("100%", "184px");
		// TODO Auto-generated constructor stub
		onModuleLoad();
	}
	
	public void onModuleLoad() {
	}

}
