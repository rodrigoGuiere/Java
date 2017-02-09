package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {
   
	public static void main(String[] args) {
		testExcluir();
	}	
	
	
	public static void testAlterar(){	
		Usuario usu = new Usuario();
		usu.setId(3);
		usu.setNome("Robson Machado");
		usu.setLogin("pombo");
        usu.setSenha("cachorro");
        
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.alterar(usu);
        
        System.out.println("Alterado com sucesso");
	}
	
	public static void testCadastrar(){	
		Usuario usu = new Usuario();
		usu.setNome("Robson");
		usu.setLogin("pombo");
        usu.setSenha("filha");
        
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.cadastrar(usu);
        
        System.out.println("Cadastrado com sucesso");
	}
    
	public static void testExcluir(){	
		Usuario usu = new Usuario();
		usu.setId(3);
		
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.excluir(usu);
        
        System.out.println("Excluido com sucesso");
	}
}
