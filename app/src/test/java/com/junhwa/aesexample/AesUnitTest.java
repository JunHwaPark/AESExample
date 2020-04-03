package com.junhwa.aesexample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AesUnitTest {
    @Test
    public void encrypt_test() throws Exception{
        assertEquals(Aes.encrypt(Aes.hexToByteArray("0f000101000000000000000000000000")), "09dccd7658c6878534eda38ddba1d47b");
    }

    @Test
    public void decrypt_test() throws Exception{
        assertEquals(Aes.decrypt(Aes.hexToByteArray("0f000101000000000000000000000000")), "2cffb904609377dcb0b953e23967119c");
    }

    @Test
    public void byteToString() {
        assertEquals(Aes.byteArrayToHex(new byte[] {0x17, 0x18, (byte)0xff, 0x00}), "1718ff00");
    }
}
