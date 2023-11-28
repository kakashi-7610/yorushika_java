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

import com.example.yorushika.domain.model.Sanctuary;
import com.example.yorushika.domain.service.yorushika.SanctuaryService;

/**
 * @author minat
 *
 */
@Controller
@RequestMapping("yorushika")
public class SanctuaryController {
	
	@Inject
	SanctuaryService sanctuaryService;
	
	@GetMapping("sanctuary")
	public String sanctuary(Model model) {
		Collection<Sanctuary> sanctuaries = sanctuaryService.findAllSanctuary();
		model.addAttribute("sanctuaries", sanctuaries);
		return "yorushika/sanctuary";
	}
}
