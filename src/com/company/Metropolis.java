package com.company;

public class Metropolis {
    public static void main(String[] args) {
        System.out.println(isMetropolis(true, 80000, 100));
        System.out.println(isMetropolis(true, 1000000, 100000000));
    }
    public static boolean isMetropolis (boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
    if ((isCapital && inhabitants > 100000) || ((inhabitants > 200000) && ((inhabitants*taxPerPersonAndMonth*12) >= 72000000 ))) {
      return true;

}
   return false;
}
}
