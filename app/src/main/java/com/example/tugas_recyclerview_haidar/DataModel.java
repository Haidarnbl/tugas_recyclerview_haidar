package com.example.tugas_recyclerview_haidar;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class DataModel implements Parcelable {

    private Integer image;
    private String nama;
    private String deskripsi;

//    public DataModel(Integer image, String nama, String deskripsi) {
//        this.image = image;
//        this.nama = nama;
//        this.deskripsi = deskripsi;
//    }

    public DataModel() {

    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Integer getImage() {
        return image;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    protected DataModel(Parcel in) {
        if (in.readByte() == 0) {
            image = null;
        } else {
            image = in.readInt();
        }
        nama = in.readString();
        deskripsi = in.readString();
    }

    public static final Creator<DataModel> CREATOR = new Creator<DataModel>() {
        @Override
        public DataModel createFromParcel(Parcel in) {
            return new DataModel(in);
        }

        @Override
        public DataModel[] newArray(int size) {
            return new DataModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        if (image == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(image);
        }
        parcel.writeString(nama);
        parcel.writeString(deskripsi);
    }
}
