package com.buhhu8.otushw1.service;

import com.buhhu8.otushw1.dto.PersonDto;
import com.buhhu8.otushw1.model.Person;
import com.buhhu8.otushw1.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public void createPerson(PersonDto personDto) {
        personRepository.save(modelMapper.map(personDto, Person.class));
    }

    public PersonDto getPersonById(String personId) {
        var person = personRepository.findById(Integer.parseInt(personId)).orElseThrow(RuntimeException::new);
        return modelMapper.map(person, PersonDto.class);
    }

    @Transactional
    public void deletePerson(String personId) {
        personRepository.delete(personRepository.getReferenceById(Integer.parseInt(personId)));
    }

    @Transactional
    public void updatePerson(String personId, PersonDto personDto) {
        var person = personRepository.getReferenceById(Integer.parseInt(personId));
        person.setFirstName(personDto.getFirstName());
        person.setLastName(personDto.getLastName());
        person.setPhone(personDto.getPhone());
        person.setEmail(personDto.getEmail());
        personRepository.save(person);
    }

}
