abstract class FunkoFactory {

    abstract Funko createFunko(String name);

    public Funko buildingFunko(String name) throws InterruptedException {

        Funko funko = createFunko(name);

        if (funko == null) {
            System.out.println("\nSorry, we do not have this Funko " + name + " model yet...\n");
            return null;
        }

        System.out.println("\nStart creating a new Funko....\n");
        funko.creatingFunko();

        if (funko.isSpecialEdition()) {
            System.out.println("Your funko " + funko.getName() + " special edition is already created.\n");
        } else {
            System.out.println("Your funko " + funko.getName() + " is already created.\n");
        }

        return funko;
    }
}
