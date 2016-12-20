package softuniBlog.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import softuniBlog.entity.Article;
import softuniBlog.repository.ArticleRepository;

@Controller
public class LoreController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/lore")
    public String index(Model model) {

        model.addAttribute("view", "lore/loreIndex");


        return "base-layout";


    }
}