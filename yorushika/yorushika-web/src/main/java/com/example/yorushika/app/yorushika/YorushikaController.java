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

import com.example.yorushika.domain.model.Yorushika;
import com.example.yorushika.domain.service.yorushika.YorushikaService;

/**
 * @author minat
 *
 */
@Controller
@RequestMapping("yorushika")
public class YorushikaController {
	
	@Inject
	YorushikaService yorushikaService;
	
	@GetMapping("index")
	public String index(Model model) {
		Collection<Yorushika> yorushikas = yorushikaService.findAll();
		model.addAttribute("yorushikas", yorushikas);
		return "yorushika/index";
	}
}
