package com.ChaimaDAMMAK.ReactiveRestApi.Students;

import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/ReactiveApi")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    Mono<Student> Save (@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping
    Flux<Student> findAllStudents(){
        return  studentService.findAll();
    }
    @GetMapping("/{id}")
    Mono<Student> findById(@PathVariable("id") Integer Id ){
        return studentService.findById(Id);
    }
}
