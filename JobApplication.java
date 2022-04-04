/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import criteria.ProgrammerCriteria;
import criteria.ManagerCriteria;
import criteria.DesignerCriteria;
import java.util.Scanner; 
/**
 *
 * @author iqbal
 */
public class JobApplication {
    
}

class programmer implements ProgrammerCriteria{
    Scanner input = new Scanner(System.in);
    @Override
    public void nilaiProgrammer(double proknow, double cle, double deb, String nama){
        double nilaiTotal = (60*proknow/100 + 15*cle/100 + 25*deb/100);
        System.out.print("\nNilai Akhir : " + nilaiTotal + "\n");
        if(nilaiTotal>=85){
            System.out.println("KETERANGAN  : DITERIMA\n");
            System.out.println("Selamat! " + nama + " berhasil mendapatkan pekerjaan sebagai Programmer");
        }
        else{
            System.out.println("KETERANGAN  : COBA LAGI\n");
            System.out.println("Mohon maaf, " + nama + " tidak berhasil mendapatkan pekerjaan sebagai Programmer"); 
        }
    }
}

class designer implements DesignerCriteria{
    Scanner input = new Scanner(System.in);
    @Override
    public void nilaiDesigner(double des, double pro, double cre, String nama){
        double nilaiTotal = (30*des/100 + 45*pro/100 + 25*cre/100);
        System.out.print("\nNilai Akhir : " + nilaiTotal + "\n");
        if(nilaiTotal>=85){
            System.out.println("KETERANGAN  : DITERIMA\n");
            System.out.println("Selamat! " + nama + " berhasil mendapatkan pekerjaan sebagai Designer");
        }
        else{
            System.out.println("KETERANGAN  : COBA LAGI\n");
            System.out.println("Mohon maaf, " + nama + " tidak berhasil mendapatkan pekerjaan sebagai Designer"); 
        }
    }
}

class manager implements ManagerCriteria{
    Scanner input = new Scanner(System.in);
    @Override
    public void nilaiManager(double inn, double dec, double com, String nama){
        double nilaiTotal = (40*inn/100 + 30*dec/100 + 25*com/100);
        System.out.print("\nNilai Akhir : " + nilaiTotal + "\n");
        if(nilaiTotal>=85){
            System.out.println("KETERANGAN  : DITERIMA\n");
            System.out.println("Selamat! " + nama + " berhasil mendapatkan pekerjaan sebagai Manager");
        }
        else{
            System.out.println("KETERANGAN  : COBA LAGI\n");
            System.out.println("Mohon maaf, " + nama + " tidak berhasil mendapatkan pekerjaan sebagai Manager"); 
        }
    }
}
