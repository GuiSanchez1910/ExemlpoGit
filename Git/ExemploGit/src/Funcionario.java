public class Funcionario {
    
    int matricula;
    String nome;

    public Funcionario() {}

    public Funcionario(int matricula, String nome) {
        this.nome = nome;
        this.matricula = matricula;
    }

    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\nNome: " + nome;
    }
}
