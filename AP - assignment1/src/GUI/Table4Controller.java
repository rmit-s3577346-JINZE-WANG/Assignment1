package GUI;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Table4Controller implements Initializable {

	@FXML
	TableView<Table4> allResultsTable;
	@FXML
	TableColumn<Table4, String> iGameID4;
	@FXML
	TableColumn<Table4, String> iType4;
	@FXML
	TableColumn<Table4, String> iID4;
	@FXML
	TableColumn<Table4, String> iName4;
	@FXML
	TableColumn<Table4, String> iRank4;
	

	@FXML
	public Button goBack;

	final ObservableList<Table4> data4 = FXCollections.observableArrayList(
			new Table4("S01", "Referee", "A01", "Wayne","None"),
			new Table4("S01", "Swimmer", "A02", "Oliver","1"), 
			new Table4("S01", "Swimmer", "6.05", "Tim","2"));

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		iGameID4.setCellValueFactory(new PropertyValueFactory<Table4, String>("rGameID4"));
		iType4.setCellValueFactory(new PropertyValueFactory<Table4, String>("rType4"));
		iID4.setCellValueFactory(new PropertyValueFactory<Table4, String>("rTime4"));
		iName4.setCellValueFactory(new PropertyValueFactory<Table4, String>("rPoints4"));
		iRank4.setCellValueFactory(new PropertyValueFactory<Table4, String>("rPoints4"));

		allResultsTable.setItems(data4);
	}

}