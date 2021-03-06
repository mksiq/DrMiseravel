package view;

import javafx.fxml.FXML;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;

public class FXMLDespesaController {
	@FXML
	private Button btnUsuario;
	@FXML
	private Button btnReceita;
	@FXML
	private Button btnDespesa;
	@FXML
	private Button btnRelatorio;
	@FXML
	private Button brnSobre;
	@FXML
	private Button btnCadastrarDespesa;
	@FXML
	private Button btnConsultarPorCodigo;
	@FXML
	private Button btnAtualizar;
	@FXML
	private Button btnExcluir;
	@FXML
	private Button btnConsultarDespesaPorUsuario;

	// Event Listener on Button[#btnUsuario].onAction
	@FXML
	public void loadUsuario(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FXMLUsuario.fxml"));
		Scene scene = new Scene(parent, 800, 600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	// Event Listener on Button[#btnReceita].onAction
	@FXML
	public void loadReceita(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FXMLReceita.fxml"));
		Scene scene = new Scene(parent, 800, 600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	// Event Listener on Button[#btnDespesa].onAction
	@FXML
	public void loadDespesa(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FXMLDespesa.fxml"));
		Scene scene = new Scene(parent, 800, 600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	// Event Listener on Button[#btnRelatorio].onAction
	@FXML
	public void loadRelatorio(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FXMLDespesa.fxml"));
		Scene scene = new Scene(parent, 800, 600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	// Event Listener on Button[#brnSobre].onAction
	@FXML
	public void loadSobre(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FXMLSobre.fxml"));
		Scene scene = new Scene(parent, 800, 600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	// Event Listener on Button[#btnCadastrarDespesa].onAction
	@FXML
	public void loadCadastrarDespesa(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FXMLDespesaCadastro.fxml"));
		Scene scene = new Scene(parent, 800, 600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	// Event Listener on Button[#btnConsultarPorCodigo].onAction
	@FXML
	public void loadConsultarDespesaPorCod(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FXMLDespesaConsultarCodDespesa.fxml"));
		Scene scene = new Scene(parent, 800, 600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	// Event Listener on Button[#btnAtualizar].onAction
	@FXML
	public void loadAtualizarDespesa(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FXMLDespesaAtualizar.fxml"));
		Scene scene = new Scene(parent, 800, 600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	// Event Listener on Button[#btnExcluir].onAction
	@FXML
	public void loadExcluirDespesa(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FXMLDespesaExcluir.fxml"));
		Scene scene = new Scene(parent, 800, 600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	// Event Listener on Button[#btnConsultarDespesaPorUsuario].onAction
	@FXML
	public void loadConsultarDespesaPorUsuario(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FXMLDespesaConsultarIdUsuario.fxml"));
		Scene scene = new Scene(parent, 800, 600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
}
