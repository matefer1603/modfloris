import javax.swing.*;

public class Usuarios {
    private String nombre;
    private String cedula;
    private String correo;
    private float dinero;

    public Usuarios(String nombre, String cedula, String correo, float dinero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.dinero = dinero;
    }

    // Getters y Setters

    public static Usuarios nuevosUsuarios() {
        float auxPlata = 0;
        String creadorUsuarioNombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del Usuario");
        String creadorUsuarioCedula = JOptionPane.showInputDialog(null, "Ingrese la cedula del Usuario");
        String creadorUsuarioCorreo = JOptionPane.showInputDialog(null, "Ingrese el correo del Usuario");
        String creadorUsuarioDinero = JOptionPane.showInputDialog(null, "Ingrese la plata con la que cuenta el usuario");
        auxPlata = Float.parseFloat(creadorUsuarioDinero);
        return new Usuarios(creadorUsuarioNombre, creadorUsuarioCedula, creadorUsuarioCorreo, auxPlata);
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " - Cédula: " + cedula + " - Correo: " + correo + " - Dinero: $" + dinero;
    }
}

