package com.launchableinc;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class AppTest {
    /**
     * Demonstrates that we can throw a checked exception without the 'throws' clause.
     */
    private void magicThrow(Throwable t) {
        CyYoung.pitch(t);
    }

    @Test
    public void demo() {
        try {
            magicThrow(new IOException("foo"));
        } catch (Exception e) {
            e.printStackTrace();
            assertThat(e, CoreMatchers.<Exception>instanceOf(IOException.class));
            assertThat(e.getMessage(), is("foo"));
        }
    }
}
