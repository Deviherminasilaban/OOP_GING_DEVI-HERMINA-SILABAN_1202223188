public class MainApp {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("m1", 120.0, 5, 4);
        Bus bus = new Bus("b1", 80.0, 40, 30);

        System.out.println("Informasi Mobil:\n" + mobil.toString());
        System.out.println("\nWaktu Tempuh dengan Mobil: " + mobil.hitungWaktuTempuh(300) + " jam");

        System.out.println("\nInformasi Bus:\n" + bus.toString());
        System.out.println("\nWaktu Tempuh dengan Bus: " + bus.hitungWaktuTempuh(300) + " jam");
    }
}
