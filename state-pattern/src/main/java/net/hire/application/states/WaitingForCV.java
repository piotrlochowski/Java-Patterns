package net.hire.application.states;

import net.hire.application.ApplicationContext;

/**
 * Started with IntelliJ IDEA.
 *
 * @author Piotr Ziemniak
 *         Date: 08.05.13
 */
public class WaitingForCV extends ApplicationState {

    @Override
    public Integer getProgressInPercent() {
        return 10;
    }

    @Override
    public Object getPage() {
        return "@Candidate: Please submit yours CV. Press [" + U + "] to upload, other to cancel";
    }

    @Override
    public void submit(ApplicationContext context, String command) {
        if (command.equals(U))
            context.setApplicationState(new WaitingForCVEvaluation());
        else{
            context.setApplicationState(new Failed());
            context.displayErrorMessage("Aren't you awesome developer :P");
        }
    }
}
