package guru.springframework.controllers;

import guru.springframework.pets.PetService;
import org.springframework.stereotype.Controller;

/**
 * Created by dz on 22/02/21.
 */
@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}