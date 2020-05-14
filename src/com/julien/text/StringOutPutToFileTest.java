package com.julien.text;

import com.julien.utils.StringOutPutToFile;

import static org.junit.Assert.*;

public class StringOutPutToFileTest {

    @org.junit.Test
    public void fileREAD() {
    }

    @org.junit.Test
    public void fileWRITE() {
        StringOutPutToFile.fileWRITE("hello.txt","helloworld");
    }
}