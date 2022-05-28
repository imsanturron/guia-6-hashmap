import java.util.Objects;
import java.lang.*;

public class Password implements Comparable<Password> {
    private int longitud = 8;
    private String contraseña;

    public Password() {
        contraseña = generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;

        contraseña = generarPassword();
    }

    public boolean esFuerte() {
        /*devuelve un booleano si es fuerte o no, para que sea fuerte debe tener
           más de 2 mayúsculas, más de 1 minúscula y más de 5 números.*/
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            if (contraseña.charAt(i) == contraseña.toLowerCase().charAt(i) && !Character.isDigit(contraseña.charAt(i)))
                minusculas++;
            else if (contraseña.charAt(i) == contraseña.toUpperCase().charAt(i) && !Character.isDigit(contraseña.charAt(i)))
                mayusculas++;
            else if (Character.isDigit(contraseña.charAt(i)))
                numeros++;
        }

        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    public String generarPassword() {
        String contra = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            // generate a random number between 0 to AlphaNumericString variable length
            int index = (int) (contra.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(contra.charAt(index));
        }
        return sb.toString();
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return longitud == password.longitud && Objects.equals(contraseña, password.contraseña);
    }

    @Override
    public int hashCode() {
        return Objects.hash(longitud, contraseña);
    }

    @Override
    public int compareTo(Password o) {
            return this.contraseña.compareTo(o.contraseña);
    }

}
