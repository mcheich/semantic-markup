package org.wecancodeit.semanticmarkup.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component // Should be @Controller but this renders the static 'index.html' page
public class SemanticController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
}
