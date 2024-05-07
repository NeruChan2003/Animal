public class Animal {
    private String nombre, tipo_alimento;
    private int edad;

    public Animal(String nombre, String tipo_alimento, int edad) {
        this.nombre = nombre;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimento() {
        return tipo_alimento;
    }

    public void setTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", tipo_alimento=" + tipo_alimento + ", edad=" + edad + "]";
    }

}