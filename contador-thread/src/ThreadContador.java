


// public class ThreadContador extends Thread {
    private boolean ordem;

    // Construtor que vai ser exigido na instanciação dessa classe.
    public ThreadContador(boolean ordem) {
        this.ordem = ordem;
    }

    // Sobreescrevendo o método run da classe Thread
    @Override
    public void run() {

        if (ordem) {

            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + getId() + ": " + i);

                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } else {

            for (int i = 10; i < 1; i--) {
                System.out.println("Thread " + getId() + ": " + i);

                try {
                    Thread.sleep(2000);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
