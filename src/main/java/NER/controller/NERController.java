package NER.controller;

import NER.model.Type;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api")
public class NERController {

    @PostMapping
    @RequestMapping(value  ="/ner")
    List<String> ner (@RequestBody String input, @RequestParam Type type){

        return null;
    }
}
