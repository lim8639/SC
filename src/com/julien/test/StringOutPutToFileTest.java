package com.julien.test;

import com.julien.utils.StringOutPutToFile;

public class StringOutPutToFileTest {

    @org.junit.Test
    public void fileREAD() {
    }

    @org.junit.Test
    public void fileWRITE() {
        StringOutPutToFile.fileWRITE("hello.txt","helloworld");
    }
}