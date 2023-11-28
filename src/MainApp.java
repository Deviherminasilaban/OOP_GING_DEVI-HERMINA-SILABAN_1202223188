public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi (100,"bandung",5000);
        ekspedisi.informasi();
        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress a =new TelUExpress(100,"Bandung",5000,true);
        a.informasi();
        a.ambil("Sukabirus");
        a.antar(1628389);
        a.antar(1922722 , 7628262);
        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress b  =new FRIExpress(30,"Bojongsoang",70000,true);
        b.informasi();
        b.terima(2000);
        b.kirim1("lembang");
        b.kirim2("Braga", "rancaekek");

    }
}
