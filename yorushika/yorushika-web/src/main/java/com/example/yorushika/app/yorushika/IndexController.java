/**
 * 
 */
package com.example.yorushika.app.yorushika;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.yorushika.domain.model.Song;
import com.example.yorushika.domain.service.yorushika.IndexService;

/**
 * @author minat
 *
 */
@Controller
@RequestMapping("yorushika")
public class IndexController {
	
	@Inject
	IndexService indexService;
	
	@GetMapping("index")
	public String index(Model model) {
		Collection<Song> songs = indexService.findAllSong();
		model.addAttribute("songs", songs);
		return "yorushika/index";
	}
}
