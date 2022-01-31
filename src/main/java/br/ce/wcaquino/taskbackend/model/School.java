package br.ce.wcaquino.taskbackend.model;

import lombok.Data;

@Data
public class School {

    private int grade;
    private SchoolStatus status;

    public School(int grade, SchoolStatus status) {
        this.grade = grade;
        this.status = status;
    }
}
