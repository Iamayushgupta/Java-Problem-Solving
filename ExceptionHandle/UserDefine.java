package com.company.ExceptionHandle;

public class UserDefine {
    public static void main(String[] args) throws Exception {
        int a=5;
        try {
            if (a == 5) {
                throw new AyushException("noob");
            }
        }

        catch (AyushException e){
            System.out.println(e.getMessage());
        }
    }
}

class AyushException extends Exception{
    public AyushException(String S){
        super(S);
    }
}