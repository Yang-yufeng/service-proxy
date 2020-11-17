package com.yufeng.sp;

/**
 * @Description
 * @Author yangwu
 * CreateTime        202011180022
 */
public class Userinfo {

    private String name;
    private String password;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }



    public static void main(String[] args) throws Exception {
        @SuppressWarnings("unchecked")
        Class<Userinfo> c = (Class<Userinfo>) Class.forName("com.yufeng.sp."+"Userinfo");
        System.out.println(c);
    }



}

