package io.snyk.app;

import io.snyk.list.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static io.snyk.utilities.StringUtils.join;
import static io.snyk.utilities.StringUtils.split;
import static io.snyk.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    private static final Logger logger = LogManager.getLogger("App");

    public static void main(String[] args) {
        LinkedList tokens = split(getMessage());
        String text = join(tokens);
        String output = WordUtils.capitalize(text);
        logger.info(output);
    }
}
