package com.spk.sba;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController {

	@GetMapping("hello")
	public String hello() {
		try {
			log.info("Hello World - {} - {}", UUID.randomUUID().toString(), InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			log.error("Unable to find host name");
			e.printStackTrace();
		}
		return "Hello World!";
	}

}
