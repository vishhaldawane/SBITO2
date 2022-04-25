package com.sbi.project.layer4;

import org.springframework.stereotype.Service;

@Service
public interface MailService {

	public void sendMail(String info, String email);
}
