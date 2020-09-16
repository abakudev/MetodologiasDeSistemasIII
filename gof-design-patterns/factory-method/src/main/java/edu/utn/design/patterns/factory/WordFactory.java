package edu.utn.design.patterns.factory;

import edu.utn.design.patterns.Document;
import edu.utn.design.patterns.Word;

public class WordFactory implements DocumentCreator {

    @Override
    public Document createDocument() {
        return new Word();
    }
}
