package br.ce.wcaquino.taskbackend.services;

import br.ce.wcaquino.taskbackend.model.School;
import br.ce.wcaquino.taskbackend.model.SchoolStatus;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.is;


public class SchoolServiceTest {

    private SchoolService service = new SchoolService();

    @Rule
    public ErrorCollector collector = new ErrorCollector();


    @Test
    public void withGrade0ReturnDisapproved() {
        int grade = 0;
        SchoolStatus status = SchoolStatus.DISAPPROVED;

        School school = service.closedStatus(grade);

        collector.checkThat(school.getGrade(),is(grade));
        collector.checkThat(school.getStatus(),is(status));

    }

    @Test
    public void withGrade39ReturnDisapproved() {
        int grade = 39;
        SchoolStatus status = SchoolStatus.DISAPPROVED;

        School school = service.closedStatus(grade);

        collector.checkThat(school.getGrade(),is(grade));
        collector.checkThat(school.getStatus(),is(status));
    }

    @Test
    public void withGrade40ReturnRecovery() {
        int grade = 40;
        SchoolStatus status = SchoolStatus.RECOVERY;

        School school = service.closedStatus(grade);

        collector.checkThat(school.getGrade(),is(grade));
        collector.checkThat(school.getStatus(),is(status));
    }

    @Test
    public void withGrade59ReturnRecovery() {
        int grade = 59;
        SchoolStatus status = SchoolStatus.RECOVERY;

        School school = service.closedStatus(grade);

        collector.checkThat(school.getGrade(),is(grade));
        collector.checkThat(school.getStatus(),is(status));
    }

    @Test
    public void withGrade60ReturnApproved() {
        int grade = 60;
        SchoolStatus status = SchoolStatus.APPROVED;

        School school = service.closedStatus(grade);

        collector.checkThat(school.getGrade(),is(grade));
        collector.checkThat(school.getStatus(),is(status));
    }

    @Test
    public void withGrade100ReturnApproved() {
        int grade = 100;
        SchoolStatus status = SchoolStatus.APPROVED;

        School school = service.closedStatus(grade);

        collector.checkThat(school.getGrade(),is(grade));
        collector.checkThat(school.getStatus(),is(status));
    }

}