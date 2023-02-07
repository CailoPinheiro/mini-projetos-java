public class Numero {
    private int valor;

    public Numero() {
        this.valor = 0;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public int somar(int a, int b) {
        return (a + b);
    }

    public int subtract(int a, int b) {
        return (a - b);
    }

    public int multi(int a, int b) {
        return (a * b);
    }

    public int div(int a, int b) {
        return (a / b);
    }
}
