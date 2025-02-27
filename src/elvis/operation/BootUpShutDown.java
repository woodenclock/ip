package elvis.operation;

/**
 * Manages the boot-up and shut-down sequences for the ELVIS chatbot.
 * Also stores the logo for the chatbot.
 */
public class BootUpShutDown {

    /**
     * Logo for ELVIS the Chatbot
     */
    public static final String LOGO =
            "\n" +
                    "          _____                      _____            _____                      _____                      _____          \n" +
                    "         /\\    \\                    /\\    \\          /\\    \\                    /\\    \\                    /\\    \\         \n" +
                    "        /::\\    \\                  /::\\____\\        /::\\____\\                  /::\\    \\                  /::\\    \\        \n" +
                    "       /::::\\    \\                /:::/    /       /:::/    /                  \\:::\\    \\                /::::\\    \\       \n" +
                    "      /::::::\\    \\              /:::/    /       /:::/    /                    \\:::\\    \\              /::::::\\    \\      \n" +
                    "     /:::/\\:::\\    \\            /:::/    /       /:::/    /                      \\:::\\    \\            /:::/\\:::\\    \\     \n" +
                    "    /:::/__\\:::\\    \\          /:::/    /       /:::/____/                        \\:::\\    \\          /:::/__\\:::\\    \\    \n" +
                    "   /::::\\   \\:::\\    \\        /:::/    /        |::|    |                         /::::\\    \\         \\:::\\   \\:::\\    \\   \n" +
                    "  /::::::\\   \\:::\\    \\      /:::/    /         |::|    |     _____      ____    /::::::\\    \\      ___\\:::\\   \\:::\\    \\  \n" +
                    " /:::/\\:::\\   \\:::\\    \\    /:::/    /          |::|    |    /\\    \\    /\\   \\  /:::/\\:::\\    \\    /\\   \\:::\\   \\:::\\    \\ \n" +
                    "/:::/__\\:::\\   \\:::\\____\\  /:::/____/           |::|    |   /::\\____\\  /::\\   \\/:::/  \\:::\\____\\  /::\\   \\:::\\   \\:::\\____\\\n" +
                    "\\:::\\   \\:::\\   \\::/    /  \\:::\\    \\           |::|    |  /:::/    /  \\:::\\  /:::/    \\::/    /  \\:::\\   \\:::\\   \\::/    /\n" +
                    " \\:::\\   \\:::\\   \\/____/    \\:::\\    \\          |::|    | /:::/    /    \\:::\\/:::/    / \\/____/    \\:::\\   \\:::\\   \\/____/ \n" +
                    "  \\:::\\   \\:::\\    \\         \\:::\\    \\         |::|____|/:::/    /      \\::::::/    /              \\:::\\   \\:::\\    \\     \n" +
                    "   \\:::\\   \\:::\\____\\         \\:::\\    \\        |:::::::::::/    /        \\::::/____/                \\:::\\   \\:::\\____\\    \n" +
                    "    \\:::\\   \\::/    /          \\:::\\    \\       \\::::::::::/____/          \\:::\\    \\                 \\:::\\  /:::/    /    \n" +
                    "     \\:::\\   \\/____/            \\:::\\    \\       ~~~~~~~~~~                 \\:::\\    \\                 \\:::\\/:::/    /     \n" +
                    "      \\:::\\    \\                 \\:::\\    \\                                  \\:::\\    \\                 \\::::::/    /      \n" +
                    "       \\:::\\____\\                 \\:::\\____\\                                  \\:::\\____\\                 \\::::/    /       \n" +
                    "        \\::/    /                  \\::/    /                                   \\::/    /                  \\::/    /        \n" +
                    "         \\/____/                    \\/____/                                     \\/____/                    \\/____/         \n" +
                    "                                                                                                                                \n";

    /**
     * Displays the first part of the boot-up sequence, which includes the ELVIS logo.
     */
    public static void bootUpOne() {
        //ChatBot BootUp
        System.out.println(LOGO);

    }

    /**
     * Displays the second part of the boot-up sequence, which includes a greeting message.
     */
    public static void bootUpTwo() {
        //ChatBot BootUp
        Ui.printHorizontalLines();
        System.out.println("Hello! I'm ELVIS");
        System.out.println("What can I do for you?");
        Ui.printHorizontalLines();
    }

    /**
     * Displays the shut-down sequence, which includes a farewell message.
     */
    public static void shutDown() {
        //ChatBot Ending
        Ui.printHorizontalLines();
        System.out.println("Bye. Hope to see you again soon!");
        Ui.printHorizontalLines();
    }
}
