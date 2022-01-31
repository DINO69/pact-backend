package br.ce.wcaquino.taskbackend.services;

import br.ce.wcaquino.taskbackend.model.School;
import br.ce.wcaquino.taskbackend.model.SchoolStatus;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    public School closedStatus(int grade){
        School school = new School(grade, SchoolStatus.whatStatus(grade));
        return school;
    }

}
