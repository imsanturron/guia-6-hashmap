public class Audiovisuales {
    protected boolean entregado = false;

    public void entregar() {
        entregado = true;
    }

    public void devolver() {
        entregado = false;
    }

    public boolean isEntregado() {
        return entregado;
    }
}
