package main;

import com.fasterxml.jackson.core.JsonProcessingException;
import controlls.ManagingDatabase;

public class main {
    public static void main(String[] args) throws JsonProcessingException {


        ManagingDatabase managingDatabase = new ManagingDatabase();

//        managingDatabase.InserirDocumento("livros", new ArrayList<Object>(livro.criarLivro()));
//        managingDatabase.InserirDocumento("editoras", new ArrayList<Object>(editora.criarEditoras()));

//        managingDatabase.showCollection("livros");
//        managingDatabase.showCollection("editoras");

        managingDatabase.buscarLivrosPorTitulo("Banco de Dados");
    }
}
