package io.codingdojo.controllerspractice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {
    @RequestMapping("/m/{track}/{module}/{lesson}")
    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson) {
        return "Track" + track + ", Module: " + module + ", Lesson: " + lesson;
    }
}
