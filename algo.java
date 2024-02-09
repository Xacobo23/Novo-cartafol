import java.util.ArrayList;
import java.util.List;

class Conferencia {
    private String nombre;
    private List<Sesion> sesiones;

    public Conferencia(String nombre) {
        this.nombre = nombre;
        this.sesiones = new ArrayList<>();
    }

    public void agregarSesion(Sesion sesion) {
        sesiones.add(sesion);
    }

    public void eliminarSesion(Sesion sesion) {
        sesiones.remove(sesion);
    }

    public List<Sesion> getSesiones() {
        return sesiones;
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

    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void eliminarParticipante(Participante participante) {
        participantes.remove(participante);
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public void eliminarArticulo(Articulo articulo) {
        articulos.remove(articulo);
    }

    public List<Articulo> getArticulos() {
        return articulos;
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
    private boolean esLargo;
    private String tema;

    public Articulo(String titulo, boolean esLargo, String tema) {
        this.titulo = titulo;
        this.esLargo = esLargo;
        this.tema = tema;
    }
}

class Autor {
    private String nombre;
    private List<Articulo> articulos;

    public Autor(String nombre) {
        this.nombre = nombre;
        this.articulos = new ArrayList<>();
    }

    // Métodos para añadir y eliminar artículos

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public void eliminarArticulo(Articulo articulo) {
        articulos.remove(articulo);
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }
}
