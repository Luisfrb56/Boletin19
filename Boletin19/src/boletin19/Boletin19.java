package boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Boletin19 {


    public static void main(String[] args) {
        
             ArrayList<Libros> listaLibros=new ArrayList<Libros>();
     listaLibros.add(new Libros("Bellas Durmientes","Stephen King","9788401020452", (float) 24.60,0));
     listaLibros.add(new Libros("Una Columna de fuego","Ken Follet","9780525497158", (float) 23.60,21));
     listaLibros.add(new Libros("Los Cuentos de Beedle el Bardo","J.K.Rowling","9782070656288", (float) 9.50,18));
     listaLibros.add(new Libros("El Silmarillion","J.R.R.Tolkien","9788445077955", (float) 20.95,8));
     listaLibros.add(new Libros("Las baladas de Beleriand","J.R.R.Tolkien","9780345388186", (float) 21.50,14));
 
 Metodos obx=new Metodos();
 boolean exit=true;
 do {
            try {
int num=Integer.parseInt(JOptionPane.showInputDialog("Opciones: \n1.Engadir Libro \n 2.Vender(Borrar) Libro \n3. Amosar os libros que temos \n4.Dar de Baixa \n5.Consultar Libro \n6.Salir"));
                switch (num) {
                case 1:
                    obx.engadirLibro(listaLibros);
                    obx.amosarLibros(listaLibros);
                    break;
                case 2:
                    obx.borrarLibro(listaLibros);
                    obx.amosarLibros(listaLibros);
                    break;
                case 3:
                    obx.amosarLibros(listaLibros);
                    break;

                case 4:
                    obx.dardeBaixa(listaLibros);
                    obx.amosarLibros(listaLibros);
                    break;
                case 5:
                    obx.consultarLibro(listaLibros);
                    break;

                case 6: 
                    exit=false;
                    break;

            }
               } catch (NumberFormatException exception) {
                System.out.println("Bye bye");
                exit=false;
            }

        } while (exit==true);
    }
    
}
