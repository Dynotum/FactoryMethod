public class FunkoStore extends FunkoFactory {
    @Override
    Funko createFunko(String name) {

        switch (name) {
            case "mewtwo":
                return new MewtwoFunko();
            case "ghost":
                return new GhostKamikazeFunko();
            case "failed_fusion":
                return new FailedFusion();
        }

        return null;
    }
}
