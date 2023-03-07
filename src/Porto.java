import java.util.ArrayList;
import java.util.HashMap;

public class Porto {
    private ArrayList<Navio> navios;
    private HashMap<String, Navio> naviosPorMatricula;

    public Porto() {
        navios = new ArrayList<>();
        naviosPorMatricula = new HashMap<>();
    }

    public boolean adicionarNavio(Navio navio) {
        if (naviosPorMatricula.containsKey(navio.getMatricula())) {
            return false; // não foi possível adicionar o navio, matrícula já existe
        }
        naviosPorMatricula.put(navio.getMatricula(), navio);
        navios.add(navio);
        return true; // navio adicionado com sucesso
    }

    public int obterQuantidadeMaximaDeContentores() {
        int quantidadeMaxima = 0;
        for (Navio navio : navios) {
            if (navio instanceof PortaContentores) {
                PortaContentores portaContentores = (PortaContentores) navio;
                quantidadeMaxima += portaContentores.getNumMaxContentores();
            }
        }
        return quantidadeMaxima;
    }

    public float obterCapacidadeTotalDeCarga() {
        float capacidadeTotal = 0;
        for (Navio navio : navios) {
            if (navio instanceof PortaContentores) {
                PortaContentores portaContentores = (PortaContentores) navio;
                capacidadeTotal += portaContentores.getNumMaxContentores() * 10;
            } else if (navio instanceof Petroleiro) {
                Petroleiro petroleiro = (Petroleiro) navio;
                capacidadeTotal += petroleiro.getCapacidadeCarga();
            }
        }
        return capacidadeTotal;
    }
}
