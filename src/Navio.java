public class Navio {
    private String matricula;
    private String nome;
    private float comprimento;

    public Navio(String matricula, String nome, float comprimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.comprimento = comprimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
}
