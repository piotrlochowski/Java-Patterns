package net.hire.application.states;

import net.hire.application.ApplicationContext;

/**
 * Started with IntelliJ IDEA.
 *
 * @author Piotr Ziemniak
 *         Date: 08.05.13
 */
public class WaitingForExam extends ApplicationState {

    @Override
    public Object getPage() {
        return "@Candidate: Press ["+ S +"] to submit yours answers";
    }

    @Override
    public Integer getProgressInPercent() {
        return 30;
    }

    @Override
    public void submit(ApplicationContext context, String command) {
        if (command.equals(S)){
            context.setApplicationState(new WaitingForExamEvaluation());
        }else{
            context.setApplicationState(new Failed());
            context.displayErrorMessage("Don't give up so quickly!");
        }
    }
}
