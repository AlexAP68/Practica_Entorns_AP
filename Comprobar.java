import java.util.Random;
import java.util.Scanner;

public class Comprobar {


    // Método para comprobar la contraseña
    public static boolean compruebaPassword(String password) {
    boolean valido = false;

    // Comprobar que la contraseña cumple las restricciones
    if (password.matches("^[A-Z][a-zA-Z0-9_#@-]{6}[0-9]{2}$")) {
    valido = true;
    } else {
    System.out.println("La contraseña no cumple las restricciones");
    }

    return valido;
    }

    // Método para generar un código de seguridad aleatorio
    public static String generaCodigoSeguridad() {
    String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#-";
    Random rnd = new Random();
    StringBuilder sb = new StringBuilder(8);

    for (int i = 0; i < 8; i++) {
    sb.append(caracteres.charAt(rnd.nextInt(caracteres.length())));
    }

    System.out.println("El código de seguridad generado es: " + sb.toString());

    return sb.toString();
    }

    // Método para comprobar el código de seguridads
    public static boolean compruebaCodigoSeguridad(String codigo) {
    Scanner scanner = new Scanner(System.in);
    boolean valido = false;

    // Comprobar que el código introducido coincide con el generado
    System.out.println("Introduce el código de seguridad generado:");
    String codigoIntroducido = scanner.nextLine();
    if (codigoIntroducido.equals(codigo)) {
    valido = true;
    System.out.println("El codigo  es correcto");
    return valido;

    }
    else{
        System.out.println("El codigo no es correcto");
        return valido;
    }

}
}

