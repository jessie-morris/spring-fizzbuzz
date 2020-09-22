package com.example.fun;

import org.springframework.stereotype.Service;

public class FizzbuzzService {
    public static String fizz(int num) {
        if(num == 15) {
            return "fizzbuzz";
        }
        else if(num == 5) {
            return "buzz";
        }
        else if(num == 3) {
            return "fizz";
        }
        else {
            return Integer.toString(num);
        }
    }
}
