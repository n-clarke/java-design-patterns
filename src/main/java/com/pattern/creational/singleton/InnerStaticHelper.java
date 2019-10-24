package com.pattern.creational.singleton;

//Bill Pugh Inner static Helper Method
public class InnerStaticHelper {
    private InnerStaticHelper(){}

    private static class Helper{
        private static final InnerStaticHelper INSTANCE = new InnerStaticHelper();
    }

    public static InnerStaticHelper getInstance(){
        return Helper.INSTANCE;
    }
}
