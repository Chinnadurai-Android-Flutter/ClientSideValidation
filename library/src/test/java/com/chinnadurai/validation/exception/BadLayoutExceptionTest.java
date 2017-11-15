package com.chinnadurai.validation.exception;

import org.junit.Test;

public class BadLayoutExceptionTest {

    @Test(expected = BadLayoutException.class)
    public void testBadLayoutException() {
        throw new BadLayoutException("Test");
    }

}
