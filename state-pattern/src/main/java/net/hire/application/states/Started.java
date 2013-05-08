package net.hire.application.states;

import net.hire.application.ApplicationContext;

/**
 * Started with IntelliJ IDEA.
 *
 * @author Piotr Ziemniak
 *         Date: 08.05.13
 */
public class Started extends ApplicationState {

    @Override
    public Integer getProgressInPercent() {
        return 0;
    }

    @Override
    public Object getPage() {
        return "@Candidate: If you are awesome developer do not hesitate to apply. Press [" + P + "] to proceed, [" + C + "] to cancel ";
    }

    @Override
    public void submit(ApplicationContext context, String command) {
        if (command.equals(P))
            context.setApplicationState(new WaitingForCV());
        else if (command.equals(C))
            context.setApplicationState(new Failed());
        else{
            context.displayErrorMessage("no such option");
            context.setApplicationState(new Started());
        }
    }
}
