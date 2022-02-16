package io.serendipityresearch.natcattracker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VolcanicActivityController {
    @GetMapping("volcanicactivity")
    public String home(String name, Model model) {
        return "volcanicactivity";
    }
}