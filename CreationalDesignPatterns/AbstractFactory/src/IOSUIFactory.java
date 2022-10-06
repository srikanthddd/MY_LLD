import Buttons.AndroidButton;
import Buttons.Button;
import Buttons.IOSButton;
import Dropdowns.AndroidDropdown;
import Dropdowns.Dropdown;
import Dropdowns.IOSDropdown;
import Menus.AndroidMenu;
import Menus.IOSMenu;
import Menus.Menu;

public class IOSUIFactory implements FlutterUIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
