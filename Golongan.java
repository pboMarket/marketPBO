package com.company;

/**
 * Created by yolandasham on 12/04/2017.
 */
public class Golongan {
    //atribut
    int id;
    String nama;

    public Golongan(int id, String nama){
        this.id=id;
        this.nama=nama;
    }

    public void print(){
        System.out.println("id golongan : "+id);
        System.out.println("nama golongan : "+nama);
    }

    public static void main(String[] args){
        Golongan gol = new Golongan(1,"Makanan");
        gol.print();
    }
}
