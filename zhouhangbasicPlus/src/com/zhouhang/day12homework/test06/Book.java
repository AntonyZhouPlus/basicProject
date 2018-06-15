package com.zhouhang.day12homework.test06;

/**
 * com.zhouhang.day12homework.test06
 *
 * @author zhouhang
 * @date 2018/6/14 下午8:38
 */
public class Book {
    private String name;
    private String publishingCompany;

    public Book(String name, String publishingCompany) {
        this.name = name;
        this.publishingCompany = publishingCompany;
    }

    private String bookMsg(String bookname) {
        return "<"+bookname+">";
    }

    private String publishingMsg(String msg) {
        return "【专柜正品<" + msg + ">原装绝版】";
    }

    public String packSaleMsg(String msg, StringWrapper wrapper) {
        return wrapper.wrap(msg);
    }

    public void sale() {
        String saleMsg = packSaleMsg(name,this::bookMsg)+packSaleMsg(publishingCompany,this::publishingMsg);
        System.out.println(saleMsg);
        System.out.println("2元一本，欲练此功，必先购买！");
    }


}
