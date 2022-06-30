package com.lun.bito.api.demo.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Scanner;

/**
 * 應試人員請勿修改此class
 */
public class FileCacheDAO {

    public static void write(String content) {
        try (FileWriter fw = new FileWriter("fileCache.txt")) {
            fw.write(content);
            fw.flush();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static String read() {
        File file = new File("fileCache.txt");
        try (Scanner myReader = new Scanner(file)) {
            StringBuilder sb = new StringBuilder();

            while (myReader.hasNextLine()) {
                sb.append(myReader.nextLine());
            }
            return sb.toString();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
