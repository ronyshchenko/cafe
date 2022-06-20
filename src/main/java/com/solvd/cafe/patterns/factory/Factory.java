package com.solvd.cafe.patterns.factory;

import com.solvd.cafe.patterns.builder.Currencies;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Factory {
    private static final Logger LOGGER = LogManager.getLogger(Factory.class);

    public Currency getCurrency(String inputCur) {
        Currency currency = null;
        if (inputCur.equals("dollar")) {
            currency = new Dollar();
        } else if (inputCur.equals("euro")) {
            currency = new Euro();
        } else if (inputCur.equals("pound")) {
        currency = new Pound();
    }

        return currency;
    }
}

interface Currency {
    void getCurrency();
}
class Dollar implements Currency {
    private static final Logger LOGGER = LogManager.getLogger(Dollar.class);
    public void getCurrency () {
        LOGGER.info("Use for dollar");
    }
}
class Euro implements Currency {
    private static final Logger LOGGER = LogManager.getLogger(Euro.class);
    public void getCurrency () {
        System.out.println("Use for euro");
    }
}
class Pound implements Currency {
    private static final Logger LOGGER = LogManager.getLogger(Pound.class);
    public void getCurrency () {
        System.out.println("Use for pound");
    }
}