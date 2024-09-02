import services.InputDataServiceImpl;
import services.MainService;
import services.StringServiceImpl;

public class Main {
    public static void main(String[] args) {

        StringServiceImpl stringServiceImpl = new StringServiceImpl();
        InputDataServiceImpl inputDataServiceImpl = new InputDataServiceImpl();
        MainService mainService = new MainService(stringServiceImpl, inputDataServiceImpl);
        mainService.start();

    }
}