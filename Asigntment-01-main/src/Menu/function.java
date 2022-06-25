package Menu;

import Information.Brand;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Menu.file;

public class function {
    public static ArrayList<Brand> brandList = new ArrayList();

    public static void loadData() {
        String data = file.readFile("src\\input.txt");
        String dataArray[];

        dataArray = data.split("\n\n");
        for (int i = 0; i < dataArray.length; i++) {
            String Linedata[] = dataArray[i].split(",");
            String price[] = Linedata[2].split(":");
            Brand brandData = new Brand(Linedata[0], Linedata[1], price[0], Double.parseDouble(price[1]));
            brandList.add(brandData);
        }

    }

  
}

    // public int searchId(String bId) {
        // file searchId = new file();
    // }
// }
