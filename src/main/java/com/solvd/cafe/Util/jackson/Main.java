package com.solvd.cafe.Util.jackson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        UserBean userBean = new UserBean(1, "Petr", "Petrenko");
        String resultJson = new ObjectMapper().writeValueAsString(userBean);
        LOGGER.info(resultJson);

        ObjectMapper mapper = new ObjectMapper();

        try {
            User user = mapper.readValue(new File("src/main/resources/user.json"), User.class);
            System.out.println(user);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
