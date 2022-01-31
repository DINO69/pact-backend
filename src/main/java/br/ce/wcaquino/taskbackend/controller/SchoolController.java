package br.ce.wcaquino.taskbackend.controller;


import br.ce.wcaquino.taskbackend.model.School;
import br.ce.wcaquino.taskbackend.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/school")
public class SchoolController {

    @Autowired
    private SchoolService service;

    @RequestMapping(value ="/with-grades/{grade}")
    public ResponseEntity<?> getStatusGrades(@PathVariable int grade){
        School status = service.closedStatus(grade);
        return ResponseEntity.ok(status);
    }

}
