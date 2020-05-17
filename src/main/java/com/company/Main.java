package com.company;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class Main {

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("src\\main\\resources\\readFile.json");
        Gson gson = new Gson();
        Staff staff = gson.fromJson(reader, Staff.class);
        System.out.println(staff);
    }
}
