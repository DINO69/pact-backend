package br.ce.wcaquino.taskbackend.services;

import br.ce.wcaquino.taskbackend.model.School;
import br.ce.wcaquino.taskbackend.model.SchoolStatus;
import br.ce.wcaquino.taskbackend.utils.ValidationException;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    public School closedStatus(int grade) {
        if(grade > 100){
            throw new ValidationException("Valr inválidooooooo!!!!");
        }
        School school = new School(grade, SchoolStatus.whatStatus(grade));
        return school;
    }

}
