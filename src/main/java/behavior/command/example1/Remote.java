package behavior.command.example1;

public class Remote {
    private final Command turnOnCommand;
    private final Command turnOffCommand;

    public Remote(Command turnOnCommand, Command turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

    public void turnOnButtonClick() {
        turnOnCommand.execute();
    }

    public void turnOffButtonClick() {
        turnOffCommand.execute();
    }

}
