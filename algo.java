import java.util.ArrayList;
import java.util.List;

class Conferencia {
    private String nombre;
    private List<Sesion> sesions;

    public Conferencia(String nombre) {
        this.nombre = nombre;
        this.sesions = new ArrayList<>();
    }

    public void anhadirSesion(Sesion sesion) {
        sesions.add(sesion);
    }

    public void borrarSesion(Sesion sesion) {
        sesions.remove(sesion);
    }
}

class Sesion {
    private String fecha;
    private String horaInicio;
    private Conferencia conferencia;
    private List<Participante> participantes;
    private List<Articulo> articulos;

    public Sesion(String fecha, String horaInicio, Conferencia conferencia) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.conferencia = conferencia;
        this.participantes = new ArrayList<>();
        this.articulos = new ArrayList<>();
    }

    public void anhadirParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void borrarParticipante(Participante participante) {
        participantes.remove(participante);
    }

    public void anhadirArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public void borrarArticulo(Articulo articulo) {
        articulos.remove(articulo);
    }


}

class Participante {
    private String nombre;
    private boolean esOrador;

    public Participante(String nombre, boolean esOrador) {
        this.nombre = nombre;
        this.esOrador = esOrador;
    }
}

class Articulo {
    private String titulo;
    private String tamaño;
    private String tema;

    public Articulo(String titulo, String tamaño, String tema) {
        this.titulo = titulo;
        this.tamaño = tamaño;
        this.tema = tema;
    }
}

class Autor extends Participante{
    private String nombre;
    private List<Articulo> articulos;

    public Autor(String nombre, boolean esOrador) {
        super(nombre, esOrador);
        this.nombre = nombre;
        this.articulos = new ArrayList<>();
    }


    public void anhadirArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public void borrarArticulo(Articulo articulo) {
        articulos.remove(articulo);
    }

}
