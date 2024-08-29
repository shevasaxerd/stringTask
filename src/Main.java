import services.MainService;
import services.StringServiceImpl;

public class Main {
    public static void main(String[] args) {

        StringServiceImpl stringServiceImpl = new StringServiceImpl();
        MainService mainService = new MainService(stringServiceImpl);
        mainService.start();

    }
}