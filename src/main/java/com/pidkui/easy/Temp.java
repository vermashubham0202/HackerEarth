package com.pidkui.easy;

import java.io.IOException;
import java.nio.file.Files;

public class Temp {
    public static void main(String[] args) throws IOException {
        String tmpdir = Files.createTempDirectory("tmpDirPrefix").toFile().getAbsolutePath();
        String tmpDirsLocation = System.getProperty("java.io.tmpdir");
        System.out.println("tmpdir: " + tmpdir);
        System.out.println("tmpDirsLocation: " + tmpDirsLocation);
    }
}
