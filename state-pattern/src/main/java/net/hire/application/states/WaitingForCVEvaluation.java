package net.hire.application.states;

import net.hire.application.ApplicationContext;

/**
 * Started with IntelliJ IDEA.
 *
 * @author Piotr Ziemniak
 *         Date: 08.05.13
 */
public class WaitingForCVEvaluation extends ApplicationState {

    @Override
    public Integer getProgressInPercent() {
        return 10;
    }

    @Override
    public Object getPage() {
        return "@Recruiter: What should I do with such candidate. Press [" + T + "] to test him, [" + H + "] to hire or [" + F + "] to fire";
    }

    @Override
    public void submit(ApplicationContext context, String command) {
        if (command.equals(T))
            context.setApplicationState(new WaitingForExam());
        else if (command.equals(H)){
            context.setApplicationState(new Fulfiled());
            context.displayErrorMessage("Candidate was hired");
        }else if (command.equals(F)){
            context.setApplicationState(new Failed());
            context.displayErrorMessage("Candidate was rejected based on CV");
        }else
            context.setApplicationState(this);
    }
}
