
package boletin19;


public class Libros implements Comparable<Libros>{
    private String titulo;
    private String autor;
    private String isbn;
    private float prezo;
    private int nUnidades;

    public Libros(String titulo, String autor, String isbn, float prezo, int nUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.nUnidades = nUnidades;
    }

    public Libros() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getnUnidades() {
        return nUnidades;
    }

    public void setnUnidades(int nUnidades) {
        this.nUnidades = nUnidades;
    }

    @Override
    public String toString() {
        return "Libro:\n" + "Titulo:" + titulo + " Autor:" + autor + "\nISBN: " + isbn + " Prezo:" + prezo + "€ Numero de unidades:" + nUnidades+"\n";
    }

public int compareTo(Libros t){
 int resultado=0;
 if(this.titulo.compareToIgnoreCase(t.titulo)>0){
     resultado=1;
 }else if(this.titulo.compareToIgnoreCase(t.titulo)==0){
     resultado=0;
 }else{
     resultado=-1;
 }
        return resultado;
    
}
}
