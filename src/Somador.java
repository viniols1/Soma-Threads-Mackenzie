public class Somador implements Runnable {
    private int[] vetor;
    private int inicio;
    private int fim;
    private long resultado;

    public Somador(int[] vetor, int inicio, int fim) {
        this.vetor = vetor;
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void run() {

        resultado = 0;
        for (int i = inicio; i < fim; i++) {
            resultado += vetor[i];
        }
        System.out.println("Thread somando do indice " + inicio + " ate " + (fim - 1) + " finalizada.");
    }

    public long getResultado() {
        return resultado;
    }
}