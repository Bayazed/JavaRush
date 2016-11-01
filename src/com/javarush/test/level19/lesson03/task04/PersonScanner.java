package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Scanner;

public interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}
