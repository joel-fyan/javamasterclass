package com.company;

public class Main {

    public static void main(String[] args) {
        MegaByteConverter.printMegaBytesAndKiloBytes(2500); // expect 2500 KB = 2 MB and 252 KB
        MegaByteConverter.printMegaBytesAndKiloBytes(-1024); // expect Invalid Value
        MegaByteConverter.printMegaBytesAndKiloBytes(5000); // expect 5000 KB = 4 MB and 904 KB
    }
}
