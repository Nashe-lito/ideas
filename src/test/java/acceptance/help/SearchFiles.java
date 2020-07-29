package acceptance.help;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFiles {
  public static void main(String[] args) {
    ArrayList<File> fileList = new ArrayList<>();
    searchFile(new File("D:\\"), fileList);
    for (File file: fileList) {
      System.out.println(file.getAbsolutePath());
    }
  }

  public static void searchFile(File rootFile, List<File> fileList) {
    if (rootFile.isDirectory()) {
      System.out.println("searchin at:" + rootFile.getAbsolutePath());
      File[] directoryFiles = rootFile.listFiles();
      if (directoryFiles != null) {
        for (File file : directoryFiles) {
          if (file.isDirectory()) {
            searchFile(file, fileList);
          } else {
            if (file.getName().toLowerCase().endsWith(".jpg")) {
              fileList.add(file);
            }
          }
        }
      }
    }
  }
}
