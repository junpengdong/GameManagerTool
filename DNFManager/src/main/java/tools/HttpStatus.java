package tools;

/**
 * Created by Administrator on 2017/2/21.
 */
public enum HttpStatus {

    SUCCESS("00200"),   //成功
    ERROR("00500");

    private String value;


    HttpStatus(String value){

        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc(){
        return name();
    }
}
