port javax.swing.*;

public class FloristeriaJavaManager {
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
        Productos l1=new Productos("Rosas", "5452", "Rojo", "Si", 0.30, 100);
        Productos l2=new Productos("Tulipan", "5034", "Blanca","No" , 0.40, 10);
        Productos l3=new Productos("Bugambilia", "2307", "Morada", "Si", 0.90, 18);
        //Objetos (Usuarios)
        Usuarios u1=new Usuarios("Camilo Brazales", "1234567890", "camilo.brazalez@udla.edu.ec",50);
        Usuarios u2=new Usuarios("Mateo Romero", "0987654321", "mateo.romero@yahoo.com",25.3f);

        //Menu roles
        c=0;
        switch (opcion) {
            case 1://Admin
                while (true)
                {
                    while (true){
                        c=0;
                        String operacionadmin= JOptionPane.showInputDialog(null,"Que desea realizar?\n 1)Observar el catalogo \n 2)Añadir productos \n  3)Añadir usuario \n 4)Lista de usuarios\n 5)Salir");
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
                            JOptionPane.showMessageDialog(null,"ver productos");
                            break;
                        case 2://Añadir libros
                            Productos.nuevosproductos();
                            JOptionPane.showMessageDialog(null,"Se añadio un nuevo producto");
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
