/**
 * Created by Reza Nandika on 11/04/2017.
 */
public class Jenis {
    int id_jenis;
    int id_golongan;
    String nama_jenis;

    public Jenis (int id_jenis, int id_golongan, String nama_jenis)
    {
        this.id_jenis = id_jenis;
        this.id_golongan = id_golongan;
        this.nama_jenis = nama_jenis;
    }

    public void print()
    {
        System.out.println("ID JENIS : "+id_jenis);
        System.out.println("ID Golongan : "+id_golongan);
        System.out.println("Nama Jenis : "+nama_jenis);
    }

    public static void main(String[] args){
        Jenis jenis = new Jenis(1,1,"Makanan");
        jenis.print();
    }
}
