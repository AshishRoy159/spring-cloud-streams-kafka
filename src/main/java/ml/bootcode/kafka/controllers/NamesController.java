package ml.bootcode.kafka.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ml.bootcode.kafka.models.Names;
import ml.bootcode.kafka.service.NamesService;

@RestController
public class NamesController {

	private final NamesService namesService;

	public NamesController(NamesService namesService) {
		this.namesService = namesService;
	}

	@GetMapping("/names")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void greetings(@RequestParam("name") String name) {
		Names names = new Names(System.currentTimeMillis(), name);
		namesService.sendName(names);
	}
}
