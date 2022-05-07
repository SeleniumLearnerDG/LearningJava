package com.changeingconst;

public class ByteArryaToInt {
    public static void main(String[] args) {
        byte[] INT_BYTE_ARRAY = new byte[] {
                (byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE
        };
        int INT_VALUE = 0xCAFEBABE;

        int value = 0;
        for (byte b : INT_BYTE_ARRAY) {
            value = (value << 8) + (b & 0xFF);
        }
        System.out.println(value+ "    "+ INT_VALUE);


        byte[] bytes = new byte[Integer.BYTES];
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            bytes[length - i - 1] = (byte) (value & 0xFF);
            value >>= 8;
        }

        for (int i = 0; i < length; i++) {
            System.out.println(bytes[i]==INT_BYTE_ARRAY[i]);
        }
    }
}
