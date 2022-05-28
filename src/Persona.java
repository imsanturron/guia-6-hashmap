import java.util.Random;

public class Persona {
    private static final char HOMBREDEFAULTSX = 'H';
    private String nombre = "";
    private int edad = 0;
    private String DNI = "";
    private char sexo = HOMBREDEFAULTSX;
    private double pesokg = 0;
    private double alturaCm = 0;

    public Persona() { ///esta bien asi o inicializar aca
        generaDni();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generaDni();
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.pesokg = peso;
        this.alturaCm = altura;
    }

    public int calcularIMC() { ///constantes para devolver valores?
        double imc = pesokg / (alturaCm / 100) * (alturaCm / 100);
        if (imc < 20)
            return -1;
        else if (imc >= 20 && imc <= 25)
            return 0;
        else
            return 1;

    }

    public boolean esMayorDeEdad() {
        if (edad >= 18)
            return true;
        else
            return false;
    }

    public boolean comprobarSexo(char sexo) {
        if (this.sexo == sexo)
            return true;
        else
            sexo = 'H';

        return false;
    }

    public void generaDni() {
        int aleatorio = (int) (Math.random() * 8) + 1; ///genera hasta 8 asi?
        ///luego letra
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPesokg(double pesokg) {
        this.pesokg = pesokg;
    }

    public void setAlturaCm(double alturaCm) {
        this.alturaCm = alturaCm;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", pesokg=" + pesokg +
                ", alturaCm=" + alturaCm +
                '}';
    }
}
