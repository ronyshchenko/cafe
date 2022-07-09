package com.solvd.cafe.Util.jackson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        ObjectMapper om = new ObjectMapper();
        File file = new File("src/main/resources/user.json");
        User user = new User(18, "Petr");

        try {
            if (!file.exists())
                file.createNewFile();
            om.writeValue(file, user);
            LOGGER.info("created!");
        } catch (IOException e) {
            LOGGER.error(e);
        }

        ObjectMapper mapper = new ObjectMapper();

        try {
            User user1 = mapper.readValue(new File("src/main/resources/user.json"), User.class);
            LOGGER.info(user1);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        }
    }
}
