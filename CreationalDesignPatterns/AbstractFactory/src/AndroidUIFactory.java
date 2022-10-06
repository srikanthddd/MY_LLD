import Buttons.AndroidButton;
import Buttons.Button;
import Dropdowns.AndroidDropdown;
import Dropdowns.Dropdown;
import Menus.AndroidMenu;
import Menus.Menu;

public class AndroidUIFactory implements FlutterUIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
