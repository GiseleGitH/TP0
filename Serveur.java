/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author SG
 */
public class Serveur  {
    
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("Démarrage du serveur");
        Socket s = ss.accept();
        
        //Lecture de données
        InputStream is = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        //Ecriture de données
        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(os,true);
        
        String ip = s.getRemoteSocketAddress().toString();
        pw.println("Bienvenue client IP =" +ip);
        String chaine = br.readLine();
        int n = chaine.length();
        
        pw.println("La valeur de la chaine est" + n);
    }
}
