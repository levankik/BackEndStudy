package ge.softgen.softlab.tutorial;

import ge.softgen.softlab.tutorial.abstraction.BaseLogger;
import ge.softgen.softlab.tutorial.abstraction.Logger;
import ge.softgen.softlab.tutorial.exceptions.ValidatorException;
import ge.softgen.softlab.tutorial.impl.logger.ConsoleLogger;
import ge.softgen.softlab.tutorial.impl.logger.FileLogger;
import ge.softgen.softlab.tutorial.impl.validators.IDValidator;
import ge.softgen.softlab.tutorial.impl.validators.ISODateValidator;
import ge.softgen.softlab.tutorial.impl.validators.ValidatorService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        var  logger = new FileLogger (Logger.Level.INFO,"./output.log");
        logger.info("Program is started");
        var scanner = new Scanner(System.in);
        System.out.print("ID: ");
        var id = scanner.next();
        logger.info("ID is " + id);
        System.out.print("Birthdate: ");
        var birthdate= scanner.next();
        logger.info("BirthDate is " + birthdate);
        try {
            ValidatorService.validate(List.of(
                    new IDValidator(id),
                    new ISODateValidator(birthdate)
            ));
            logger.info("Input is valid");
        } catch (ValidatorException e) {
            logger.error(e.getMessage());
        }
    }
}