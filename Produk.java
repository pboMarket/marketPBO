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
    
    public void print(){
        System.out.println("id produk : "+id_produk);
        System.out.println("nama_produk : "+nama_produk);
        System.out.println("id jenis : "+id_jenis);
    }
    
    public static void main(String[] args){
        Produk produk = new Produk(1,1,"Biskuat Coklat");
        produk.print();
    }
}
