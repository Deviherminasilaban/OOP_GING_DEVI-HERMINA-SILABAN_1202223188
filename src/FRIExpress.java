public class FRIExpress extends Ekspedisi{

    // TO DO: Create Protected Attribute of FRIExpress (pecahBelah)
    protected boolean antarInter;
    // TO DO: Create Constructor of FRIExpress
    public FRIExpress (int jumlahCabang,String pusat,float tarif,boolean antarInter) {
        super(jumlahCabang,pusat,tarif );
        this.antarInter = antarInter;
    }
    // TO DO: Create 'informasi' Method to show Information
    public void informasi(){
        System.out.println();
    }
    // TO DO: Create 'terima' Method to accept a number of packages
    public void terima(int jumlahPaket){
        System.out.println("FRIExpress baru saja menerima paket yang masuk untuk di sortir ");
    }
    // TO DO: Create 'kirim' Method to send a package to a destination
    public void kirim1(String tujuan){
        System.out.println("FRIexpress berhasil mengirimkan paket ke tujuan "+ tujuan);
    }
    // TO DO: Create 'kirim' Method to send a package to two destinations
    public void kirim2(String tujuan_1 , String tujuan_2){
        System.out.println("FRIexpress berhasil mengirimkan paket ke tujuan " + tujuan_1 + "dan" + tujuan_2);
    }
}
