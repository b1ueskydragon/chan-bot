package jp.keys;


public enum Keys_sample {

    CONSUMERKEY(""),
    CONSUMERSECRET(""),
    ACCESSTOKEN(""),
    ACCESSTOKENSECRET(""),

    ME(""), // 自分の ID (@を除く)

    TENKEY(""),

    INAGON_PIC("絶対パス/Twitter4j-chanBot/src/jp/pic/inagon-twitter.png");

    private String value;
    Keys_sample(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return  value;
    }

}
