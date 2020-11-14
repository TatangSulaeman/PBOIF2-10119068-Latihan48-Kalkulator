/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.kalkulator.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan Hasil Kalkulator
 * 
 */
public class Main {
    public static void main(String[] args){
        Kalkulator dataKal = new Kalkulator();
        
        //set value pada kalkulator
        dataKal.setValue1(7);
        dataKal.setValue2(5);
        
        //menampilkan hasilKalkulator
        System.out.println("Value 1 = " + dataKal.getValue1());
        System.out.println("Value 1 = " + dataKal.getValue2());
        dataKal.setNameProject();
        dataKal.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result add is = " + dataKal.add(dataKal.getValue1(),dataKal.getValue2()));
        System.out.println("Result Minus Is = " + dataKal.minus(dataKal.getValue1(),dataKal.getValue2()));
        System.out.println("Result Multiple  Is = " + dataKal.multiplication(dataKal.getValue1(),dataKal.getValue2()));
        System.out.println("Result Division Is = " + dataKal.division(dataKal.getValue1(),dataKal.getValue2()));
    }
}
