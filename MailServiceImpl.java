package com.sbi.project.layer4;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

//	<dependency>
//		<groupId>org.springframework.boot</groupId>
//		<artifactId>spring-boot-starter-mail</artifactId>
//  </dependency>

	// https://developers.google.com/gmail/api/guides/sending
	
	@Override
	public void sendMail(String info, String emailTo) {
		
		String fromEmail="vishalviniing@gmail.com";
		String password="";
		
		String host="smtp.gmail.com";
		Properties props = new Properties();
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.host",host);
		props.put("mail.smtp.port","587");
		
		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(fromEmail,password);
					}
				}
		);
		
		try
		{
			MimeMessage message= new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
			message.setSubject("Message From SBI");
			message.setText(info);
			
			try {
				Transport.send(message);
				System.out.println("message sent successfully...");
			}
			catch(Exception e) {
				System.out.println("NETWORK Error");
				System.out.println("Please check your network connection");
			}
		}
		catch(MessagingException e) {
			e.printStackTrace();
		}
	}
}
