package CommandPattern;

import java.util.Stack;

public class CommandRepository {
    public CommandRepository() {
        commands = new Stack<>();
    }

    Stack<Command> commands;

    public void storeCommand(Command command) {
        commands.push(command);
    }

    public Command retrieveCommand() {
        return commands.pop();
    }

}
