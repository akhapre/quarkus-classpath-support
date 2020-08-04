package org.acme;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Location of 'org/acme/Example2Resource.class : " + Thread.currentThread().getContextClassLoader().getResource("org/acme/Example2Resource.class"));
            System.out.println("Location of 'META-INF/resources/index2.html : " + Thread.currentThread().getContextClassLoader().getResource("META-INF/resources/index2.html"));
            System.out.println("Location of 'META-INF/resources/index2.html : " + Thread.currentThread().getContextClassLoader().getResource("index2.html"));
        } catch (Exception e) {

        }
    }
}
