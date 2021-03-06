package controller;

import java.util.ArrayList;

import model.bo.DespesaBO;
import model.vo.DespesaVO;
import model.vo.UsuarioVO;

public class ControladoraDespesa {

	public void cadastrarDespesaController(DespesaVO despesaVO) {

		DespesaBO despesaBO = new DespesaBO();
		despesaBO.cadastrarDespesaBO(despesaVO);
		
		
	}


	public void atualizarDespesaController(DespesaVO despesaVO) {
		DespesaBO despesaBO = new DespesaBO();
		despesaBO.atualizarDespesaBO(despesaVO);
		
	}


	public void excluirDespesaController(DespesaVO despesaVO) {
		DespesaBO despesaBO = new DespesaBO(); 
		despesaBO.excluirDespesaBO(despesaVO);
		
	}


	public ArrayList<DespesaVO> consultarUmUsuarioController(UsuarioVO usuarioVO) {
		DespesaBO despesaBO = new DespesaBO();
		return despesaBO.consultarUmUsuario(usuarioVO);
	}


	public DespesaVO consultarDespesaCOntroller(DespesaVO despesaVO) {
		DespesaBO despesaBO = new DespesaBO();
		return despesaBO.consultarDespesaBO(despesaVO);
	}



}
