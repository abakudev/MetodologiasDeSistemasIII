package edu.utn.design.patterns.factory;

import edu.utn.design.patterns.Document;
import edu.utn.design.patterns.Pdf;

public class PdfFactory implements DocumentCreator{
    @Override
    public Document createDocument() {
        return new Pdf();
    }
}
