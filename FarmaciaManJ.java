import javax.swing.*;

public class BIbliotecaJavaManager {
    public static void main(String[] args) {
        //Definicion de rol
        int opcion=0;
        int opcionadmin=0;
        int opcionuser=0;
        int c=0;//Contador

        while (true)
        {
            c=0;
            String operacion= JOptionPane.showInputDialog(null,"Cual es su rol \n 1)Administrador \n 2)Usuario ");
            try {
                opcion=Integer.parseInt(operacion);
                if (Funcionalidades.comprobacion(opcion,2,1)){
                    break;
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"El tipo de valor ingresado no es valido");
                c=1;
            }
            if (c!=1){
                JOptionPane.showMessageDialog(null,"El valor ingresado no esta dentro del rango permitido");

            }

        }
        //Objetos (Libros)
        Productos l1=new Productos("Cien años de soledad", "9780307352412", "Gabriel García Márquez", "Si", 29.99, 10);
        Productos l2=new Productos("To Kill a Mockingbird", "0061120081", "Harper Lee","No" , 19.99, 0);
        Productos l3=new Productos("1984", "9780451524935", "George Orwell", "Si", 14.99, 8);
        Productos l4=new Productos("The Great Gatsby", "9780743273565", "F. Scott Fitzgerald", "Si", 24.99, 12);
        Productos l5=new Productos("Harry Potter and the Sorcerer's Stone", "9780590353427", "J.K. Rowling", "No", 17.99, 0);
        //Objetos (Usuarios)
        Usuarios u1=new Usuarios("Juan Pérez", "1234567890", "juan.perez@udla.edu.ec",50);
        Usuarios u2=new Usuarios("María González", "0987654321", "maria.gonzalez@yahoo.com",25.3f);
        Usuarios u3=new Usuarios("Carlos Rodríguez", "5678901234", "carlos.rodriguez@gmail.com",51.1f);
        Usuarios u4=new Usuarios("Ana López", "3210987654", "ana.lopez@outlook.com",70);
        Usuarios u5=new Usuarios("Pedro Sánchez", "9876543210", "pedro.sanchez@gmail.com",5);

        //Menu roles
        c=0;
        switch (opcion) {
            case 1://Admin
                while (true)
                {
                    while (true){
                        c=0;
                        String operacionadmin= JOptionPane.showInputDialog(null,"Que desea realizar?\n 1)Observar el catalogo \n 2)Añadir libros \n  3)Añadir usuario \n 4)Lista de usuarios\n 5)Salir");
                        try {
                            opcionadmin=Integer.parseInt(operacionadmin);
                            if (Funcionalidades.comprobacion(opcionadmin,5,1)){//Se rompe el bucle si la funcion comprobacion devuelve un true
                                break;
                            }
                        }catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null,"El tipo de valor ingresado no es valido");
                            c=1;
                        }
                        if (c!=1){
                            JOptionPane.showMessageDialog(null,"El valor ingresado no esta dentro del rango permitido");

                        }
                    }

                    switch (opcionadmin){//Switch para llamar a los metodos en base a la respuesta del admin
                        case 1://Observar el catalogo

                            JOptionPane.showMessageDialog(null,"",Productos);
                            break;
                        case 2://Añadir libros
                            Productos.nuevosproductos();
                            JOptionPane.showMessageDialog(null,"Se añadio un nuevo libro");
                            break;
                        case 3://Añadir usuarios manualmente
                            Usuarios.nuevosUsuarios();
                            JOptionPane.showMessageDialog(null,"Se añadio un nuevo usuario");
                            break;
                        case 4://lista de usuarios
                            break;
                        case 5://Salir
                            System.exit(0);
                            break;
                    }
                }

            case 2://Usuario
                c=0;
                String loginemail= JOptionPane.showInputDialog(null,"Login\n Email:");
                String logincontraseña= JOptionPane.showInputDialog(null,"Login\n Contraseña:");
                while (true){
                    c=0;
                    String operacionuser= JOptionPane.showInputDialog(null,"Que desea realizar?\n 1)Observar el catalogo \n 2)Comprar\n 3)Salir");
                    try {
                        opcionuser=Integer.parseInt(operacionuser);
                        if (Funcionalidades.comprobacion(opcionuser,5,1)){
                            break;
                        }
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"El tipo de valor ingresado no es valido");
                        c=1;
                    }
                    if (c!=1){
                        JOptionPane.showMessageDialog(null,"El valor ingresado no esta dentro del rango permitido");
                    }
                }
                switch (opcionuser){//Switch para llamar a los metodos en base a la respuesta del usuario
                    case 1://Observar catalogo
                        break;
                    case 2://Comprar
                        break;
                    case 3://Salir
                        System.exit(0);
                        break;

                }
                break;
        }

    }
}