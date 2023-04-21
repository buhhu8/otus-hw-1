package com.buhhu8.otushw1.controller;

import com.buhhu8.otushw1.dto.PersonDto;
import com.buhhu8.otushw1.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/user")
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity<String> createPerson(@RequestBody PersonDto personDto) {
        personService.createPerson(personDto);
        return ResponseEntity.ok().body("successful operation");
    }

    @GetMapping("/{userId}")
    public ResponseEntity<PersonDto> getPerson(@PathVariable String userId){
        return ResponseEntity.ok(personService.getPersonById(userId));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deletePerson(@PathVariable String userId) {
        personService.deletePerson(userId);
        return ResponseEntity.ok().body("user deleted");
    }

    @PutMapping("/{userId}")
    public ResponseEntity<String> updatePerson(@PathVariable String userId, @RequestBody PersonDto personDto) {
        personService.updatePerson(userId, personDto);
        return ResponseEntity.ok().body(String.format("Update user with %s supplied", userId));
    }
}
