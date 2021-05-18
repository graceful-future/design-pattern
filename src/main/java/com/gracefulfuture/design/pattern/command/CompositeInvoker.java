package com.gracefulfuture.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class CompositeInvoker extends Command{
    private List<Command> commands = new ArrayList<>();

    public void add(Command command){
        commands.add(command);
    }

    public void remove(Command command){
        commands.remove(command);
    }

    public Command getChild(int index){
        return commands.get(index);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
