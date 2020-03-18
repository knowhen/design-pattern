package com.when.design_pattern.adapter_pattern;

import com.when.design_pattern.adapter_pattern.duck.Duck;
import com.when.design_pattern.adapter_pattern.duck.Turkey;
import com.when.design_pattern.adapter_pattern.duck.TurkeyAdapter;
import com.when.design_pattern.adapter_pattern.duck.WildTurkey;
import org.junit.Before;
import org.junit.Test;

public class TurkeyAdapterTest {
    private Duck duck;

    @Before
    public void setUp() {
        Turkey turkey = new WildTurkey();
        duck = new TurkeyAdapter(turkey);
    }

    @Test
    public void testTurkeyAdapter() {
        duck.quack();
    }
}