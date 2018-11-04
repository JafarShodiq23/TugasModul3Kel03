package com.example.mutiara.aplikasimodul2kel03.ui.detailCar;

import com.example.mutiara.aplikasimodul2kel03.data.model.DataCar;

import java.util.List;

public interface DetailView {
    String getName();

    String getMerk();

    String getModel();

    String getYear();
    void showError(String message);
    void showSuccess(List<DataCar> car);

    void successUpdate();

    void failedUpdate();
}
