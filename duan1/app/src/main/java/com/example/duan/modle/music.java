package com.example.duan.modle;

public class music {

    int imagesong;
    String namesong;
    String tacgia;
    int file;

    public music(int imagesong, String namesong, String tacgia,int file) {
        this.imagesong = imagesong;
        this.namesong = namesong;
        this.tacgia = tacgia;
        this.file = file;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getImagesong() {
        return imagesong;
    }

    public void setImagesong(int imagesong) {
        this.imagesong = imagesong;
    }

    public String getNamesong() {
        return namesong;
    }

    public void setNamesong(String namesong) {
        this.namesong = namesong;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }
}
