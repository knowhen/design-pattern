package com.when.design_pattern.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: when
 * @create: 2019-08-26  10:49
 **/
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equals("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
