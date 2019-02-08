/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author barma
 */
public class LoggingUtil 
{
    private static Logger logger;
    private static FileHandler fh;
    
    static 
    {
       logger = Logger.getLogger("SilverLining");
       try
       {
           fh = new FileHandler("SilverLining.log");
           logger.addHandler(fh);
           SimpleFormatter formatter = new SimpleFormatter();
           fh.setFormatter(formatter);
       }
       catch (IOException ex) 
       {
            Logger.getLogger(LoggingUtil.class.getName()).log(Level.SEVERE, null, ex);
       } 
       catch (SecurityException ex) 
       {
            Logger.getLogger(LoggingUtil.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public static void log(Level level, String message)
    {
        logger.log(level, message);
    }
    
    public static void log(Level level, String message, Object ob)
    {
        logger.log(level, message, ob);
    }
}
