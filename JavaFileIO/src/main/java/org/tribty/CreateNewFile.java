package org.tribty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    private static final String workingDir = "C:\\Data\\Temp";
    private static final Logger log = LoggerFactory.getLogger(CreateNewFile.class);

    public static void main(String[] args) {
        String filePath = workingDir + "/createNewFileTest.txt";
        File fileObj = new File(filePath);
        if (fileObj.exists())   fileObj.delete();
        log.info("Creating file at absolute path {}", filePath);
        try {
            if (fileObj.createNewFile()) log.info("File created successfully");
            else log.info("File already exists");
        } catch (IOException ie) {
            log.error(ie.getMessage());
        }
        fileObj = new File("temp.txt");
        if (fileObj.exists())   fileObj.delete();
        log.info("Creating file at current path {}", System.getProperty("user.dir"));
        try {
            if (fileObj.createNewFile()) log.info("File created successfully");
            else log.info("File already exists");
        } catch (IOException ie) {
            log.error(ie.getMessage());
        }
        filePath = "src/main/resources/resource.log";
        fileObj = new File(filePath);
        if (fileObj.exists())   fileObj.delete();
        log.info("Creating file at relative path {}", filePath);
        try {
            if (fileObj.createNewFile()) log.info("File created successfully");
            else log.info("File already exists");
        } catch (IOException ie) {
            log.error(ie.getMessage());
        }
    }
}
