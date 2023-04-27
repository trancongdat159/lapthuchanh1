/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class vehicle {
    private String chuxe;
    private String loaixe;
    private double dungtich;
    private double trigia;
    private double thuephainop;
    /**
     * @param args the command line arguments
     */
   

    public vehicle(String chuxe, String loaixe, double dungtich, double trigia) {
        this.chuxe = chuxe;
        this.loaixe = loaixe;
        this.dungtich = dungtich;
        this.trigia = trigia;
       
    }
    public String getchuxe (){
    return chuxe;
}
public String getloaixe(){
    return loaixe;
}  
 public double getdungtich(){
    return dungtich;
}
 public double gettrigia(){
    return trigia;
 }

public void tinhthue() {
    
    if (dungtich < 100) {
        thuephainop = trigia*0.01;
    }
    else if (dungtich >= 100 && dungtich <=200){
            thuephainop=trigia*0.03;
    }
else {
        thuephainop =trigia*0.05;
    }
     System.out.println ("thue phai nop la :"+thuephainop);

}


    public double getThuephainop() {
        return thuephainop;
    }

    public void setThuephainop(double thuephainop) {
        this.thuephainop = thuephainop;
    }
 
  public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);
    vehicle[] a=new vehicle[3];
    for(int i=0; i<a.length;i++){
        System.out.println("Nhap thong tin xe "+(i+1)+":");
        System.out.print("chu xe:");
        String chuxe=input.nextLine();
        System.out.print("loaixe:");
        String loaixe=input.nextLine();
        System.out.print("dung tich:");
        Double dungtich=input.nextDouble();
        System.out.print("Trigia:");
        Double trigia=input.nextDouble();
        input.nextLine();
        a[i]=new vehicle(chuxe, loaixe, dungtich,trigia);
    }
    System.out.println("bang ke khai tien thue cua cac lai xe");
    System.out.format("|%-20s||%-20s||%-20s||%-20s||%-20s|\n","chu xe","loai xe","Dung tich","gia tri","thuephainop");
        for(int i=0;i<a.length;i++){
             System.out.printf("|%-20s||%-20s||%-20s||%-20s||%-20s|\n",a[i].getchuxe(),a[i].getloaixe(),a[i].getdungtich(),a[i].gettrigia(),a[i].getThuephainop());
        }
  }
    
}
