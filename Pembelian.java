package com.company;


public class Pembelian {

    public int id_pembelian;
    public int id_supplier;
    public int id_pegawai;
    public String tanggal_masuk;
    public int total;


    public Pembelian (int id_pegawai, int id_pembelian, int id_supplier,String tanggal_masuk, int total ){

        this.id_pembelian =id_pembelian ;
        this.id_pegawai= id_pegawai;
        this.id_supplier = id_supplier;
        this.tanggal_masuk = tanggal_masuk;
        this.total = total;
    }


    public void print(){
        System.out.println("Id Pembelian: "+id_pembelian);
        System.out.println("Id Pegawai: "+id_pegawai);
        System.out.println("Id Supplier: "+id_supplier);
        System.out.println("Tanggal Masuk: "+tanggal_masuk);
        System.out.println("Total barang yang dibeli: "+total);
    }

    public static void main(String[] args) {
        Pembelian pm = new Pembelian(1,1,1,"11-04-2017",9);
        pm.print();
    }

}
