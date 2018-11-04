package com.example.mutiara.aplikasimodul2kel03.ui.home;

import com.example.mutiara.aplikasimodul2kel03.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);
}

