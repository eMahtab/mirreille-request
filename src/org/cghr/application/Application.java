package org.cghr.application;

import org.cghr.report.GenerateReport;
import org.cghr.util.RecordParser;

/**
 * Created by mahtab on 29/6/17.
 */
public class Application {


    public static void main(String args[]) throws Exception{
        RecordParser.parseRecords();
        GenerateReport.generateReport();
    }

}
