package com.sinosoft.fccb.policy.common.model;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class TransferEncode {

    static String mpath = "E:\\prpins\\component\\com\\sinosoft\\common\\schema\\model";
    static String newpath = "E:\\prpins\\component\\com\\sinosoft\\common\\schema\\newmodel";


    public static void main(String[]args){
        File mFile = new File(mpath);

        File[] mFiles = mFile.listFiles();
        for(File f: mFiles){
            //System.out.println(f.getName());
//            if(f.getName().equals("PrpCmain.java")){
                try {
                    transfer(f);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            //}
        }
    }

    static void transfer(File file) throws IOException {
        FileUtils.writeLines(new File(newpath+"//"+file.getName()),
                "UTF-8", FileUtils.readLines(file, "GBK"));


    }
}

