package com.android.example.iuh_ad.ngoducbao.student_19487461.a19487461_ngoducbao_ad_todoapp;

public class CongViec {
    private int IdTask;
    private String NameTask;

    public CongViec(int idCV, String tenCV) {
        IdTask = idCV;
        NameTask = tenCV;
    }

    public int getIdCV() {
        return IdTask;
    }

    public void setIdCV(int idCV) {
        IdTask = idCV;
    }

    public String getTenCV() {
        return NameTask;
    }

    public void setTenCV(String tenCV) {
        NameTask = tenCV;
    }
}