public class Flutter {

    public void createTheme(){
        System.out.println("Theme is created");
    }
    public void createPlatform(){
        System.out.println("Platform is created");
    }
    public FlutterUIFactory createUIFactory(String platform){
        return FlutterUIFactoryFactory.createFactory(platform);
    }

}
