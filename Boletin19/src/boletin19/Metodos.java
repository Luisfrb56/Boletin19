package boletin19;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Metodos {

    public void engadirLibro(ArrayList<Libros> listaLibros) {
        String a = JOptionPane.showInputDialog("Dime el titulo:");
        String v = JOptionPane.showInputDialog("Dime el autor:");
        String c = JOptionPane.showInputDialog("Dime el ISBN del libro:");
        float d = Float.parseFloat(JOptionPane.showInputDialog("Dime el precio"));
        int r = Integer.parseInt(JOptionPane.showInputDialog("Dime el numero de unidades"));
        listaLibros.add(new Libros(a, v, c, d, r));
    }

    public void borrarLibro(ArrayList<Libros> listaLibros) {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Dime la posicion del libro que desear borrar"));
        listaLibros.remove(p);
    }

    public void amosarLibros(ArrayList<Libros> listaLibros) {
        Collections.sort(listaLibros);
        for (int x = 0; x < listaLibros.size(); x++) {
            System.out.println(listaLibros.get(x));

        }
    }
    public void dardeBaixa(ArrayList<Libros> listaLibros){
        
        for(Libros elemento : listaLibros){
            if (elemento.getnUnidades()==0);
            listaLibros.remove(elemento);
        }
    }
    
    public void consultarLibro(ArrayList<Libros>listaLibros){
        int p = Integer.parseInt(JOptionPane.showInputDialog("Dime la posicion del libro que desear borrar"));
        System.out.println(listaLibros.get(p));
    }

}
