package controller;

import java.util.ArrayList;
import model.bo.UsuarioBO;
import model.vo.UsuarioVO;


public class ControladoraUsuario {

	public void cadastrarUsuarioController(UsuarioVO usuarioVO) {
		UsuarioBO usuarioBO = new UsuarioBO(); 
		usuarioBO.cadastrarUsuarioBO(usuarioVO);
		
		
		
	}

	public void excluirUsuarioController(UsuarioVO usuarioVO) {
		UsuarioBO usuarioBO = new UsuarioBO(); 
		usuarioBO.excluirUsuarioBO(usuarioVO);
		
		
	}

	public void atualizarUsuarioController(UsuarioVO usuarioVO) {
		UsuarioBO usuarioBO = new UsuarioBO();
		usuarioBO.atualizarUsuarioBO(usuarioVO);
		
	}

	public ArrayList<UsuarioVO> consultarTodosUsuariosController() {
		UsuarioBO usuarioBO = new UsuarioBO();
		return usuarioBO.consultarTodosUsuariosBO();
		
	}


	public UsuarioVO consultarUsuarioCOntroller(UsuarioVO usuarioVO) {
		UsuarioBO usuarioBO = new UsuarioBO();
		return usuarioBO.consultarUsuarioBO(usuarioVO);
	}

	public ArrayList<UsuarioVO> consultarNomeUsuariosController(UsuarioVO usuarioVO) {
		UsuarioBO usuarioBO = new UsuarioBO();
		return usuarioBO.consultarNomesUsuariosBO(usuarioVO);
	}
	
}
