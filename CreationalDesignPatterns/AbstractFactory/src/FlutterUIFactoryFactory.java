//This class is the example of how PracticalFactory works.
public class FlutterUIFactoryFactory {
    public static FlutterUIFactory createFactory(String platform){
        if(platform=="android") {
            return new AndroidUIFactory();
        }else if(platform=="ios"){
            return new IOSUIFactory();
        }
        return null;
    }
}
