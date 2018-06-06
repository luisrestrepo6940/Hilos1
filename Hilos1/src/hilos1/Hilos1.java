/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos1;

import static java.lang.Thread.sleep;

/**
 *
 * @author lfrestrepo
 */
public class Hilos1 {
    public static void main(String[] args) {
       Hilo1 h1 = new Hilo1("Hilo uno:");
       Hilo1 h2 = new Hilo1("Hilo dos:");
       Hilo1 h3 = new Hilo1("Hilo tres:");
       Hilo1 h4 = new Hilo1("Hilo cuatro:");
       h1.start(); h2.start(); h3.start(); h4.start();
    }
}
    class Hilo1 extends Thread{
    String s;
    public Hilo1(String s){
        this.s = s;
    }
    @Override
    public void run(){
    for(int i=0; i<10; i++){
    System.out.println(s+" "+i);
    try{
    sleep(Math.round(Math.random()*1000)); 
    }catch(InterruptedException e){}
         }
       }
    }