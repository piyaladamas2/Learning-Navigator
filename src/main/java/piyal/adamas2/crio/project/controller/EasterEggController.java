package piyal.adamas2.crio.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hidden-feature")
public class EasterEggController {

  @Autowired
    private RestTemplate restTemplate;

    private static final String 
    NUMBERS_API_URL = "http://numbersapi.com/";

    @GetMapping("/{number}")
    public ResponseEntity<String> getNumberFact(@PathVariable Integer number) {
        String url = NUMBERS_API_URL + number;
        
        // Fetch fact from the Numbers API
        String fact = restTemplate.getForObject(url, String.class);
        
        return ResponseEntity.ok(fact);
    }
}
