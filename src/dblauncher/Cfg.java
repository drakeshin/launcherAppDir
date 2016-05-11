/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dblauncher;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
/**
 *
 * @author ragnaperfect
 */
public class Cfg {
    
    public static Properties loadConfig() throws FileNotFoundException, IOException{
        Properties props = new Properties();
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator;
        File file = new File(path+"myConfig.properties");
        if(!file.exists()){
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        }else{}
        FileInputStream stream = new FileInputStream(file);
        props.load(stream);
        return props;
    }
    public static Properties deleteConfig() throws FileNotFoundException, IOException{
        Properties props = new Properties();
        //FileInputStream stream = new FileInputStream("./src/sistemagerenciamento/myConfig.properties");
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator;
        File file = new File(path+"myConfig.properties");
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
        FileInputStream stream = new FileInputStream(file);
        props.load(stream);
        //props.clear();
        return props;
    }
    
   /* public static Properties deleteItemConfig(String lineToRemove) throws FileNotFoundException, IOException{
        Properties props = new Properties();
        //FileInputStream stream = new FileInputStream("./src/sistemagerenciamento/myConfig.properties");
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator; //Path of File
        File file = new File(path+"myConfig.properties"); //The path + file 
        File file2 = new File(path+"a6sf4.temp");
        
        //Select a line to delete
        String line = null;
        
        BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        
        while((line = reader.readLine()) != null ){
            if(line.trim().equals(lineToRemove)) continue;
            writer.write(line + System.getProperty("line.separator"));
        }
        
        writer.close();
        reader.close();
        
        file.delete();
        file2.renameTo(file);
        
        FileInputStream stream = new FileInputStream(file2);
        
        props.load(stream);
        //props.clear();
        return props;
    }*/
}
