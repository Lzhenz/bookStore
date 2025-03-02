package com.zhenz.java_01.charator04;

import java.io.File;
import java.util.Locale;

public class TraveseDir {
protected File filesPath;
protected File max;
protected File min;
protected long findCount;
protected long findTime;

        public TraveseDir() {
}

        public TraveseDir(String filesPath) {
this.filesPath = new File(filesPath);
File[] initialFiles = this.filesPath.listFiles();
if (initialFiles != null && initialFiles.length > 0) {
this.max = this.filesPath.listFiles()[0];
this.findNotZeroFile(this.filesPath);
} else {
System.out.println("目录为空或无访问权限");
this.max = null;
this.min = null;
}

}

        public void findMaxAndMinFile(File filesPath) {
this.findCount = 0;
this.findTime = System.currentTimeMillis();
this.traverse(filesPath);
this.findTime = System.currentTimeMillis() - this.findTime;
}

        protected void findNotZeroFile(File filesPath) {
File[] files = filesPath.listFiles();

for (int i = 0; i < files.length; i++) {
if (files[i].isDirectory()) {
try {
this.findNotZeroFile(files[i]);
} catch (NullPointerException e) {
System.out.format("无访问权限: %s%n", files[i]);
// e.printStackTrace();
}
} else {
if (files[i].length() > 0) {
this.min = files[i];
return;
}
}
}
}

        protected void traverse(File filesPath) {
File[] files = filesPath.listFiles();

for (int i = 0; i < files.length; i++) {
if (files[i].isDirectory()) {
try {
this.traverse(files[i]);
} catch (NullPointerException e) {
System.out.format("无访问权限: %s%n", files[i]);
// e.printStackTrace();
} finally {
System.out.format("已扫描: %s%n", files[i]);
}
} else {
if (files[i].length() > this.max.length())
this.max = files[i];
if (files[i].length() > 0 && files[i].length() < this.min.length())
this.min = files[i];
this.findCount++;
}
}
}

        public void setFilesPath(String filesPath) {
this.filesPath = new File(filesPath);
}

        public File getFilesPath() {
return this.filesPath;
}

        public long getFindCount() {
return this.findCount;
}

        public long getFindTime() {
return this.findTime;
}

        public File getMaxObject() {
        return this.max;
        }

        public File getMinObject() {
return this.min;
}

        public static void main(String[] args) {
TraveseDir f = new TraveseDir("D:\\upload");

f.findMaxAndMinFile(f.getFilesPath());
System.out.println();
System.out.format(Locale.CHINA, "已查找%,d项, 耗时: %,dms%n", f.getFindCount(), f.getFindTime());
System.out.format(Locale.CHINA, "最大的文件为%s, 其大小为%,d字节%n", f.getMaxObject(), f.getMaxObject().length());
System.out.format(Locale.CHINA, "最小的文件为%s, 其大小为%,d字节%n", f.getMinObject(), f.getMinObject().length());
}
}