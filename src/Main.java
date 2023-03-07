import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criar o porto
        Porto porto = new Porto();

        // Criar um navio porta contentores
        Navio portaContentores = new PortaContentores("NC123", "Navio Porta Contentores", 50, 100);

        // Adicionar o navio ao porto
        if(porto.adicionarNavio(portaContentores)) {
            System.out.println("Navio adicionado com sucesso!");
        } else {
            System.out.println("Não foi possível adicionar o navio!");
        }

        // Tentar adicionar outro navio com a mesma matrícula
        Navio outroPortaContentores = new PortaContentores("NC123", "Outro Navio Porta Contentores", 70, 150);
        if(porto.adicionarNavio(outroPortaContentores)) {
            System.out.println("Navio adicionado com sucesso!");
        } else {
            System.out.println("Não foi possível adicionar o navio!");
        }

        // Criar um navio petroleiro
        Navio petroleiro = new Petroleiro("P123", "Navio Petroleiro", 80, 500);

        // Adicionar o navio ao porto
        if(porto.adicionarNavio(petroleiro)) {
            System.out.println("Navio adicionado com sucesso!");
        } else {
            System.out.println("Não foi possível adicionar o navio!");
        }

        // Consultar a quantidade máxima total de contentores de todos os navios porta contentores
        int totalContentores = porto.obterQuantidadeMaximaDeContentores();
        System.out.println("Quantidade máxima de contentores: " + totalContentores);

        // Consultar a capacidade total de carga de todos os navios porta contentores e petroleiros
        float totalCarga = porto.obterCapacidadeTotalDeCarga();
        System.out.println("Capacidade total de carga: " + totalCarga + " toneladas");
    }
}
