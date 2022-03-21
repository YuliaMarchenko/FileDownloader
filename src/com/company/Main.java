package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "data.csv";

        if (args.length > 0) {
            fileName = args[0];
        }

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        for (String val : args) {
            System.out.println(val);
        }

        String line;
        ArrayList<LinkAction> linkActions = new ArrayList<>();
        int i=0;
        while ((line = br.readLine()) != null) {
            i++;
            String[] values = line.split(",");
            LinkAction linkAction = new LinkAction(values[0], values[1]);
            linkActions.add(linkAction);
            System.out.println(String.format("File %d: %s; Action:%d %s", i, linkAction.getLink(), i, linkAction.getAction()));
        }
        System.out.println(linkActions.toString());
    }

}
