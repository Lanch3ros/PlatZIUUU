package platzi.play.plataforma;
import platzi.play.contenido.Pelicula;
import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private String nombre;
    private List<Pelicula> peliculas;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.peliculas = new ArrayList<>();
    }

    public void agregar(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarPeliculas() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo());
        }
    }

    public void eliminar(Pelicula pelicula) {
        this.peliculas.remove(pelicula);
    }

}
