package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.vo.UsuarioVO;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;

import controller.ControladoraUsuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;

public class FXMLUsuarioConsultarTodosController implements Initializable{
	@FXML
	private Button btnConsultarUsuarios;
	@FXML
	private Button btnVoltar;
	@FXML
	private Text lblTitulo;
	@FXML
	private TableView<UsuarioVO> tblTabela;
	@FXML
	private TableColumn<UsuarioVO, String> clnCod;
	@FXML
	private TableColumn<UsuarioVO, String> clnNome;
	@FXML
	private TableColumn<UsuarioVO, String> clnCPF;
	@FXML
	private TableColumn<UsuarioVO, String> clnTelefone;

	private List<UsuarioVO> listaUsuariosVO = new ArrayList();
	

	
	private ObservableList<UsuarioVO> observableListUsuarios;
	
	public void carregarTableViewUsuarios() {
		ControladoraUsuario controladoraUsuario = new ControladoraUsuario();
		listaUsuariosVO = controladoraUsuario.consultarTodosUsuariosController();
		
		observableListUsuarios = FXCollections.observableArrayList(listaUsuariosVO);
		clnCod.setCellValueFactory(new PropertyValueFactory<>("idUsuario"));
		clnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		clnCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		clnTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		
		
		
		
		tblTabela.setItems(observableListUsuarios);
		
		
		
		
		
		
	}
	
	public void teste(ActionEvent event) {
//
//		TableView<UsuarioVO> searchResultsTable;
//		searchResultsTable.selectionModelProperty().addListener((Observable observable) -> {
//			int index = tblTabela.getSelectionModel().getSelectedIndex();
//			UsuarioVO usuario = tblTabela.get(index);
//		});
//		
//			
//		ArrayList<UsuarioVO> lista = new ArrayList<UsuarioVO>();
//		ObservableList<TableViewSelectionModel<UsuarioVO>> observableListUsuarios2;
//		observableListUsuarios2 = FXCollections.observableArrayList(tblTabela.getSelectionModel());
//		observableListUsuarios2.
//		//usuarioVO = (UsuarioVO) observableListUsuarios2
//		
//		System.out.println((observableListUsuarios2.toString()));
//		//lista = tblTabela.getSelectionModel();
	}
	
	// Event Listener on Button.onAction
	@FXML
	public void loadUsuario(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button.onAction
	@FXML
	public void loadReceita(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnConsultarUsuarios].onAction
	@FXML
	public void consultarUsuarios(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnVoltar].onAction
	@FXML
	public void voltarUsuario(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FXMLUsuario.fxml"));
		Scene scene = new Scene(parent, 800, 600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		carregarTableViewUsuarios();
	}
}
