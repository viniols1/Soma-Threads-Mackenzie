public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[100];
        for (int i = 0; i < 100; i++) {
            vetor[i] = i + 1;
        }

        Somador tarefa1 = new Somador(vetor, 0, 50);
        Somador tarefa2 = new Somador(vetor, 50, 100);

        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);

        t1.start();
        t2.start();

        try {

            t1.join();
            t2.join();

            long somaTotal = tarefa1.getResultado() + tarefa2.getResultado();

            System.out.println("------------------------------------");
            System.out.println("Soma total calculada: " + somaTotal);
            System.out.println("------------------------------------");

        } catch (InterruptedException e) {
            System.out.println("Erro ao aguardar as threads.");
        }
    }
}
