package net.hire.application.states;

import net.hire.application.ApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Piotr Ziemniak
 *         Date: 08.05.13
 */
public class Fulfiled extends ApplicationState {
    @Override
    public Object getPage() {
        return null;
    }

    @Override
    public Integer getProgressInPercent() {
        return 100;
    }

    @Override
    public void submit(ApplicationContext context, String command) {

    }

    @Override
    public boolean isFulfilled() {
        return true;
    }
}
