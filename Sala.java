import java.util.ArrayList;

public class Sala {
    ArrayList<Aluno> listaDeAlunos;
    
    public Sala() {
        this.listaDeAlunos = new ArrayList<>();
    }
    
    void insereAluno(Aluno novoAluno) {
        listaDeAlunos.add(novoAluno);
    }
    
    void listarAlunos() {
        System.out.println("\nLista de Alunos");
        
        for(Aluno alunoNaLista:listaDeAlunos) {
            alunoNaLista.listar();
        }
    }
}