package com.company;

public class Main {

    public static void main(String[] args) {
        //int 32 bit
        int minIntVal = Integer.MIN_VALUE;
        int maxIntVal = Integer.MIN_VALUE;
        System.out.println("min value for int is " + minIntVal);
        System.out.println("max value for int is " + maxIntVal);

        System.out.println("Busted MIX value is " + (minIntVal - 1));
        System.out.println("Busted MAX value is " + (maxIntVal + 1));

        // byte 8 bit
        byte minByteVal = Byte.MIN_VALUE;
        byte maxByteVal = Byte.MAX_VALUE;
        System.out.println("Min Byte value is " + minByteVal);
        System.out.println("Max Byte value is " + maxByteVal);

        // short 16 bit
        short minShortVal = Short.MIN_VALUE;
        short maxShortVal = Short.MAX_VALUE;
        System.out.println("Min Short value is " + minShortVal);
        System.out.println("Max Short value is " + maxShortVal);

        //long 64 bit
        long myLongValue = 100L;
        long minLongVal = Long.MIN_VALUE;
        long maxLongVal = Long.MAX_VALUE;
        System.out.println("Min Long value is " + minLongVal);
        System.out.println("Max Long value is " + maxLongVal);

        byte newByte = (byte)(minByteVal / 2);
        System.out.println(newByte);

        byte b = 10;
        short s = 20;
        int i = 50;
        long l = 50000L + (10L*(b+s+i));
        System.out.println(l);

        // float - single precision - 32 bit
        float minFloatVal = Float.MIN_VALUE;
        float maxFloatVal = Float.MAX_VALUE;
        System.out.println("float MIN value is " + minFloatVal);
        System.out.println("float MAX value is " + maxFloatVal);
        
        //double - double precision - 64 bit
        double minDoubleVal = Double.MIN_VALUE;
        double maxDoubleVal = Double.MAX_VALUE;
        System.out.println("Double MIN value is " + minDoubleVal);
        System.out.println("Double MAX value is " + maxDoubleVal);

        int newInt = 5 / 3;
        float newFloat = 5f / 3f;
        double newDouble =  5d / 3d;
        System.out.println("newInt " + newInt);
        System.out.println("newFloat " + newFloat);
        System.out.println("newDouble " + newDouble);


    }
}
