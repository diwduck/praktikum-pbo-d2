package modul_b.PegawaidanGaji;

public class Manajer extends Pegawai{
	private int tunjangan = 700000;

    public Manajer(String nama){
        super();
        this.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}
