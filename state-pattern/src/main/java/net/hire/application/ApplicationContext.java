package net.hire.application;

import net.hire.application.states.ApplicationState;
import net.hire.application.states.Started;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Piotr Ziemniak
 *         Date: 08.05.13
 */
public class ApplicationContext {

    ApplicationState applicationState;

    //initial state
    public ApplicationContext() {
        this(new Started());
    }

    public ApplicationContext(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }

    public ApplicationState getApplicationState() {
        return applicationState;
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }

    public void displayErrorMessage(String message) {
        System.out.println(message);
    }

    public boolean isFullfilled() {
        return applicationState.isFulfilled();
    }

    public int getProgressInPercent() {
        return applicationState.getProgressInPercent();
    }

    public Object getPage() {
        return applicationState.getPage();
    }

    public void submit(String command) {
        applicationState.submit(this, command);
    }
}

