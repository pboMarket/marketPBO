import com.company.Pembelian;
import sun.security.util.Pem;

import java.util.HashMap;

/**
 * Created by ASUS on 11/04/2017.
 */
public class Pembelian_detail {
    int id_pembelian_detail;
    Pembelian pm;
    int id_barang;
    int harga_beli;
    int jumlah_pembelian;



public Pembelian_detail(int id_pembelian_detail,Pembelian pm ,int id_barang,int harga_beli,int jumlah_pembelian){

    this.id_pembelian_detail=id_pembelian_detail;
    this.pm = pm;
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

    System.out.println("------------------------------------------");
    System.out.println("Id Pembelian Detail: "+id_pembelian_detail);
    System.out.println("Id Barang: "+id_barang);
    System.out.println("Harga Beli: "+harga_beli);
    System.out.println("Jumlah Pembelian: "+jumlah_pembelian);


}

    public static void main(String[] args) {

    Pembelian pm = new Pembelian(1,1,1,"20 April 2017",9);
    Pembelian_detail PD = new Pembelian_detail(1 ,pm,2,20000,3);
    Pembelian_detail PD2 = new Pembelian_detail(2,pm,4,50000,6);
    pm.print();
    PD.print();
    PD2.print();
    int jumkes = PD.hitung()+PD2.hitung();
    System.out.println("---------------------------------------------");
    System.out.println("Total Harga:"+jumkes);
    }

}
