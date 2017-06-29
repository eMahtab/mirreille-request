package org.cghr.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahtab on 29/6/17.
 */
public class Record {

    String deathId;
    String type_house;
    String resp_schooling_level;
    String deceased_schooling_level;
    List<String> positive_symptoms;


    public String getDeathId() {
        return deathId;
    }

    public void setDeathId(String deathId) {
        this.deathId = deathId;
    }

    public String getType_house() {
        return type_house;
    }

    public void setType_house(String type_house) {
        this.type_house = type_house;
    }

    public String getResp_schooling_level() {
        return resp_schooling_level;
    }

    public void setResp_schooling_level(String resp_schooling_level) {
        this.resp_schooling_level = resp_schooling_level;
    }

    public String getDeceased_schooling_level() {
        return deceased_schooling_level;
    }

    public void setDeceased_schooling_level(String deceased_schooling_level) {
        this.deceased_schooling_level = deceased_schooling_level;
    }

    public List getPositive_symptoms() {
        return positive_symptoms;
    }

    public void setPositive_symptoms(List positive_symptoms) {
        this.positive_symptoms=positive_symptoms;
    }
}
