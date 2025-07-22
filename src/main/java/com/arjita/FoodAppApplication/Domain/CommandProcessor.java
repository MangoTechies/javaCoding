package com.arjita.FoodAppApplication.Domain;

import com.arjita.FoodAppApplication.infra.OrderManager;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

@Component
public class CommandProcessor {
    private final OrderManager manager;

    public CommandProcessor(OrderManager manager) {
        this.manager = manager;
    }

    public void processCommands(List<Command> commands) {
        commands.stream()
                .sorted(Comparator.comparingLong(Command::getTimestamp))
                .forEach(command -> command.execute(manager));
    }
}