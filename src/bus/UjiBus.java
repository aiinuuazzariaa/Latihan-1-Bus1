/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author MOKLET-2
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //membuat objek busMini dari class Bus
        Bus busMini = new Bus();
        //memasukkan nilai jumlah penumpang dan penumpang maksimal ke dalam objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil method cetak pada class Bus
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang+5;
        //memanggil method cetak pada class Bus
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang-2;
        //memanggil method cetak pada class Bus
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang+8;
        //memanggil method cetak pada class Bus
        busMini.cetak();
    }
    
        
        
}

