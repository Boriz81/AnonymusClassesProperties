package example3;

interface Callback {
    void calculated(int result);

    void failed(String errorMsg);


    //default void print(String result) {
    //    System.out.println(result);
    //}

}
