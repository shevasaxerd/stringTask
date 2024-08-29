import services.MainService;
import services.StringServiceImpl;

public class Main {
    public static void main(String[] args) {

        StringServiceImpl mathServiceImpl = new StringServiceImpl();
        MainService mainService = new MainService(mathServiceImpl);
        mainService.start();

    }
}