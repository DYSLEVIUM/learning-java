package org.io;

// input using BufferedReader Class

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderIO {
    public static void main(String[] args) throws IOException {
        // Creating BufferedReader Object
        // InputStreamReader converts bytes to
        // stream of character
//    java.io.BufferedReader bfn = new java.io.BufferedReader(
//        new InputStreamReader(System.in)
//    );

        BufferedReader bfn = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.print("Enter String: ");
        // String reading internally
        String str = bfn.readLine();

        System.out.print("Enter Integer: ");
        // Integer reading internally
        int it = Integer.parseInt(bfn.readLine());

        System.out.println("Entered String : " + str);
        System.out.println("Entered Integer : " + it);
    }
}
