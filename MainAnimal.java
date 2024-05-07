public class MainAnimal {
    public static void main(String[] args) {

        Perro perro = new Perro("Firulais", "Croquetas", 10, "Husky");
        Gato gato = new Gato("Pelusa", "Pescado", 10, "Sagrado de Birmania");

        perro.mostrar();
        System.out.println("...................................................");
        gato.mostrar();
        System.out.println("...................................................");

    }
}
