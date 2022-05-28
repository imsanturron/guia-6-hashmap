import java.util.Objects;

public class Videojuego extends Audiovisuales implements Comparable<Videojuego> {
    private String titulo = "";
    private int horasEstimadas = 10;
    private String genero = "";
    private String compania = "";

    public Videojuego() {
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public int compareTo(Videojuego o) {
        if (this.horasEstimadas > o.horasEstimadas)
            return 1;
        else if (this.horasEstimadas == o.horasEstimadas)
            return 0;
        else
            return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Videojuego that = (Videojuego) o;
        return Objects.equals(titulo, that.titulo) && Objects.equals(compania, that.compania);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, compania);
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                ", entregado=" + entregado +
                '}';
    }
}
