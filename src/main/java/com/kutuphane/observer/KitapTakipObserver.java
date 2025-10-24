package com.kutuphane.observer;

import com.kutuphane.model.Odunc;

/**
 * Observer Pattern'deki Observer arayüzü.
 * Bu arayüzü uygulayan sınıflar, ödünç alma ve iade olaylarını takip edebilir.
 */
public interface KitapTakipObserver {
    /**
     * Bir kitap ödünç alındığında çağrılır
     * @param odunc Ödünç alma işlemi bilgileri
     */
    void kitapOduncAlindi(Odunc odunc);

    /**
     * Bir kitap iade edildiğinde çağrılır
     * @param odunc İade işlemi bilgileri
     */
    void kitapIadeEdildi(Odunc odunc);
}