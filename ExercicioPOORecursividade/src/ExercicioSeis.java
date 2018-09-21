/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.smartcardio.Card;

public class ExercicioSeis {
    
    
    private static void listarDir(Path path){
        if(Files.isRegularFile(path)){
            System.out.println(path.toAbsolutePath());
        } else {
            String s = "\n"+  path.toAbsolutePath();
            System.out.println(s);
            try(DirectoryStream<Path> pasta = Files.newDirectoryStream(path)){
                
                for(Path p : pasta){
                    listarDir(p);
                }
                
            } catch (Exception ex){}
        }
    }
    
    
    public static void main(String[] args) {
        
        listarDir(Paths.get("C:\\beats"));
    }
    
}
