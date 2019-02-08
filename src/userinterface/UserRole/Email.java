/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRole;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author barma
 */
public class Email {
    private static String to;
    private static String text;
    
    public Email(String email, String text){
        this.to = email;
        this.text = text;
    }
    public void sendEmail() {    
      // Recipient's email ID needs to be mentioned.
   //   String to = "karun.kesavadas@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "bshuravi@gmail.com";

      // Assuming you are sending email from localhost
      String host = "smtp.gmail.com";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.smtp.host", host);
      properties.put("mail.smtp.socketFactory.port", "465");    
      properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
      properties.put("mail.smtp.port", "465");
      properties.put("mail.smtp.auth", "true");

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication("bshuravi@gmail.com","Temporary@5");  
           }    
          }); 

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);
         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("<Do Not Reply - This is an Auto Generated Email>");

         // Now set the actual message
         message.setText(text);

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}
