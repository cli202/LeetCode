package main.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class IPToCIDR {
    int eight = 10000000;
    public List<String> ipToCIDR(String ip, int n) {
        List<String> result = new ArrayList<>();
        long startingAddress = 0;
        String[] split = ip.split(".");
        for (String each: split) {
            String binary = Integer.toBinaryString(Integer.valueOf(each));
            startingAddress = startingAddress * eight + Long.valueOf(binary);
        }
        Queue<Integer> q = new LinkedList<>();
        while (n>=0) {
            int zeros = Long.numberOfTrailingZeros(startingAddress);
            if (n - Math.pow(zeros, 2) < 0) {
                // convert starting address into ip
                String CIDRAddress = toIP(startingAddress, zeros);
                result.add(CIDRAddress);
                n -= Math.pow(zeros, 2);
            } else {
                while (n - Math.pow(zeros, 2) < 0) {
                    zeros--;
                }
                String CIDRAddress = toIP(startingAddress, zeros);
                result.add(CIDRAddress);
                n -= Math.pow(zeros, 2);
            }


        }
        return result;
    }


    public String toIP(long address, int zeros) {
        StringBuilder result = new StringBuilder();
        for (int i = 3; i >= 0; i--) {
            int binary = (int) (address % (Math.pow(eight, i)));
            int nonBinary = Integer.parseInt(Integer.toString(binary), 2);
            result.insert(0, ".");
            result.insert(0, nonBinary);
            address /= eight;
        }
        String shift = "/" + (32 - zeros);
        result.append(shift);
        return result.toString().substring(1);
    }
}
