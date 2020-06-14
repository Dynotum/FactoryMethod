public class App {
    public static void main(String[] args) throws InterruptedException {

        FunkoStore funkoStore = new FunkoStore();

        funkoStore.buildingFunko("mewtwo");
        funkoStore.buildingFunko("failed_fusion");
        Funko mewtwo = funkoStore.createFunko("mewtwo");

        MewtwoFunko mew2 = (MewtwoFunko) mewtwo;
        mew2.creatingFunko();
        mew2.attackShadowBall();

        funkoStore.buildingFunko("mew");
        funkoStore.buildingFunko("ghost");

    }
}
