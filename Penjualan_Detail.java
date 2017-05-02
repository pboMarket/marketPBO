/**
 * Created by Fauzan on 5/3/2017.
 */
public class Penjualan_Detail {
    int id_penjualan_detail;
    public Penjualan penjualan;
    int id_barang;
    int harga_jual;
    int jumlah_penjualan;
    int subtotal;

    public Penjualan_Detail(int id_penjualan_detail, int id_barang, int harga_jual, int jumlah_penjualan){
        this.id_penjualan_detail = id_penjualan_detail;
        this.id_barang = id_barang;
        this.harga_jual = harga_jual;
        this.jumlah_penjualan = jumlah_penjualan;
    }

    public int calculate(){
        int subtotal = 0;
        subtotal = harga_jual*jumlah_penjualan;
        return subtotal;
    }

    public void print(){
        System.out.println("Id Penjualan Detail: "+id_penjualan_detail);
        System.out.println("Id Barang: "+id_barang);
        System.out.println("Harga Jual: "+harga_jual);
        System.out.println("Jumlah Penjualan: "+jumlah_penjualan);
    }

    public static void main(String[] args){
        Penjualan_Detail penjualan_detail = new Penjualan_Detail(1,1,5000,7);
        penjualan_detail.print();
        int subtotal = penjualan_detail.calculate();
        System.out.println("Sub Total : "+subtotal);
    }


}
