package net.hire.application.states;

import net.hire.application.ApplicationContext;

/**
 * Started with IntelliJ IDEA.
 *
 * @author Piotr Ziemniak
 *         Date: 08.05.13
 */
public abstract class ApplicationState {

    protected static final String T = "T";
    protected static final String H = "H";
    protected static final String F = "F";
    protected static final String Y = "Y";
    protected static final String N = "N";
    protected static final String U = "U";
    protected static final String S = "S";
    protected static final String P = "P";
    protected static final String C = "C";
    protected static final String R = "R";

    public abstract Object getPage();

    public abstract Integer getProgressInPercent();

    public abstract void submit(ApplicationContext context, String command);

    public boolean isFulfilled() {
        return false;
    }
}
