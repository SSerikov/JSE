package ru.serikov.tm;

import java.util.Scanner;

import static ru.serikov.tm.constant.TerminalConst.*;

/**
 * Тестовое приложение
 */
public class App {

    public static void main(final String[] args) {
        run(args);
        displayWelcome();
        process();
    }

    public static void process() {
        final Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!CMD_EXIT.equals(command)) {
            command = scanner.nextLine();
            run(command);
            System.out.println();
        }
    }

    private static void run (final String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        final String param = args[0];
        final int  result = run(param);
        System.exit(result);
    }

    private static int run (final String param) {
        if (param == null || param.isEmpty()) return -1;
        switch (param) {
            case CMD_VERSION: return displayVersion();
            case CMD_ABOUT: return displayAbout();
            case CMD_HELP: return displayHelp ();
            case CMD_EXIT: return Exit ();
            default: return displayError();
        }
    }

    private static int displayError() {
        System.out.println("Error! Unknown program argument...");
        return -1;
    }

    private static void displayWelcome() {
        System.out.println("** WELCOME TO TASK MANAGER **");
    }

    private static int displayHelp() {
        System.out.println("version - display application version");
        System.out.println("about - display developer info");
        System.out.println("help - display list of commands");
        System.out.println("exit - terminate console application");
        return 0;
    }

    private static int displayAbout() {
        System.out.println("Sergey Serikov");
        System.out.println("serikov_sy@nlmk.com");
        return 0;
    }

    private static int displayVersion() {
        System.out.println("1.0.0");
        return 0;
    }

    private static int Exit() {
        System.exit(0);
        return 0;
    }

}
