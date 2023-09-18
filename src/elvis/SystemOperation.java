package elvis;

//Stores Logo, BootUp, ShutDown, Horizontal Lines
public class SystemOperation {
    private static final int NUMBER_OF_UNDERSCORES = 60;

    //Logo for ELVIS the Chatbot
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

    public static void printHorizontalLines() {
        for (int i = 0; i < NUMBER_OF_UNDERSCORES; i++) {
            System.out.print("_");
        }
        System.out.print(System.lineSeparator());
    }

    public static void bootUpOne() {
        //ChatBot BootUp
        System.out.println(SystemOperation.LOGO);

    }

    public static void bootUpTwo() {
        //ChatBot BootUp
        SystemOperation.printHorizontalLines();
        System.out.println("Hello! I'm ELVIS");
        System.out.println("What can I do for you?");
        SystemOperation.printHorizontalLines();
    }

    public static void shutDown() {
        //ChatBot Ending
        SystemOperation.printHorizontalLines();
        System.out.println("Bye. Hope to see you again soon!");
        SystemOperation.printHorizontalLines();
    }
}
