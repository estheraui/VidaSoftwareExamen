package examenvs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExamenVS {

    static int Lineas;
    static int Coincidencias;
    
    public static void main(String[] args) {        
        
        File TxT = new File("/Users/Esther/Downloads/palabras.txt");        
        Scanner Ingreso = new Scanner(System.in);
        
        System.out.print("¿Que palabra deseas buscar?: ");
        String Palabra = Ingreso.nextLine();
        System.out.println("");
        Buscar(TxT, Palabra);
    }

    public static void Buscar(File TxT2, String Palabra2) {
        try {
            if(TxT2.exists()) {
                BufferedReader LeerTxT = new BufferedReader(new FileReader(TxT2));
                String Leido;
                while((Leido = LeerTxT.readLine()) != null) {
                    Lineas = Lineas + 1;
                    String[] Palabras = Leido.split(" ");
                    for(int i = 0 ; i < Palabras.length ; i++) {
                        if(Palabras[i].equals(Palabra2)) {
                            Coincidencias = Coincidencias + 1;
                            System.out.println(Leido);
                            System.out.println("En la linea: " + Lineas + " se encontro la palabra: " + Palabra2);
                            System.out.println("");
                        }
                    }
                }
            }
            System.out.println("Total de concidencias de: " + Palabra2 + ", " + Coincidencias + " veces.");
        }   
        catch(Exception e) {
        System.out.println(e.getMessage());
        }
    }
}
