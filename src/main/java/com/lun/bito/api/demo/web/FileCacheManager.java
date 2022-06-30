package com.lun.bito.api.demo.web;

import com.lun.bito.api.demo.dao.FileCacheDAO;

/**
 * 請配合題目要求，完成get、set的撰寫
 */
public class FileCacheManager {

    private static final FileCacheManager instance = new FileCacheManager();

    private FileCacheManager() {

        super();
    }

    public static FileCacheManager getInstance() {
        return instance;
    }

    public  String get() {
        FileCacheDAO fileCacheDAO= new FileCacheDAO();
        Thread th  = new Thread((Runnable) fileCacheDAO);
        th.run();
        th.start();

        return "";
    }

    public void set(String content) {

    }
}

