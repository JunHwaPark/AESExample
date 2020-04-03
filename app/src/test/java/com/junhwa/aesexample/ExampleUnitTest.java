package com.junhwa.aesexample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void encrypt_test() throws Exception{
        assertEquals(Aes.encrypt(Aes.hexToByteArray("0f000101000000000000000000000000")), "09dccd7658c6878534eda38ddba1d47a");
    }
}