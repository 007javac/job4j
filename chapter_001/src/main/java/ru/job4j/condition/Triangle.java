package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        if (ab+ac>bc && ac+bc>ab && ab+bc>ac) {
            return true;       // Или же return ab+ac>bc && ac+bc>ab && ab+bc>ac;
        } else{
            return false;
        }
    }
}