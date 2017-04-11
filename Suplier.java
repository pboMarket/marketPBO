package com.company;

/**
 * Created by yolandasham on 11/04/2017.
 */
public class Suplier {
    // atribut
    String idSuplier;
    String namaSuplier;
    String alamatSuplier;
    String noTlpSuplier;

    public Suplier(String id, String nama, String alamat, String noTlp){
        //isi
        this.idSuplier=id;
        this.namaSuplier=nama;
        this.alamatSuplier=alamat;
        this.noTlpSuplier=noTlp;
    }

    public void print(){
        //print isi Suplier
        System.out.println("Id Suplier : "+idSuplier);
        System.out.println("Nama Suplier : "+namaSuplier);
        System.out.println("Alamat Suplier : "+alamatSuplier);
        System.out.println("No. TLP Suplier : "+noTlpSuplier);
    }

    public static void main(String[] args){

    }
}
