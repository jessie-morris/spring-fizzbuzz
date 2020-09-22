package com.example.fun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fizz")

public class FizzbuzzController {

    @GetMapping("/{num}")
    public String fizzBuzz(@PathVariable int num) {
        return FizzbuzzService.fizz(num);
    }
}
