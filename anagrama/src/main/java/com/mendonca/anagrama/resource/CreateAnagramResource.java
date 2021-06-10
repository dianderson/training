package com.mendonca.anagrama.resource;

import com.mendonca.anagrama.service.CreateAnagramService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/anagrama")
public class CreateAnagramResource {

    private final CreateAnagramService anagramService;

    @GetMapping("/{word}")
    public List<String> createAnagram(@PathVariable String word) {
        return anagramService.createAnagram(word);
    }

}
