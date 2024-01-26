package com.ChaimaDAMMAK.ReactiveRestApi.Students;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table (name = "Student")
public class Student {
    @Id
    private Integer Id;
    private String Firstname;
    private String Lastname;
    private Integer age ;
}
