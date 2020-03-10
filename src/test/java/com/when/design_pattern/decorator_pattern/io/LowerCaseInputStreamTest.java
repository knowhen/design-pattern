package com.when.design_pattern.decorator_pattern.io;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class LowerCaseInputStreamTest {
    private InputStream inputStream;

    @Before
    public void setUp() throws Exception {
        inputStream = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("D:\\design_pattern\\target\\classes\\test-input-stream.txt")
                )
        );
    }

    @Test
    public void testLowerCaseInputStream() throws IOException {
        StringBuilder builder = new StringBuilder();
        int c;
        while ((c = inputStream.read()) >= 0) {
            builder.append((char) c);
        }
        assertEquals("i know the decorator pattern therefor i rule!", builder.toString());
    }

    @After
    public void tearDown() throws Exception {
        inputStream.close();
    }
}