public class Quarto {
    private int numero;
    private boolean ocupado;

    public Quarto(int numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public double getPrecoDiaria() {
        return 50.0;
    }

    public int getCapacidade() {
        return 1;
    }
}
