import java.util.Date;

/**
 * Created by Fauzan on 5/3/2017.
 */

public class Penjualan {
    public int id_penjualan;
    public String tgl_penjualan;
    public int diskon;
    public int jml_bayar;
    public int id_pegawai;


    public Penjualan(int id_penjualan, String tgl_penjualan, int diskon, int jml_bayar, int id_pegawai){
        this.id_penjualan = id_penjualan;
        this.tgl_penjualan = tgl_penjualan;
        this.diskon = diskon;
        this.jml_bayar = jml_bayar;
        this.id_pegawai = id_pegawai;
    }


    public void print(){
        System.out.println("Id Penjualan: "+id_penjualan);
        System.out.println("Tgl Penjualan: "+tgl_penjualan);
        System.out.println("Diskon: "+diskon);
        System.out.println("Jumlah Bayar: "+jml_bayar);
        System.out.println("Id Pegawai: "+id_pegawai);
    }

    public static void main(String[] args) {
        Penjualan penjualan = new Penjualan(1,"11-04-2017",30,9,1);
        penjualan.print();
    }
}