package com.java.chapter02_Adapter.예제;

import java.io.IOException;

public class FileProperties implements FileIO {
    @Override
    public void readFromFile(String filename) throws IOException {

    }

    @Override
    public void writeToFile(String filename) throws IOException {

    }

    @Override
    public void setValue(String key, String value) throws IOException {

    }

    @Override
    public String getValue(String key) throws IOException {
        return null;
    }
}
