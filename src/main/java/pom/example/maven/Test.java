package pom.example.maven;

import org.apache.commons.lang3.StringUtils;

public class Test {
    public static void main(String[] args) {

        String x = "this is a test by nish bro";
        String this_is_a_test = StringUtils.capitalize(x);
        System.out.println(x);
        System.out.println(this_is_a_test);
    }
}
