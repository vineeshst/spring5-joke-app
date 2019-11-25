package guru.springframework.joke.controllers;

import guru.springframework.joke.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokesService jokesService;
    @Autowired
    public JokeController(JokesService jokeService) {
        this.jokesService = jokeService;
    }
    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokesService.getJoke());
        return "chucknorris";
    }
}
