import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */

public class Main {
    public static void main(String[] args) {
        double proknow=0, cle=0, deb=0, des=0, pro=0, cre=0, inn=0, dec=0, com=0;
        int ulangi = 1, pilihan;
        Scanner input = new Scanner(System.in);
        
        System.out.println("==================================");
        System.out.println("   PELAMARAN LOWONGAN PEKERJAAN   ");
        System.out.println("==================================");
        System.out.println("Ada 3 posisi kosong :");
        System.out.println("1. Programmer");
        System.out.println("2. Designer");
        System.out.println("3. Manager");
        System.out.printf("Pilih : ");
        pilihan = input.nextInt();

        System.out.println("\n===============================");
        System.out.println("   FORMULIR LAMARAN PEKERJAAN  ");
        System.out.println("==============================="); 
        System.out.print("Masukkan Nama : ");
        String nama = input.next();
        System.out.print("\n\n");
        
        System.out.println("----------PENILAIAN----------"); 
        System.out.println("Ket : Masukkan nilai 0 - 100");
        System.out.print("\n\n");
        
        switch (pilihan){
            case 1:                   
                System.out.print("Input Nilai Programming Knowledge : ");
                proknow = input.nextDouble();
                if(proknow<0 || proknow>100){
                    proknow = input.nextDouble();
                }
                System.out.print("Input Nilai Clean Coding : ");
                cle = input.nextDouble();
                if(cle<0 || cle>100){
                    cle = input.nextDouble();
                }
                System.out.print("Input Nilai Debugging : ");
                deb = input.nextDouble();
                if(deb<0 || deb>100){
                    deb = input.nextDouble();
                }
                break;
            case 2:                 
                System.out.print("Input Nilai Design Portofolio : ");
                des= input.nextDouble();
                if(des<0 || des>100){
                    des = input.nextDouble();
                }
                System.out.print("Input Nilai Prototyping : ");
                pro = input.nextDouble();
                if(pro<0 || pro>100){
                    pro = input.nextDouble();
                }
                System.out.print("Input Nilai Creativity : ");
                cre = input.nextDouble();  
                if(cre<0 || cre>100){
                    cre = input.nextDouble();
                }
                break;
            case 3:                  
                System.out.print("Input Nilai Innovation : ");
                inn = input.nextDouble();
                if(inn<0 || inn>100){
                    inn = input.nextDouble();
                }
                System.out.print("Input Nilai Decision Making  : ");
                dec = input.nextDouble();
                if(dec<0 || dec>100){
                    dec = input.nextDouble();
                }
                System.out.print("Input Nilai Communication : ");
                com = input.nextDouble();  
                if(com<0 || com>100){
                    com = input.nextDouble();
                }
                break;
            default:
                System.out.print("Input Salah, Coba Inputkan Lagi!\n");
                break;
        }
            while (ulangi!=3){
            System.out.println("\n=======================");
            System.out.println("          MENU         ");
            System.out.println("======================="); 
            System.out.println("1. Tampilkan Hasil");
            System.out.println("2. Ubah Nilai Pelamar");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            ulangi = input.nextInt();
            switch(ulangi){
                case 1:
                    switch(pilihan){
                        case 1:
                            programmer program = new programmer();
                            program.nilaiProgrammer(proknow, cle, deb, nama);
                            break;
                        case 2:
                            designer design = new designer();
                            design.nilaiDesigner(des, pro, cre, nama);
                            break;
                        case 3:
                            manager manage = new manager();
                            manage.nilaiManager(inn, dec, com, nama);
                            break;
                    }
                    break;
                case 2:  
                    System.out.println("\n==============================");
                    System.out.println("      EDIT NILAI PELAMAR      ");
                    System.out.println("=============================="); 
                    switch(pilihan){
                        case 1:
                            System.out.print("Input Nilai Programming Knowledge: ");
                            proknow = input.nextDouble();
                            System.out.print("Input Nilai Clean Coding: ");
                            cle = input.nextDouble();
                            System.out.print("Input Nilai Debugging: ");
                            deb = input.nextDouble();
                            programmer program = new programmer();
                            program.nilaiProgrammer(proknow, cle, deb, nama);
                            break;
                        case 2:
                            System.out.print("Input Nilai Design Portfolio: ");
                            des = input.nextDouble();
                            System.out.print("Input Nilai Prototyping: ");
                            pro = input.nextDouble();
                            System.out.print("Input Nilai Creativity: ");
                            cre = input.nextDouble();      
                            designer design = new designer();
                            design.nilaiDesigner(des, pro, cre, nama);
                            break;
                        case 3:
                            System.out.print("Input Nilai Innovation: ");
                            inn = input.nextDouble();
                            System.out.print("Input Nilai Decision Making: ");
                            dec = input.nextDouble();
                            System.out.print("Input Nilai Communication: ");
                            com = input.nextDouble();
                            manager manage = new manager();
                            manage.nilaiManager(inn, dec, com, nama);
                            break;
                    }
            }
        }
    }
}
