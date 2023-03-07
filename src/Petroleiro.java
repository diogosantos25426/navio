public class Petroleiro extends Navio {
    private float capacidadeCarga;

    public Petroleiro(String matricula, String nome, float comprimento, float capacidadeCarga) {
        super(matricula, nome, comprimento);
        this.capacidadeCarga = capacidadeCarga;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}