package com.ChaimaDAMMAK.ReactiveRestApi.Students;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class StudentService {

    private  final StudentRepository studentRepository;


    public Mono<Student> save(Student student){
        return studentRepository.save(student);
    }
    public Flux<Student> findAll (){
        return studentRepository.findAll().delayElements(Duration.ofSeconds(0,5));
    }

    public Mono<Student> findById( Integer Id){
        return studentRepository.findById(Id);
    }
}
