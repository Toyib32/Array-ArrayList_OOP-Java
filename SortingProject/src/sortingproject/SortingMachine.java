/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingproject;
import java.util.Scanner;
/**
 *
 * @author ASUS T.Hidayat
 */
public class SortingMachine {
    int [] Bilangan = new int [100];
    int j;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Banyak Input data(n) : ");
        this.j = input.nextInt();
            for(int i = 0; i < j; i++){
                System.out.println("Masukan bilangan ke - " + (i+1) + " : ");
                this.Bilangan[i] = input.nextInt();
            }
    }
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i = 0; i < j; i++){
            sum += data[i];
        }
        double rerata = sum / this.j;
        return rerata;
    }
    int bilMin(int[] data){
        int min = data[0];
        for(int i = 0; i < this.j; i++){
            if (min > data[i]){
                min = data[i];
            }
        }
        return min;
    }
    int bilMax(int[] data){
        int max = data[0];
        for(int i = 0; i < this.j; i++){
            if (max < data[i]){
                max = data[i];
            }
        }
        return max;
    }
    void sorting(int[]data){
        for (int i = 0; i < j; i++){
            for (int k = 1; k < (j-i); k++){
                if (data[k-1] > data[k]){
                    int swap = data[k-1];
                    data[k-1] = data[k];
                    data[k] = swap;
                }
            }
        }      
        for (int i = 0; i < j; i++){
            System.out.print(data[i] +" ");
        }  
    }
    void output(){
    System.out.println("______________________________");
    System.out.println("Nilai Rata-Rata  : " + hitungRerata(Bilangan));
    System.out.println("Nilai Minimum    : " + bilMin(Bilangan));
    System.out.println("Nilai Maximum    : " + bilMax(Bilangan));
    System.out.print("Hasil Sorting Nilai    : "); sorting(Bilangan);
    System.out.println("______________________________");
    }   
}
