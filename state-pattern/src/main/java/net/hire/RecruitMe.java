package net.hire;

import net.hire.application.ApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Piotr Ziemniak
 *         Date: 08.05.13
 */
public class RecruitMe {

    public static void main(String[] argv) throws IOException {
        ApplicationContext applicationContext = new ApplicationContext();

        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);

        do {
            System.out.println(applicationContext.getPage());
            System.out.println("  [ APPLICATION PROGRESS " + applicationContext.getProgressInPercent()+" ]");
            applicationContext.submit(in.readLine());
        } while ((!applicationContext.isFullfilled()));
    }


}
