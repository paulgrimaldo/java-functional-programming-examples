package com.grimaldo.functional.example._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {

    public static void showHelp(CLIArguments cliArguments) {
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if (cliArguments1.isHelp())
                System.out.println("Manual required");
        };
        consumerHelper.accept(cliArguments);
    }

    public static CLIArguments generateCLI() {
        Supplier<CLIArguments> generator = CLIArguments::new;

        return generator.get();
    }
}
