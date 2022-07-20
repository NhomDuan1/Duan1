package com.example.duan.modle;

public class playlist {
    int imgplayplist;
    String nameplaylist;

    public playlist(int imgplayplist, String nameplaylist) {
        this.imgplayplist = imgplayplist;
        this.nameplaylist = nameplaylist;
    }

    public int getImgplayplist() {
        return imgplayplist;
    }

    public void setImgplayplist(int imgplayplist) {
        this.imgplayplist = imgplayplist;
    }

    public String getNameplaylist() {
        return nameplaylist;
    }

    public void setNameplaylist(String nameplaylist) {
        this.nameplaylist = nameplaylist;
    }
}
