package com.ecej;
public class run {

    public static void main(String[] args) {
        while(true){
            try {
                Thread.sleep(5000);
                System.out.println("jenkins");
            }
            catch (InterruptedException ex){
                System.out.println(ex.getStackTrace());
            }
        }

    }
}
