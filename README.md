# 📚 Kütüphane Veri Tabanı ve Yönetim Sistemi

### *Veri tabanı ve web uygulaması projesi*

---

## 🚀 Proje Hakkında

Bu proje, **kütüphanelerde kullanılmak üzere** geliştirilen bir **veri tabanı yönetim sistemi**dir.
Sistemde kullanıcılar ve personeller hesap oluşturabilir, giriş yapabilir, kitapların stok durumlarını görüntüleyebilir ve **ödünç alma / iade işlemlerini** sistem üzerinden gerçekleştirebilirler.

Uygulama, **Java (Eclipse)** ortamında geliştirilmiş ve kullanıcı arayüzü için **HTML/CSS** kullanılmıştır.
Veri tabanı olarak **PostgreSQL** tercih edilmiştir.

---

## 🧩 Özellikler

* 👤 Kullanıcı ve personel hesap oluşturma / giriş sistemi
* 📖 Kitap ekleme, silme ve güncelleme işlemleri
* 🔁 Kitap ödünç alma ve iade işlemlerinin takibi
* ⏰ Gecikme ve randevu durumlarının kontrolü
* 📊 Güncel stok durumlarının görüntülenmesi
* 💾 PostgreSQL tabanlı veri kaydı ve yönetimi

---

## 🛠️ Kullanılan Teknolojiler

| Katman                | Teknoloji  |
| :-------------------- | :--------- |
| **Geliştirme Ortamı** | Eclipse    |
| **Programlama Dili**  | Java       |
| **Veri Tabanı**       | PostgreSQL |
| **Arayüz**            | HTML / CSS |

---

## 📂 Proje Yapısı

```
KutuphaneYonetimSistemi/
├── src/
│   ├── main/java/
│   │   ├── entities/         # Veri tabanı modelleri
│   │   ├── dao/              # Veritabanı işlemleri
│   │   ├── ui/               # Kullanıcı arayüzü bağlantısı
│   │   └── main/             # Ana çalıştırma dosyası
├── resources/
│   ├── templates/            # HTML sayfaları
│   └── static/               # CSS dosyaları
└── README.md
```

---

## ⚙️ Kurulum ve Çalıştırma

1. **Projeyi klonla:**

   ```bash
   git clone https://github.com/kullaniciadi/KutuphaneYonetimSistemi.git
   cd KutuphaneYonetimSistemi
   ```
2. **PostgreSQL veri tabanını oluştur ve tabloları içe aktar.**
3. **Eclipse üzerinden projeyi aç ve çalıştır.**
4. **Tarayıcıdan `http://localhost:8080` adresine git.**

---

## 👨‍💻 Geliştirici

**Batuhan Nacitarhan**
Bilgisayar Mühendisliği Öğrencisi
📧 [batuhannacitarhan@gmail.com](mailto:batuhannacitarhan@gmail.com)
🌐 [LinkedIn](https://www.linkedin.com/batuhan-nacitarhan) • [GitHub](https://github.com/BatuhanNacitarhan)

---

## 📄 Lisans

Bu proje eğitim amaçlı olarak geliştirilmiştir. İzin alınmadan ticari olarak kullanılamaz.
