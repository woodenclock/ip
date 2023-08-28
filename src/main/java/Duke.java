public class Duke {
    public static void printHorizontalLines() {
        for (int i = 0; i < 60; i++) {
            System.out.print("_");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        String logo =
                "  \n" +
                        "          _____                      _____            _____                      _____                      _____          \n" +
                        "         /\\    \\                    /\\    \\          /\\    \\                    /\\    \\                    /\\    \\         \n" +
                        "        /::\\    \\                  /::\\____\\        /::\\____\\                  /::\\    \\                  /::\\    \\        \n" +
                        "       /::::\\    \\                /:::/    /       /:::/    /                  \\:::\\    \\                /::::\\    \\       \n" +
                        "      /::::::\\    \\              /:::/    /       /:::/    /                    \\:::\\    \\              /::::::\\    \\      \n" +
                        "     /:::/\\:::\\    \\            /:::/    /       /:::/    /                      \\:::\\    \\            /:::/\\:::\\    \\     \n" +
                        "    /:::/__\\:::\\    \\          /:::/    /       /:::/____/                        \\:::\\    \\          /:::/__\\:::\\    \\    \n" +
                        "   /::::\\   \\:::\\    \\        /:::/    /        |::|    |                         /::::\\    \\         \\:::\\   \\:::\\    \\   \n" +
                        "  /::::::\\   \\:::\\    \\      /:::/    /         |::|    |     _____      ____    /::::::\\    \\      ___\\:::\\   \\:::\\    \\  \n" +
                        " /:::/\\:::\\   \\:::\\    \\    /:::/    /          |::|    |    /\\    \\    /\\   \\  /:::/\\:::\\      \\  /\\   \\:::\\   \\:::\\    \\ \n" +
                        "/:::/__\\:::\\   \\:::\\____\\  /:::/____/           |::|    |   /::\\____\\  /::\\   \\/:::/  \\:::\\____  \\/::\\   \\:::\\   \\:::\\____\\\n" +
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



        //ChatBot Starting
        System.out.println(logo);
        printHorizontalLines();
        System.out.println("Hello! I'm ELVIS");
        System.out.println("What can I do for you?");
        printHorizontalLines();

        //Functionalities of ChatBot
        //Echo.Echo();
        //List.List();
        Task.Task();

        //ChatBot Ending
        printHorizontalLines();
        System.out.println("Bye. Hope to see you again soon!");
        printHorizontalLines();
    }
}
