public class Funko {

    private String name;
    private String branding;
    private boolean specialEdition;

    Funko(String name, String branding, boolean specialEdition) {
        this.name = name;
        this.branding = branding;
        this.specialEdition = specialEdition;
    }

    public String getName() {
        return name;
    }

    public String getBranding() {
        return branding;
    }

    public boolean isSpecialEdition() {
        return specialEdition;
    }


    public void creatingFunko() throws InterruptedException {
        System.out.println("Creating a new " + getName() + " from " + getBranding() + "...");
        Thread.sleep(3000);

        if (isSpecialEdition()) {
            System.out.println("Woow this is special edition!!");
        }
    }

}

class MewtwoFunko extends Funko {


    MewtwoFunko() {
        super("Mewtwo", "Pokemon", false);
    }

    public void attackShadowBall() {
        System.out.println("Watch out! Mewtwo is attacking with shadow ball!!");
    }
}

class GhostKamikazeFunko extends Funko {

    GhostKamikazeFunko() {
        super("Ghost Kamikaze", "Dragon Ball Z", false);
    }
}

class FailedFusion extends Funko {

    FailedFusion() {
        super("Fat and Skinny Gotenks", "Dragon Ball Z", true);
    }
}
