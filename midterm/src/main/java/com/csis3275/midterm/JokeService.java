package com.csis3275.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    private final RandomJokes rj = new RandomJokes();

    public String getJoke() {
        return rj.getRandomJokes();
    }
}
