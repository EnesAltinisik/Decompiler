# Decompiler
APK dosyalarının java ve smali kodlarını decompile etme ve decompile edilen kodları degistirip tekrardan compile etme aracı.

Gereklilikler

  Java JDK ve linux platform dısında gereklilik yoktur.
  
 Kurulum
 
  Herhangi bir kurulumu yoktur. Decompiler.tar.gz dosyasını indirip içindeki Decompiler.jar dosyasına çift tıklandığında kurulumu otomatik yapar ve program açılır.
 
 Kullanım
 
 Program çalıstırlıdığında çıkan ekranda File sekmesine tıklanırsa gelen ekrandan
 ![file](https://github.com/EnesAltinisik/Decompiler/blob/master/foto/file.png?raw=true)

	Open apk seçeneği ile bilgisyarda mevcut herhangi bir apk açılabilir.
  
	Open exist şeceneği ile daha önce açıp daha sonra kaydettiğiniz dosyaları açabilirsiniz.

	Save proje seçeneği açık olan projeyi kaydeter.

	Export proje seçeneği açık projenin smali tablarını kaydeder ve bu halini apk dosyasına 

	dönüstürüp resource/outApk altına kaydeder.

	Export and deploy seçeneği açık olan projeyi export edip olusan apkyı imzalar ve bilgisayardaki 

	açık emulatöre yükler eğer apk emülatorde yüklüyse öncekini kaldırır

	yeni dosyayı ekler.
  
Find sekmesi altında
![find](https://github.com/EnesAltinisik/Decompiler/blob/master/foto/find.png?raw=true)

	Find in proje seçeneği ile tüm projede arama yapılabilir ve sonuçlar ekranın altında çıkar 

	Ekranın altındaki Find buttonu ile sonuçlar gizlenip açılabilir.

	Find in file seçeneği ile o anda açık tüm tablarda arama yapıla bilir.
  
Smali sekmesi altında smaliye açılarak çıkan ekranda
![smali](https://github.com/EnesAltinisik/Decompiler/blob/master/foto/smali.png?raw=true)

	ComboBox kullanılarak metodun static olup olmayacağı belirtilir. Daha sonra return tipi, metod ismi, 

	parametreler ve kod yazılıp create smali butonuna tıklandığında smali kodu olusturulur. 

	Kodun altındaki Copy buttonuyla kod kopyalanabilir.
  
 Exit sekmesi ile daha önce çalısılıp kaydedilmemis tüm dosyalar silinir ve program kapatılır.
