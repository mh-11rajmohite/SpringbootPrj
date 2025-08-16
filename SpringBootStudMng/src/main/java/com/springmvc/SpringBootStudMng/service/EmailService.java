package com.springmvc.SpringBootStudMng.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(String subject, String body, String to) {

		try {
			SimpleMailMessage mgs = new SimpleMailMessage();

			mgs.setSubject(subject);
			mgs.setText(body);
			mgs.setTo(to);

			mailSender.send(mgs);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void sendEmailNAttach(String subject, String body, String to) {

		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);

			helper.setSubject(subject);
			helper.setText(body,true);
			helper.setTo(to);

			helper.addAttachment("Notes",
					new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Raj Docs\\Study material\\AZURE.txt"));
			mailSender.send(mimeMessage);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
