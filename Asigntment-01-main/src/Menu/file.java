/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author admin
 */
public class file {

    public file() {

    }

    public static String readFile(String fileName) {
        StringBuilder contentBuilder = new StringBuilder();
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(fileName))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    public static void writeFile(String fileName, String content) {
        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(fileName))) {
            bw.write(content);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
