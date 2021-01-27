package com.pollinglobal.pollservice;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/poll")
public class PollController {
    private final List<Poll> polls = Arrays.asList(
            new Poll(1, 2,"What is your favourite color?"),
            new Poll(2, 2,"Which is your favourite football player?"),
            new Poll(3,2, "How can your company help you to feel motivated?")
    );

    @GetMapping
    public List<Poll> getPolls(@RequestParam(required = false) Integer cId) {
        System.out.println("CustomerID" + cId.toString());
        if (cId != null){
            return polls.stream()
                    .filter(poll -> cId.equals(poll.getCustomerId()))
                    .collect(Collectors.toList());
        }
        return polls;
    }

    @GetMapping("/{id}")
    public Poll getPollById(@PathVariable int id) {
        return polls.stream()
                .filter(poll -> poll.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
