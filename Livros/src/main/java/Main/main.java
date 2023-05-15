package Main;

import livros.Livro;
import operacao.LivroDAO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LivroDAO dao = new LivroDAO();

		Livro livro = new Livro();
		livro.setTitulo("Dom Casmurro");
		livro.setAutor("Machado de Assis");
		livro.setTipo("Romance");
		
		Livro livro2 = new Livro();
		livro2.setTitulo("SPQR");
		livro2.setAutor("Mary Beard");
		livro2.setTipo("Historia");
		
		Livro livro3 = new Livro();
		livro3.setTitulo("The Story of China");
		livro3.setAutor("Michael Wood");
		livro3.setTipo("Historia");

		dao.inserir(livro);
		dao.inserir(livro2);
		dao.inserir(livro3);
		
		dao.atualizar(livro);
		dao.excluir(0);
		dao.consultar(0);
		


	}

}
