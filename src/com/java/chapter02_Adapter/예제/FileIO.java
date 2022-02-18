package com.java.chapter02_Adapter.예제;

import java.io.IOException;

public interface FileIO {
    public void readFromFile(String filename)throws IOException;
    public void writeToFile(String filename)throws IOException;
    public void setValue(String key, String value)throws IOException;
    public String getValue(String key)throws IOException;
}
