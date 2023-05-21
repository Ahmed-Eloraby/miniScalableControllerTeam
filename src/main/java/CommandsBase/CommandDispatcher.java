package CommandsBase;

import java.util.HashMap;
import java.util.Map;

public abstract class CommandDispatcher {
    protected Map<Class, CommandExecutor> preparedMap = new HashMap<>();

    public CommandResponse dispatch(Command command) {
        return (CommandResponse) preparedMap.get(command.getClass()).execute(command);
    }
}
