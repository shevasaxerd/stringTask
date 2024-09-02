import services.InputDataServiceImpl;
import services.MainService;
import services.StringServiceImpl;

public class Main {
    public static void main(String[] args) {

        InputDataServiceImpl inputDataServiceImpl = new InputDataServiceImpl();
        StringServiceImpl stringServiceImpl = new StringServiceImpl(inputDataServiceImpl);
        MainService mainService = new MainService(stringServiceImpl, inputDataServiceImpl);
        mainService.start();

    }
}