/**
 * Created by Reza Nandika on 11/04/2017.
 */
public class Produk {
    int id_produk;
    int id_jenis;
    String nama_produk;

    public Produk (int id_jenis, int id_produk, String nama_produk)
    {
       this.id_jenis = id_jenis;
       this.id_produk = id_produk;
       this.nama_produk = nama_produk;

    }

    public void cetak()
    {
        System.out.println("ID JENIS : "+id_jenis);
        System.out.println("ID Produk : "+id_produk);
        System.out.println("Nama Produk : "+nama_produk);
    }

    public static void main (String[] args)
    {
        Produk p = new Produk(1, 1, "Kacang Bohay");
        p.cetak();

    }
}
