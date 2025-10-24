package com.kutuphane.observer;

/**
 * Observer Pattern'deki Subject arayüzü.
 * Bu arayüzü uygulayan sınıflar, observer'ları yönetir ve olaylar gerçekleştiğinde onları bilgilendirir.
 */
public interface KitapTakipSubject {
    /**
     * Observer ekler
     * @param observer Eklenecek observer
     */
    void observerEkle(KitapTakipObserver observer);

    /**
     * Observer çıkarır
     * @param observer Çıkarılacak observer
     */
    void observerCikar(KitapTakipObserver observer);

    /**
     * Tüm observer'lara bildirim yapar
     */
    void observerlariHaberdar();
}