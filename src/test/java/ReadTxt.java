import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadTxt {
//
//    File file = new File("/home/naren/IdeaProjects/SeleniumPOC_test/TestData/listOfCities");
//    Scanner scanner = new Scanner(file);
//
//    public ReadTxt() throws FileNotFoundException {
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println("scanner");    }
//}

    public static void main(String[] args)throws java.io.IOException {
        Path path = Paths.get("/home/naren/IdeaProjects/SeleniumPOC_test/TestData/listOfCities");
        Long noOfLines = Files.lines(path).count();
        Object[] dataObj = new Object[noOfLines.intValue()];
        dataObj  = (Files.lines(path).toArray());
        for (Object element: dataObj
        ) {
            System.out.println(element);
        }
    }

    }
