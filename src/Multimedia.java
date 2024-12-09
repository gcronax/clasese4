class Multimedia {
    String titulo;
    String autor;
    String formato;
    int duracion;
    public Multimedia(String titulo,String autor,String formato,int duracion){
        this.titulo=titulo;
        this.autor=autor;
        this.formato=formato;
        this.duracion=duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
class pelicula extends Multimedia{
    String actor;
    String actriz;
    public pelicula(String titulo,String autor,String formato,int duracion,String actor){
        super(titulo,autor,formato,duracion);
        this.actor=actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    @Override
    public String toString() {
        return "pelicula{" +
                "duracion=" + duracion +
                ", formato='" + formato + '\'' +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", actriz='" + actriz + '\'' +
                ", actor='" + actor + '\'' +
                '}';
    }
}
class disco extends Multimedia{
    String discografia;
    int n_canciones;

    public disco(String titulo,String autor,String formato,int duracion,String discografia,int n_canciones){
        super(titulo,autor,formato,duracion);
        this.discografia=discografia;
        this.n_canciones=n_canciones;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    public void setN_canciones(int n_canciones) {
        this.n_canciones = n_canciones;
    }

    public int getN_canciones() {
        return n_canciones;
    }

    public String getDiscografia() {
        return discografia;
    }

    @Override
    public String toString() {
        return "disco{" +
                "discografia='" + discografia + '\'' +
                ", n_canciones=" + n_canciones +
                ", duracion=" + duracion +
                ", formato='" + formato + '\'' +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}

class main{
    public static void main(String[] args) {
        pelicula p1 =new pelicula("El lobo de Wall Street","Martin Scorsese","mp4",180,"Leonardo DiCaprio");
        System.out.println(p1);

        disco d1 =new disco("Direction of the Heart","Simple Minds","mp3",64,"BMG",9);
        System.out.println(d1);

    }
}