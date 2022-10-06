import Buttons.Button;
import Menus.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        flutter.createTheme();
        flutter.createPlatform();

        FlutterUIFactory UIFactory =  flutter.createUIFactory("ios");

        Button button = UIFactory.createButton();
        button.changeSize();

        Menu menu = UIFactory.createMenu();
        menu.createMenu();


    }
}
