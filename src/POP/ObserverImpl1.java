package POP;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        int state =((ObservableImpl) observable).getState();
        double res = state*state;
        System.out.println("*********** POP.Observer 1 ***********");
        System.out.println("New update : State="+state);
        System.out.println("result : "+res);
        System.out.println("********************************");

    }
}
