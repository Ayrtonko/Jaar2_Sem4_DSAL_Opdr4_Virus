public class Main {

    public static void main(String[] args) {
        VirusGame game = new VirusGame(7);
        game.virusSingleGame(new MyVirusStrategy(),new RandomVirusStrategy());
    }
}
