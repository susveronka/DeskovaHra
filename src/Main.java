public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HelloFrame frame = new HelloFrame();
        frame.setVisible(true);

        SpravceHer hry = new SpravceHer();
        hry.nactiZeSouboru("src/deskovky.txt", "oddelovac");
        hry.zapisDoSouboru("src/soubor", "oddelovac");

    }
}