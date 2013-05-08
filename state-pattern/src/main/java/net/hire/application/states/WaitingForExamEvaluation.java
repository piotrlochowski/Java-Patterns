package net.hire.application.states;

import net.hire.application.ApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Piotr Ziemniak
 *         Date: 08.05.13
 */
public class WaitingForExamEvaluation extends ApplicationState {

    @Override
    public Object getPage() {
        return "@Recruiter: Was the test solved correctly? Press [" + H + "] to hire, [" + R + "] ask candidate to repeat, [" + F + "] to fire";
    }

    @Override
    public Integer getProgressInPercent() {
        return 90;
    }

    @Override
    public void submit(ApplicationContext context, String answer) {
        if (answer.equals(H)){
            context.setApplicationState(new Fulfiled());
            context.displayErrorMessage("Candidate was hired");
        }
        else if (answer.equals(R)){
            context.setApplicationState(new WaitingForExam());
            context.displayErrorMessage("Candidate was asked to repeat his test");
        }else if (answer.equals(F)){
            context.setApplicationState(new Failed());
            context.displayErrorMessage("Candidate rejected based on his test results");
        }else{
            context.setApplicationState(this);
        }
    }
}
