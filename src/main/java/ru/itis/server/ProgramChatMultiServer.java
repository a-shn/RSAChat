package ru.itis.server;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

class ProgramChatMultiServer {
    @Parameter(names = {"--port"}, required = true)
    private int port;

    public static void main(String... argv) {
        ProgramChatMultiServer programChatMultiServer = new ProgramChatMultiServer();
        JCommander.newBuilder()
                .addObject(programChatMultiServer)
                .build()
                .parse(argv);
        programChatMultiServer.run();
    }

    private void run() {
        ChatMultiServer server = new ChatMultiServer();
        server.start(port);
    }
}