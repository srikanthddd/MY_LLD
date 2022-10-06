import Buttons.Button;
import Dropdowns.Dropdown;
import Menus.Menu;

public interface FlutterUIFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
