package com.juaracoding;

import com.juaracoding.security.Crypto;

public class MainTest {


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

//        System.out.println(Crypto.performEncrypt("HelloForm.C12."+System.currentTimeMillis()));
        System.out.println(Crypto.performDecrypt("d9fddb00e945a1a8d010d949e622a0909dc59de586921c409a32254f1b776ae6"));
    }
}
