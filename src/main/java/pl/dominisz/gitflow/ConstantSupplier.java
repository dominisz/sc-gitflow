package pl.dominisz.gitflow;

import java.util.function.Supplier;

public class ConstantSupplier implements Supplier<String> {
    @Override
    public String get() {
        return "I'm constant supplier";
    }
}
