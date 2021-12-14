package com.thaisDS3.demoDBF.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/")
public class MoreResource {
    @GetMapping(path = "/eco")
    public String getEco() {
        return "Eco... eco... eco...";
    }

    @GetMapping(path = "/about")
    public String about() {
        return "Oi, aqui é a Thaís. Foi bem difícil inventar classes, haha, não sabia como chegar em 15" +
                " campos. Só fiz a Resource da classe Player, que seria o único CRUD realmente presente no PP." +
                "<br>Enfim. Câmbio e desligo.";
    }

}
