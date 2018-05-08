package com.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    /**
     * @Autor Zhang Yu
     * @Description TODO
     * @Date 2018-5-8 11:26
     * @Param [args]
     * @Return void
     **/
    public static void main(String[] args) {
        String basepath = "D:/epcp/upload/anychat";
        File dir = new File(basepath);
        deleteEmptyDir(dir);


        /*int epcp = basepath.indexOf("epcp");
        System.out.println(epcp);
        List<String> allFile = getAllFile(basepath, true);
        List<String> list = new ArrayList<>();
        for (String str : allFile) {
            System.out.println(str);
            if (str.indexOf("162OTA2016008667") != -1) {
                list.add(str);
            }
        }
        System.out.println(list);*/
    }

    public static List<String> getAllFile(String directoryPath, boolean isAddDirectory) {
        List<String> list = new ArrayList<String>();
        File baseFile = new File(directoryPath);
        if (baseFile.isFile() || !baseFile.exists()) {
            return list;
        }
        File[] files = baseFile.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                if (isAddDirectory) {
                    list.add(file.getAbsolutePath());
                }
                list.addAll(getAllFile(file.getAbsolutePath(), isAddDirectory));
            } else {
                list.add(file.getAbsolutePath());
            }
        }
        return list;
    }

    public void removeNullFile(List<File> list) {
        for (int i = 0; i < list.size(); i++) {
            File temp = list.get(i);
            // 是目录且为空
            if (temp.isDirectory() && temp.listFiles().length <= 0) {
                temp.delete();
            }
        }
    }

    public List<File> visitAll(File root) {
        List<File> list = new ArrayList<File>();
        File[] dirs = root.listFiles();
        if (dirs != null) {
            for (int i = 0; i < dirs.length; i++) {
                if (dirs[i].isDirectory()) {
                    System.out.println("name:" + dirs[i].getPath());
                    list.add(dirs[i]);
                }
                visitAll(dirs[i]);
            }
        }
        return list;
    }


    private static void deleteEmptyDir(File dir) {
        if (dir.isDirectory()) {
            File[] fs = dir.listFiles();
            if (fs != null && fs.length > 0) {
                for (int i = 0; i < fs.length; i++) {
                    File tmpFile = fs[i];
                    if (tmpFile.isDirectory()) {
                        deleteEmptyDir(tmpFile);
                    }
                    if (tmpFile.isDirectory() && tmpFile.listFiles().length <= 0) {
                        tmpFile.delete();
                    }
                }
            }
        }
    }








}
