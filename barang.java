/**
 * Created by ASUS PC on 11/04/2017.
 */
public class barang {
    public int idBarang;
    public int idProduk;
    public String namaProduk;
    public String satuan;
    public int hargaJual;
    public int hargaBeli;

    public barang(int idBarang, int idProduk, String namaProduk, String satuan, int hargaJual, int hargaBeli){
        this.idBarang = idBarang;
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.satuan = satuan;
        this.hargaJual = hargaJual;
        this.hargaBeli = hargaBeli;
    }

    public void print_barang(){
        System.out.println("Id Barang : "+idBarang);
        System.out.println("Id Produk : "+idProduk);
        System.out.println("Nama Produk : "+namaProduk);
        System.out.println("Satuan : "+satuan);
        System.out.println("Harga Jual : "+hargaJual);
        System.out.println("Harga Beli : "+hargaBeli);
    }

    public  static void main(String[] args){
        barang brg = new barang(1,1, "Biskuat Coklat","Dus",120000,100000);

        brg.print_barang();
    }

}
