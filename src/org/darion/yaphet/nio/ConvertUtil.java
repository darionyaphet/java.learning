package org.darion.yaphet.nio;

public class ConvertUtil {

    public static short toShort(byte[] bytes) {
        return (short) ((bytes[1] & 0xFF) |
                (bytes[0] & 0xFF) << 8);
    }

    public static byte[] toBytes(short s) {
        return new byte[]{
                (byte) ((s >> 8) & 0xFF),
                (byte) (s & 0xFF)
        };
    }

    public static int toInt(byte[] bytes) {
        return bytes[3] & 0xFF |
                (bytes[2] & 0xFF) << 8 |
                (bytes[1] & 0xFF) << 16 |
                (bytes[0] & 0xFF) << 24;
    }

    public static byte[] toBytes(int i) {
        return new byte[]{
                (byte) ((i >> 24) & 0xFF),
                (byte) ((i >> 16) & 0xFF),
                (byte) ((i >> 8) & 0xFF),
                (byte) (i & 0xFF)
        };
    }

    public static long toLong(byte[] bytes) {
        return bytes[7] & 0xFF |
                (bytes[6] & 0xFF) << 8 |
                (bytes[5] & 0xFF) << 16 |
                (bytes[4] & 0xFF) << 24 |
                (bytes[3] & 0xFF) << 32 |
                (bytes[2] & 0xFF) << 40 |
                (bytes[1] & 0xFF) << 48 |
                (bytes[0] & 0xFF) << 56;
    }

    public static byte[] toBytes(long l) {
        return new byte[]{
                (byte) ((l >> 56) & 0xFF),
                (byte) ((l >> 48) & 0xFF),
                (byte) ((l >> 40) & 0xFF),
                (byte) ((l >> 32) & 0xFF),
                (byte) ((l >> 24) & 0xFF),
                (byte) ((l >> 16) & 0xFF),
                (byte) ((l >> 8) & 0xFF),
                (byte) (l & 0xFF)
        };
    }

    public static void main(String[] args) {
        short s = 1024;
        System.out.println(ConvertUtil.toShort(ConvertUtil.toBytes(s)));

        int i = 1024;
        System.out.println(ConvertUtil.toInt(ConvertUtil.toBytes(i)));

        long l = 1024L;
        System.out.println(ConvertUtil.toLong(ConvertUtil.toBytes(l)));
    }
}
