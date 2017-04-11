package com.company;

import java.util.Date;

/**
 * Created by yolandasham on 11/04/2017.
 */
public class Gudang {
    Date tglMasuk;
    Date tglKeluar;
    int stok;

    public Gudang(Date tglM, Date tglK, int stoks){
        this.tglMasuk=tglM;
        this.tglKeluar=tglK;
        this.stok=stoks;
    }

    public static void main(String[] args){

    }
}
