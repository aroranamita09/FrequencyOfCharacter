package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalOccurencesTest {

    TotalOccurences obj;
    @Before
    public void setUp() throws Exception {
        obj = new TotalOccurences();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkOccurence() {
        assertNotEquals(2,obj.checkOccurence("India","i"));
        assertEquals(2,obj.checkOccurence("india","i"));
        assertEquals(0,obj.checkOccurence("",""));
        assertEquals(5,obj.checkOccurence("iiiii","i"));
       assertNotEquals(3,obj.checkOccurence("epddrefe","d"));
    }
}
