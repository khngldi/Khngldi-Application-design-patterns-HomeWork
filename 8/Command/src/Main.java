public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Door door = new Door();
        Thermostat thermostat = new Thermostat();

        ICommand lightOn = new LightOnCommand(light);
        ICommand lightOff = new LightOffCommand(light);
        ICommand doorOpen = new DoorOpenCommand(door);
        ICommand doorClose = new DoorCloseCommand(door);
        ICommand increaseTemp = new IncreaseTemperatureCommand(thermostat);
        ICommand decreaseTemp = new DecreaseTemperatureCommand(thermostat);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.executeCommand(lightOn);

        remoteControl.executeCommand(doorOpen);

        remoteControl.executeCommand(increaseTemp);

        remoteControl.undoLastCommand();

        remoteControl.executeCommand(doorClose);

        remoteControl.executeCommand(lightOff);

        remoteControl.undoLastCommand();
    }
}
