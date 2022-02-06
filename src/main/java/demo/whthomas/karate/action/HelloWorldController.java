package demo.whthomas.karate.action;

import demo.whthomas.karate.action.param.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world/{username}/say")
    public String getHello(@PathVariable("username") String username) {
        return "hello world " + username;
    }

    @GetMapping("/hello-world")
    public String getHello() {
        return "hello world";
    }

    @PostMapping("/hello")
    public Map<String, String> postHelloWorld(@RequestParam(value = "name", defaultValue = "whthomas") String name) {

        Map<String, String> map = new HashMap<>();

        map.put("hello", name);

        return map;
    }

    @PostMapping("/person")
    public Person postData(@RequestBody Person person) {
        return person;
    }

}
