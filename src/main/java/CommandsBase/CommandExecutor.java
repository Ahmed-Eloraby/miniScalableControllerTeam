package CommandsBase;

public interface CommandExecutor<R extends CommandResponse, C extends Command> {
    public R execute(C command);
}
