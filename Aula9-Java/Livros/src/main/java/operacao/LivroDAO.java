package operacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import livros.Livro;


public class LivroDAO {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    static {
        emf = Persistence.createEntityManagerFactory("livros");
        em = emf.createEntityManager();
    }

    public void inserir(Livro livro) {
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
    }

    public void atualizar(Livro livro) {
        em.getTransaction().begin();
        em.merge(livro);
        em.getTransaction().commit();
    }

    public void excluir(int id) {
        em.getTransaction().begin();
        Livro livro = em.find(Livro.class, id);
        em.remove(livro);
        em.getTransaction().commit();
    }

    public Livro consultar(int id) {
        Livro livro = em.find(Livro.class, id);
        return livro;
    }


    public void fechar() {
        em.close();
        emf.close();
    }
}
