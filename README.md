Yapımcı: https://github.com/poyrazinan
  Discord: geik
Düzenleyen: Ben (Eklentide hoşuma gitmeyen kısımlar bulunuyordu. Kendime göre düzenledim, diğer insanların da işine yarayabileceğinden paylaşıyorum.)
  Discord: erisos

> `1.20+`


# Tuccar

Tüccar bir oyun içi oyuncu marketi eklentisidir. 

## Nasıl çalışıyor?

Görevli bir NPC ile çalışan bu eklenti oyuncuların kendi eşyalarını diğer oyunculara satması şeklinde çalışır. İtemleri otomatik olarak kategorize edip bulunması kolay olayacak şekilde listeleyen bu oyuncu market eklentisi aynı kategoride olan eşyaları fiyata göre akıllı listeleme özelliğine de sahip. Oyuncuların online olmaması durumunu göz önünde bulundurarak satılan eşyaları veya alınan eşyaları kendi envanterinde saklayarak oyunculara istediği zaman marketten geri çekmesine olanak sağlar.

##Dil Dosyası - Lang File

<details>
    <summary>lang.yml</summary>
    
        TuccarGui: '&8Tüccar'
        CategoryGui: '&8Tüccar &0/'
        itemGui: '&8Ürünler &0/'
        confirmationGui: '&aOnaylama'
        selfProducts: '&6Ürünlerim'
        Messages:
        productSold: ' &6Tüccar &8▸ &2{product}x{amount} &asatıldı. &2+{price}'
        listItem: ' &6Tüccar &8▸ &7Ürün başarıyla listelendi!'
        dontHavePerm: ' &6Tüccar &8▸ &cBunun için yetkin yok!'
        inputMustInteger: '&6Tüccar &8▸ &cFiyat sayı olmalıdır!'
        notEnoughItem: ' &6Tüccar &8▸ &cYeterli sayıda ürün bulunamadı!'
        couldntFindStock: ' &6Tüccar &8▸ &cStok bulunamadı!'
        notInAllowedWorld: ' &6Tüccar &8▸ &cBunun için doğru dünyada değilsin!'
        priceLow: ' &6Tüccar &8▸ &cFiyat &4{min} &cdan düşük olamaz!'
        rePrice: ' &6Tüccar &8▸ &aÜrünün fiyatını güncellemek için sohbete fiyatı 10 saniye içinde yaz.'
        rePriceSuccess: ' &6Tüccar &8▸ &aYeniden fiyat ayarlaması tamamlandı.'
        cannotBuyOwnItem: ' &6Tüccar &8▸ &cKendi ürününü satın alamazsın!'
        couldntFindItem: ' &6Tüccar &8▸ &cBöyle bir ürün bulunamadı!'
        setNpcSuccess: ' &6Tüccar &8▸ &aTüccar NPCsi &2başarıyla &akondu.'
        reload: ' &6Tüccar &8▸ &aYenileme işlemi &2başarıyla &agerçekleştirildi.'
        help:
        - ''
        - '&6 TÜCCAR SİSTEMİ:'
        - ''
        - '&6 /tüccar ekle &d[Birim Fiyatı] <Stok Sayısı/El/Hepsi> &8▸ &7Tüccara ürün kayıt eder.'
        - '&6 /tüccar stokekle &d<Stok Sayısı/El/Hepsi> &8▸ &7Tüccara stok ekler.'
        - '&6 /tüccar ürünlerim &8▸ &7Tüccardaki ürünlerini gösterir.'
        - ''
        - '&7 Tüccar menüsünden ürünlerini &Ciptal edip&7/&adüzenleyebilirsin.'
        - '&d<değer> &8▸ &7Opsiyonel &8(zorunlu olmayan) &7verilerdir.'
        - '&d[değer] &8▸ &cZorunlu &7girilmesi gereken verilerdir.'
        Titles:
        processCancelled:
            title: '&4Onay'
            subTitle: '&cOnay verilmedi!'
        processSuccess:
            title: '&2Onay'
            subTitle: '&aOnay alındı!'
        errorConfirmation:
            title: '&4Hata'
            subTitle: '&cSatın alınamadı.'
        notEnoughSpace:
            title: '&4Hata'
            subTitle: '&cEnvanter dolu.'
        notEnoughMoney:
            title: '&4Hata'
            subTitle: '&cYeterli para yok.'
        Gui:
        myProducts:
            slot: 19
            material: CHEST
            name: '&6Ürünlerim'
            lore:
            - ''
            - '&8▪ &7Buradan daha önce tüccara'
            - '&7eklemiş olduğun ürünleri görebilirsin.'
        itemCategoryTemplate:
        - ''
        - '&8▪ &7Satıcı Sayısı: &e{seller_amount}'
        - '&8▪ &7Minimum Fiyat: &e{min_price}'
        - ''
        cancelTemplate:
        - ''
        - ' &8▪ &7Kategori: &a{category}'
        - ' &8▪ &7Adet: &a{amount}'
        - ' &8▪ &7Satıcı: &c{seller}'
        - ' &8▪ &7Fiyat: &6{price}'
        - ''
        filter:
            material: HOPPER
            name: '&6Filtreleyici'
            lore:
            - ''
            - '&8▪ &7Satışı olmayan ürünleri filtreler.'
            - '&8▪ &7Mevcut durum: &a{filter_status}'
        empty:
            material: BARRIER
            name: '&4Sekme Boş'
            lore:
            - ''
            - '&7▪ Bu menü boş görünüyor!'
        nextPage:
            material: ARROW
            name: '&eSonraki Sayfa'
            lore:
            - ''
            - '&8▪ &7Sonraki sayfaya geç!'
        previousPage:
            material: ARROW
            name: '&eÖnceki Sayfa'
            lore:
            - ''
            - '&8▪ &7Önceki sayfaya dön!'
        backToMenu:
            material: ARROW
            name: '&cGeri Dön'
            lore:
            - ''
            - '&8▪ &7Önceki menüye dön!'
        help:
            slot: 10
            material: BOOK
            name: '&6Bilgi'
            lore:
            - ''
            - '&8▪ &7Tüccar eşyalarını satışa çıkarır'
            - '&7Ve buradan yaptığın satışlar ile'
            - '&7Para kazanabilirsin!'
        selfProductHelp:
            slot: 45
            material: BOOK
            name: '&6Bilgi'
            lore:
            - ''
            - '&8▪ &7Burada kendi sattığın ürünleri'
            - '&7Görebilirsin ve onları iptal edebilirsin.'
        selfProductTemplate:
            lore:
            - ''
            - ' &8▪ &7Stok: &a{stock}'
            - ' &8▪ &7Fiyat: &a{price}'
            - ' &8▪ &7Kategori: &a{category}'
            - ''
            - '&e1 Adet iptal etmek için &6[Sol Tık]'
        #    - "&e{custom_amount} Adet iptal etmek için &6[Shift + Sol Tık]"
            - '&e1 Stack iptal etmek için &6[Sağ Tık]'
            - '&eHepsini iptal etmek için &6[Shift + Sağ Tık]'
            - '&eFiyatı güncellemek için &6[Orta Tık]'
        itemTemplate:
            lore:
            - ''
            - ' &8▪ &7Satıcı: &a{seller}'
            - ' &8▪ &7Stok: &a{stock}'
            - ' &8▪ &7Fiyat: &a{price}'
            - ''
            - '&e1 Adet satın almak için &6[Sol Tık]'
        #    - "&e{custom_amount} Adet satın almak için &6[Shift + Sol Tık]"
            - '&e1 Stack satın almak için &6[Sağ Tık]'
            - '&eEnvanterini doldurmak için &6[Shift + Sağ Tık]'
</details>

## Komutlar
+ **/tüccar** - Tüccar menüsünü açar
+ **/tüccar belirle** - Tüccar NPC'sini belirler (Citizens NPC'sine bakmak gerekir)
+ **/tüccar ekle** - Tüccar'a ürün ekler
+ **/tüccar stokekle** - Mevcut ürüne stok ekler
+ **/tüccar ürünlerim** - Oyuncunun tüccarda listelediği ürünleri listeler.
+ **/tüccar reload** - Config ve dil dosyasını yeniden yükler.




## Kullanılan Kütüphaneler

* [spigot-api (1.20-R1.3-SNAPSHOT)](https://hub.spigotmc.org/stash/projects/SPIGOT/repos/spigot/browse)
* [lombok (LATEST)](https://github.com/projectlombok/lombok)
* [BStats](https://bstats.org)
* [Vault](https://www.spigotmc.org/resources/vault.34315/)
* [JSON](https://mvnrepository.com/artifact/org.json/json)
* [Citizens](https://wiki.citizensnpcs.co/API)
