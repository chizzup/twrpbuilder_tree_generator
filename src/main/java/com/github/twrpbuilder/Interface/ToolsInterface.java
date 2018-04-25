package com.github.twrpbuilder.Interface;

import java.io.File;
import java.util.LinkedList;

public interface ToolsInterface {
    String newLine = "\n";
    String seprator = File.separator;
    String travisYml = ".travis.yml";
    String home = System.getProperty("user.home") + seprator;
    String pwd = System.getProperty("user.dir") + seprator;

    boolean fexist(String name);

    String command(String run);

    LinkedList command(String run, boolean LinkList);

    boolean mkdir(String name);

    boolean rm(String name);

    String CopyRight();

    void cp(String from, String to);

    String propFile();

    String getModel();

    String getProduct();

    String getBrand();

    String getCodename();

    String getPlatform();

    String getApi();

    String getFingerPrint();

    String getPathS();

    String getPath();
}