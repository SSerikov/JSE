package ru.serikov.tm;

import static ru.serikov.tm.constant.TerminalConst.*;

/**
 * Тестовое приложение
 */

public class App {

    public static void main(final String[] args) {
        run(args);
        displayWelcome();
    }

    private static void run (final String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        final String param = args[0];
        switch (param) {
            case CMD_VERSION: displayVersion();
            case CMD_ABOUT: displayAbout();
            case CMD_HELP: displayHelp ();
            default: displayError();
        }
    }

    private static void displayError() {
        System.out.println("Error! Unknown program argument...");
        System.exit(-1);
    }

    private static void displayWelcome() {
        System.out.println("** WELCOME TO TASK MANAGER **");
    }

    private static void displayHelp() {
        System.out.println("version - display application version");
        System.out.println("about - display developer info");
        System.out.println("help - display list of commands");
        System.exit(0);
    }

    private static void displayAbout() {
        System.out.println("Sergey Serikov");
        System.out.println("serikov_sy@nlmk.com");
        System.exit(0);
    }

    private static void displayVersion() {
        System.out.println("1.0.0");
        System.exit(0);
    }

}


