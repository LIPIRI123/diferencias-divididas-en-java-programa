/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diferenciasdivididasnewton;

import java.util.Scanner;

/**
 *
 * @author lipiri
 */
public class DiferenciasDIVIDIDASnewton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner l=new Scanner(System.in);
        System.out.println("ingrese su grado");
        int gr=l.nextInt();
        
        gr=gr+1;
        int gr1=gr+1;
        Double m[][]=new Double[gr][gr1];
         for(int i=0;i<gr;i++){
            for(int j=0;j<gr1;j++){
                m[i][j]=0.0;
                System.out.print(m[i][j]+"  ");
            }
            System.out.println();
    }
        Double v[]=new Double[gr];
        Double v1[]=new Double[gr];
        for(int i=0;i<gr;i++){
            v[i]=l.nextDouble();
        }
        for(int i=0;i<gr;i++){
            v1[i]=l.nextDouble();
        }double var=v1[0];
        int g=gr;
        int k=1;
        for(int i=2;i<gr1;i++){
            for(int j=0;j<gr-1;j++){
                Double p=0.0;
                p=(v1[j+1]-v1[j])/(v[j+k]-v[j]);
                v1[j]=p;
                m[j][i]=p;
            }
            gr--;
            k++;
        }
           System.out.println();
        for(int i=0;i<g;i++){
            for(int j=0;j<gr1;j++){
         System.out.print(m[i][j]+"\t ");
            }
            System.out.println();
    }
        double su=0;
        su+=var;int k11=1;
        System.out.println("x ");
        double x=l.nextDouble();
        System.out.print("p(x) = "+var);
        for(int i=2;i<gr1;i++){
           System.out.print(" + "+m[0][i]+"*");
            
            double su1=1;
            for(int j=0;j<k11;j++){
                su1=su1*(x-v[j]);
                if(j==k11-1){
              System.out.print("(x - "+v[j]+")");
             
                }else{
               System.out.print("(x - "+v[j]+")*");
             
                }
            }
            su1=su1*m[0][i];
            su=su+su1;
            //System.out.println("su  "+su);
            k11++;
        }
     
        System.out.println("re"+su);
    }}
