package c_linkedlist;

import java.io.File;

/**
 * @author ming
 * @description
 * @date 2020/6/24
 */
public class RenameFile {
    public static void main(String[] args) {

        String newString = "";//新字符串,如果是去掉前缀后缀就留空，否则写上需要替换的字符串
        String oldString = "【瑞客论坛 www.ruike1.com】";//要被替换的字符串
        String dir = "G:\\临时文件夹\\数据结构与算法\\03-链表";//文件所在路径，所有文件的根目录，记得修改为你电脑上的文件所在路径

        File folder = new File(dir);

        File[] fileArr = folder.listFiles();

        File newDir = null;//文件所在文件夹路径+新文件名
        String newName = "";//新文件名
        String fileName = null;//旧文件名
        File parentPath = new File("");//文件所在父级路径
        for (File file : fileArr) {

            fileName = file.getName();
            parentPath = file.getParentFile();
            if (fileName.contains(oldString)) {//文件名包含需要被替换的字符串
                newName = fileName.replaceAll(oldString, newString);//新名字
                newDir = new File(parentPath + "/" + newName);//文件所在文件夹路径+新文件名
                file.renameTo(newDir);//重命名
                System.out.println("修改后：" + newDir);
            }

        }
    }

}
