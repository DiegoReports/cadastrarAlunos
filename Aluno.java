public class Aluno {
    String nome, disciplina;
    
    public Aluno() {
        
    }
    
    public Aluno(String nome, String disciplina) {
        setNome(nome);
        setDisciplina(disciplina);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDisciplina() {
        return disciplina;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    void listar() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nDisciplina: " + this.disciplina);
    }
}