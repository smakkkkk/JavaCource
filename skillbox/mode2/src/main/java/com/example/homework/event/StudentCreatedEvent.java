package com.example.homework.event;

import com.example.homework.model.Student;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class StudentCreatedEvent extends ApplicationEvent {
    private final Student student;

    public StudentCreatedEvent(Object source, Student student) {
        super(source);
        this.student = student;
    }

}