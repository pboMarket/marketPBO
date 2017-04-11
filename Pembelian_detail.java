import com.company.Pembelian;
import sun.security.util.Pem;

import java.util.HashMap;

/**
 * Created by ASUS on 11/04/2017.
 */
public class Pembelian_detail {
    int id_pembelian_detail;
    public Pembelian pm;
    int id_barang;
    int harga_beli;
    int jumlah_pembelian;



public Pembelian_detail(int id_pembelian_detail,int id_barang,int harga_beli,int jumlah_pembelian){

    this.id_pembelian_detail=id_pembelian_detail;

    this.id_barang=id_barang;
    this.harga_beli=harga_beli;
    this.jumlah_pembelian=jumlah_pembelian;


}

    public int hitung() {
        int total=0;
        total = harga_beli*jumlah_pembelian;
        return total;
    }

public void print(){
    System.out.println("Id Pembelian Detail: "+id_pembelian_detail);
    System.out.println("Id Barang: "+id_barang);
    System.out.println("Harga Beli: "+harga_beli);
    System.out.println("Jumlah Pembelian: "+jumlah_pembelian);


}

    public static void main(String[] args) {

    Pembelian_detail PD = new Pembelian_detail(1 ,2,20000,3);
    PD.print();
    int jumkes = PD.hitung();
    System.out.println("Sub Total:"+jumkes);
    }

}
