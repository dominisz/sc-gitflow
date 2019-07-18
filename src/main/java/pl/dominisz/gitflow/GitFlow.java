package pl.dominisz.gitflow;

import java.util.function.Supplier;

public class GitFlow {

    private static final Supplier[] SUPPLIERS = {
        new G21(),
        new G23(),
        new LoremIpsum(),
        new Woodchuck(),
        new JC(),
        new LK(),
        new GPZd(),
        new PawelB(),
        new PositiveStringSupplier(),
        new PM8(),
        new G12(),
        new PositiveStringSupplier(),
        new MergeRebase(),
        new DefaultStringSupplierUtilHelperProviderImpl81(),
        new ConstantSupplier()
    };

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("GitFlow style!");

        for (Supplier supplier : SUPPLIERS) {
            System.out.println("--------");
            System.out.println(supplier.get());
        }
    }
}
