package edu.utn.design.patterns;

import edu.utn.design.patterns.factory.AbstractFactoryForm;
import edu.utn.design.patterns.factory.JavaFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        /*
         * En una aplicacion se deben crear dos tipos de familias de formularios :
         * Desktop y Web, para distintos frameworks de desarrollo, inicialmente para Net y Java.
         * Todos los formularios tienen el metodo Show() en comun, mientras que los Desktop agregan
         * un metodo IsModal() y los Web un Timeout(). En el caso de Net, los forms web se denominan
         * AspForm y desktop WinForm. Para Java, los web son JspForm y desktop JavaForm.

         * Generar un diseño compatible con el patrón AF para este problema
         * (diag. de clases y codigo cliente para testearlo: crear un JspForm y ejecutar Show())
         */

        AbstractFactoryForm formFactory = new JavaFactory();
        WebForm jspForm = formFactory.createWebForm();

        LOGGER.info("Jsp Form Created!");

        jspForm.show();

    }
}
