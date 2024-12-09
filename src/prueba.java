class Animal {
    String nombre;
    int edad;
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " +
                edad);
    }
}

class Perro extends Animal {
    String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau, guau!");
    }

    public void moverCola() {
        System.out.println(nombre + " está moviendo la cola.");
    }
    public void mostrarInfoPerro() {
        mostrarInfo();
        System.out.println("Raza: " + raza);
    }
}
class Gato extends Animal {

    String colorPelaje;

    public Gato(String nombre, int edad, String colorPelaje) {
        super(nombre, edad);
        this.colorPelaje = colorPelaje;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau!");
    }

    public void ronronear() {
        System.out.println(nombre + " está ronroneando.");
    }

    public void mostrarInfoGato() {
        mostrarInfo();
        System.out.println("Color del pelaje: " + colorPelaje);
    }
}
class Main {
    public static void main(String[] args) {
// Crea objetos de las subclases con atributos específicos
        Perro miPerro = new Perro("Bobby", 3, "Labrador");
        Gato miGato = new Gato("Kitty", 2, "Blanco");
// Usar métodos heredados y propios
        System.out.println("Información del perro:");
        miPerro.mostrarInfoPerro();
        miPerro.hacerSonido();
        miPerro.moverCola();
        System.out.println("\nInformación del gato:");
        miGato.mostrarInfoGato();
        miGato.hacerSonido();
        miGato.ronronear();
    }
}