import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese nombre");
        String nombrez = scan.nextLine();

        System.out.println("ingrese edad");
        int edadz = scan.nextInt();
        scan.nextLine();

        System.out.println("ingrese sexo (H/M)");
        char sexoz = scan.next().charAt(0); ///SCAN CHAR

        System.out.println("ingrese peso");
        double pesoz = scan.nextDouble();

        System.out.println("ingrese altura");
        double alturaz = scan.nextDouble();

        Persona persona1 = new Persona(nombrez, edadz, "", sexoz, pesoz, alturaz);
        Persona persona2 = new Persona("juan", 25, 'H');
        Persona persona3 = new Persona();
        persona3.setAlturaCm(177);
        persona3.setDNI("58463218");
        persona3.setSexo('H');
        persona3.setEdad(19);
        persona3.setNombre("carlos");
        persona3.setPesokg(75);

        HashMap<String, Persona> hashMap = new HashMap<>();
        hashMap.put(persona1.getDNI(), persona1);
        hashMap.put(persona2.getDNI(), persona2);    ///NO ME ESTA MOSTRANDO A UNO
        hashMap.put(persona3.getDNI(), persona3);

        ///for hashmap calcular imc
        /*
        for (String clave:mapa.keySet()) {
           int valor = mapa.get(clave);
           System.out.println("Clave: " + clave + ", valor: " + valor);
        }

     terator<String> it = mapa.keySet().iterator();
     while(it.hasNext()){
       String clave = it.next();
       int valor = mapa.get(clave);
       System.out.println("Clave: " + clave + ", valor: " + valor);
      }

      System.out.println("recorrer mediante entry");
      for (Map.Entry entry : mapa.entrySet()) {
         System.out.println(": " + entry.getKey() + " & Value: " + entry.getValue());
      }

      System.out.println("Recorrer solo valores");
      for (int valor : mapa.values()) {
         System.out.println("valor: " + valor);
      }
         */

        for (String key : hashMap.keySet()) {
            Persona x = hashMap.get(key);
            if (x.calcularIMC() == 1)
                System.out.println(x.getNombre() + "(" + x.getDNI() + ")" + " tiene sobrepeso");
            else if (persona1.calcularIMC() == 0)
                System.out.println(x.getNombre() + "(" + x.getDNI() + ")" + " esta en buen peso");
            else
                System.out.println(x.getNombre() + "(" + x.getDNI() + ")" + " esta por debajo de un buen peso");
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////PARTE 2/////////////////////////////////////////////////////////

        Password[] passwords = new Password[30];
        boolean[] passwordsAreStrong = new boolean[30];
        HashMap<Integer, Password> passes = new HashMap<>();

        Password pass1 = new Password(15); ///try catch para negativos?
        Password pass2 = new Password(33); ///try catch para negativos?
        Password pass3 = new Password(); ///try catch para negativos?
        passwords[0] = pass1;
        passwords[1] = pass2;
        passwords[2] = pass3;

        for (int i = 0; i < 3; i++) {
            passes.put(passwords[i].hashCode(), passwords[i]);
            passwordsAreStrong[i] = passwords[i].esFuerte();
            System.out.println(passwords[i].getContraseña() + "    //fuerte?...   " + passwordsAreStrong[i]);
        }


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////PARTE 3/////////////////////////////////////////////////////////-///
        Serie[] series = new Serie[5];
        Serie serie1 = new Serie("Breaking bad", "Vince Gilligan");
        Serie serie2 = new Serie();
        Serie serie3 = new Serie("Sopranos", 8, "Drama", "Carlos");
        Serie serie4 = new Serie("Stranger Things", 5, "Aventura", "Vince Gilligan");
        Serie serie5 = new Serie("Los Simuladores", "Diego Peretti");

        Videojuego[] videojuegos = new Videojuego[5];
        Videojuego videojuego1 = new Videojuego("GTA", 60);
        Videojuego videojuego2 = new Videojuego("Mafia3", 22);
        Videojuego videojuego3 = new Videojuego();
        Videojuego videojuego4 = new Videojuego("Fifa 22", 0, "Deportes", "EA");
        Videojuego videojuego5 = new Videojuego("Rainbow Six", 120, "Belico", "Ubisoft");

        for (int i = 0; i < 5; i++) { ///Como verificar con equals

        }

        ///metodo entregar??
        videojuego1.entregar();
        //videojuego1.entregado???????????????


        scan.close();
    }
}