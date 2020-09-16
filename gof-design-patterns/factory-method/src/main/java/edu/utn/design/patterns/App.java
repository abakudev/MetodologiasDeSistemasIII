package edu.utn.design.patterns;

import edu.utn.design.patterns.factory.WordFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(Word.class);

    public static void main( String[] args )
    {
        WordFactory factory = new WordFactory();
        Document word = factory.createDocument();
        LOGGER.info("A Word Document is Created!");

        word.open();
        word.save();
        word.close();
    }
}
