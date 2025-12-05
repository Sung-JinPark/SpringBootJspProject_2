package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 화면 이동
@Controller
public class MusicController {
	@GetMapping("/")
	public String music_init()
	{
		return "main";
	}
}
