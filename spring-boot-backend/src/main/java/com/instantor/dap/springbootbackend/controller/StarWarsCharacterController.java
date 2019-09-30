package com.instantor.dap.springbootbackend.controller;

//import com.instantor.dap.springbootbackend.domain.CharacterObject;
import com.instantor.dap.springbootbackend.domain.CharacterObject;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1/sw")
public class StarWarsCharacterController {

    /**
     * @return character from Star Wars
     */
    @GetMapping("/character")
    public String getCharacter() {
        CharacterObject characterObject = new CharacterObject();
//        StarWarsCharacterPost.getCharacter(character);

        String character = characterObject.getCharacter().toString();
        return character;
    }

}

//class StarWarsCharacterPost {
//
//    @PostMapping("https://swapi.co/people/1/")
//    public static void getCharacter(@ModelAttribute("character") Character character) {
//        System.out.println(character.toString());
//    }
//}
