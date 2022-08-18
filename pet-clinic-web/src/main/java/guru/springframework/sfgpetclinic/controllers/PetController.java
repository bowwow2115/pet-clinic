package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @RequestMapping({ "/pets", "/pets/index.html"})
    public String listOwners(Model model){

        model.addAttribute("pets", petService.findAll());

        return "pets/index";
    }
}
