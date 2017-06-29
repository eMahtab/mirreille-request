package org.cghr.util;

/**
 * Created by mahtab on 29/6/17.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;

import org.cghr.model.Record;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RecordParser {

    public static Map<String,Record> records=new HashMap<String,Record>();
    static String file="/home/mahtab/mireille/anand/va/data.json";

    public static void parseRecords() throws FileNotFoundException, IOException, ParseException {

        JSONParser parser = new JSONParser();
        JSONArray a = (JSONArray) parser.parse(new FileReader(file));
        System.out.println("Size is : " + a.size());

        int counter=0;

        for(int i=0;i<a.size();i++){
            Object o=a.get(i);
            JSONObject record = (JSONObject) o;

            String deathId= Long.toString( ((Long)record.get("deathId")) );
            String typeHouse = (String) record.get("typeHouse");
            String respSchoolingLevel =  (String) record.get("respSchoolingLevel");
            String deceasedSchoolingLevel =  (String) record.get("schoolingLevel");

            JSONArray symptoms = (JSONArray) record.get("summary");
            Iterator<JSONObject> iterator = symptoms.iterator();
            List<String> sym=new ArrayList<String>();
            while (iterator.hasNext()) {
                   sym.add((String)iterator.next().get("name"));
            }


            Record v=new Record();
            v.setDeathId(deathId);
            v.setType_house(typeHouse);
            v.setResp_schooling_level(respSchoolingLevel);
            v.setDeceased_schooling_level(deceasedSchoolingLevel);
            v.setPositive_symptoms(sym);

            records.put(deathId, v);

            System.out.println("deathId : "+deathId+"  -> typeHouse :"+typeHouse+
                    "  > respSchoolingLevel :"+respSchoolingLevel);
            counter++;
        }

        System.out.println("Total Count is : "+counter);

    }
}
