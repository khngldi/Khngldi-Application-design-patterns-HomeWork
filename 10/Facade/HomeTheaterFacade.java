public class HomeTheaterFacade {
    private TV tv;
    private AudioSystem audioSystem;
    private DVDPlayer dvdPlayer;
    private GameConsole gameConsole;

    public HomeTheaterFacade(TV tv, AudioSystem audioSystem, DVDPlayer dvdPlayer, GameConsole gameConsole) {
        this.tv = tv;
        this.audioSystem = audioSystem;
        this.dvdPlayer = dvdPlayer;
        this.gameConsole = gameConsole;
    }

    public void watchMovie() {
        tv.on();
        audioSystem.on();
        dvdPlayer.play();
        System.out.println("Настройка для просмотра фильма завершена");
    }

    public void endMovie() {
        dvdPlayer.stop();
        audioSystem.off();
        tv.off();
        System.out.println("Завершение просмотра фильма");
    }

    public void playGame() {
        gameConsole.on();
        gameConsole.startGame();
        System.out.println("Запуск игровой консоли");
    }

    public void listenToMusic() {
        tv.on();
        audioSystem.on();
        audioSystem.setVolume(20);
        System.out.println("Настройка для прослушивания музыки завершена");
    }
}