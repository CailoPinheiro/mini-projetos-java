public class App {
    public static void main(String[] args) throws Exception {

        ThreadContador cont = new ThreadContador(true);
        ThreadContador reverseCont = new ThreadContador(false);

      //  cont.start();
        reverseCont.start();
        cont.start();
    }
}
