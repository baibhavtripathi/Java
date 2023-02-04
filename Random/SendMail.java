package io.tribty;


import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class SendMail {

    public static void main(String[] args) {

        String user = "user01@james.local";

        String password = "1234";
        String fromAddress = "user01@james.local";
        String toAddress = "dev@yopmail.com";
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "0.0.0.0");
        properties.put("mail.smtp.port", "25");
        properties.put("mail.smtp.username", user);
        properties.put("mail.smtp.password", password);
        properties.put("mail.transport.protocol", "smtp");
//        properties.put("mail.smtp.starttls.enable", "true");
//        properties.put("javax.net.ssl.trustStore", "C:/Workspace/james-server-spring-app-3.7.3/conf/keystore");
//        properties.put("javax.net.ssl.trustStorePassword", "emailServer");


        Session session = Session.getDefaultInstance(properties, null);

        try
        {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromAddress));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
            message.setSubject("Email from our JAMEs");
            message.setText("Hello!");
//            Transport.send(message);
            Transport transport = session.getTransport("smtp");
            transport.connect("localhost", 25, "user01@james.local", "1234");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Email sent");
        }
        catch (MessagingException e)
        {
            e.printStackTrace();
        }
    }
}