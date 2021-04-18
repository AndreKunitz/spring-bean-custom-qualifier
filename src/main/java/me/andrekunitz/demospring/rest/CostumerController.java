package me.andrekunitz.demospring.rest;

import me.andrekunitz.demospring.model.Costumer;
import me.andrekunitz.demospring.service.ActivateCostumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CostumerController {

    private ActivateCostumerService activateCostumerService;

    public CostumerController(final ActivateCostumerService activateCostumerService) {
        this.activateCostumerService = activateCostumerService;
    }

    @GetMapping
    public void createCostumer() {
        var costumer = new Costumer("André", "costumer@email.com", "000 000 000");
        activateCostumerService.activate(costumer);
    }

}
