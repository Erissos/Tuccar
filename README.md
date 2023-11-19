Yapımcı: https://github.com/poyrazinan
  Discord: geik
Düzenleyen: Ben (Eklentide hoşuma gitmeyen kısımlar bulunuyordu. Kendime göre düzenledim, diğer insanların da işine yarayabileceğinden paylaşıyorum.)
  Discord: erisos

> `1.20+`


# Tuccar

Tüccar bir oyun içi oyuncu marketi eklentisidir. 

## Nasıl çalışıyor?

Görevli bir NPC ile çalışan bu eklenti oyuncuların kendi eşyalarını diğer oyunculara satması şeklinde çalışır. İtemleri otomatik olarak kategorize edip bulunması kolay olayacak şekilde listeleyen bu oyuncu market eklentisi aynı kategoride olan eşyaları fiyata göre akıllı listeleme özelliğine de sahip. Oyuncuların online olmaması durumunu göz önünde bulundurarak satılan eşyaları veya alınan eşyaları kendi envanterinde saklayarak oyunculara istediği zaman marketten geri çekmesine olanak sağlar.

## Config ve Dil dosyası
<details>
  <summary>config.yml</summary>
    Settings:
  # SHIFT + SOL tık ile alınacak adet sayısıdır.
  customBuyAmount: 32
  # Minimum listelenecek satış fiyatı
  minimumPrice: 1
  # Tüccar komut ile açılabilsin mi? /tüccar
  openTuccarViaCmd: false
  # Kategori seçme menüsünün büyüklüğünü belirler
  categorySize: 36
  # Orta tuş ile fiyat güncelleme ayarı.
  middleClickRePrice: true
  # Tüccarın kullanılabileceği dünyaları belirler.
  world:
    # Dünya beyaz listesi aktif edilsin mi?
    worldWhitelist: true
    # Dünya beyaz listesi aktifse hangi dünyalarda çalışsın.
    allowedWorlds:
    - world
Tax:
  # Alınan vergi bir hesaba yatırılsın mı?
  depositAccount: false
  # Vergi bir hesaba yatırılıyorsa hangi hesap?
  account: Geyik
  # Vergi oranı % kaçtır? 0 yazarak devre dışı bırakabilirsiniz.
  taxRate: 0

# Ana tüccar bloğudur. Blok ile başlayan kısım kategoridir.
# Özel kategori oluşturmak için onun gibi yeni bir isim yazabilirsiniz.
# Aşağıda belirli bilgiler mevcuttur:

# KATEGORİLER #
# displayName: Kategorinin görünen adıdır. (Zorunlu)
# displayLore: Kategorinin görünen açıklamasıdır. (Zorunlu)
# slot: Kategorinin olması gereken slotudur. (Zorunlu)
# material: Kategorinin materyalidir. (Zorunlu)
#
# ÜRÜNLER #
# displayName: Eşyanın tüccar guisi üzerinde gözükeceği isim (silinebilir)
# displayLore: Eşyanın tüccar guisi üzerinde gözükecek açıklaması (silinebilir)
# itemName: Eşyanın listelenebilmesi için gerekli olan ismidir. Örneğin: itemName: "&6Uçuş Kağıdı" (silinebilir)
# damage: Eşyanın hasarıdır. 1.8 ve 1.12 arasında geçerlidir. (silinebilir.)
# material: Eşyanın materyalidir. (Zorunlu)
# enchantment: Eşyanın tüccara konması için gerekli enchantlardır. Örnek: (silinebilir)
# enchantment:
# - "DAMAGE_ALL:5"
Tuccar:
  Blok:
    slot: 12
    displayName: '&6Bloklar'
    material: GRASS_BLOCK
    displayLore:
    - ''
    - ' &8▪ &7Bu kategoride, ihtiyacın'
    - ' &7olan &eblokları &7inceleyebilir'
    - ' &7ve satın alabilirsin.'
    - ''
    - ' &8▸ &aTıkla ve alışverişe başla!'
    items:
      Buz:
        material: ICE
        displayName: '&eBuz'
      PaketBuz:
        material: PACKED_ICE
        displayName: '&ePaketlenmiş Buz'
      YosunTas:
        material: MOSSY_COBBLESTONE
        displayName: '&eYosunlu Taş'
      Tugla:
        material: BRICKS
        displayName: '&eTuğla'
      Kitaplik:
        material: BOOKSHELF
        displayName: '&eKitaplık'
      MeseTahta:
        material: OAK_PLANKS
        displayName: '&eMeşe Tahtası'
      LadinTahta:
        material: SPRUCE_PLANKS
        displayName: '&eLadin Tahtası'
      HusTahta:
        material: BIRCH_PLANKS
        displayName: '&eHuş Tahtası'
      OrmanTahta:
        material: JUNGLE_PLANKS
        displayName: '&eOrman Tahtası'
      AkasyaTahta:
        material: ACACIA_PLANKS
        displayName: '&eAkasya Tahtası'
      KMeseTahta:
        material: DARK_OAK_PLANKS
        displayName: '&eKoyu Meşe Tahtası'
      MeseKutuk:
        material: OAK_LOG
        displayName: '&eMeşe Kütüğü'
      LadinKutuk:
        material: SPRUCE_LOG
        displayName: '&eLadin Kütüğü'
      HusKutuk:
        material: BIRCH_LOG
        displayName: '&eHuş Kütüğü'
      OrmanKutuk:
        material: JUNGLE_LOG
        displayName: '&eOrman Kütüğü'
      AkasyaKutuk:
        material: ACACIA_LOG
        displayName: '&eAkasya Kütüğü'
      KMeseKutuk:
        material: DARK_OAK_LOG
        displayName: '&eKoyu Meşe Kütüğü'
      MeseOdun:
        material: OAK_WOOD
        displayName: '&eMeşe Odunu'
      LadinOdun:
        material: SPRUCE_WOOD
        displayName: '&eLadin Odunu'
      HusOdun:
        material: BIRCH_WOOD
        displayName: '&eHuş Odunu'
      OrmanOdun:
        material: JUNGLE_WOOD
        displayName: '&eOrman Odunu'
      AkasyaOdun:
        material: ACACIA_WOOD
        displayName: '&eAkasya Odunu'
      KMeseOdun:
        material: DARK_OAK_WOOD
        displayName: '&eKoyu Meşe Odunu'
      Sunger:
        material: SPONGE
        displayName: '&eSünger'
      Prizmarin:
        material: PRISMARINE
        displayName: '&ePrizmarin'
      PrizmarinT:
        material: PRISMARINE_BRICKS
        displayName: '&ePrizmarin Tuğlası'
      KPrizmarin:
        material: DARK_PRISMARINE
        displayName: '&eKoyu Prizmarin'
      KomurBlok:
        material: COAL_BLOCK
        displayName: '&eKömür Bloğu'
      Obsidyen:
        material: OBSIDIAN
        displayName: '&eObsidyen'
      Balkabagi:
        material: PUMPKIN
        displayName: '&eBalkabagi'
      LapisBlok:
        material: LAPIS_BLOCK
        displayName: '&eLapis Blok'
      DenizFeneri:
        material: SEA_LANTERN
        displayName: '&eDeniz Feneri'
      IsikTasi:
        material: GLOWSTONE
        displayName: '&eIşıktaşı'
      RuhKumu:
        material: SOUL_SAND
        displayName: '&eRuh Kumu'
      KarBlok:
        material: SNOW_BLOCK
        displayName: '&eKar'
      Kuvars1:
        material: QUARTZ_BLOCK
        displayName: '&eKuvars Bloğu'
      Kuvars2:
        material: SMOOTH_QUARTZ
        displayName: '&eDüzgün Kuvars Bloğu'
      Kuvars3:
        material: CHISELED_QUARTZ_BLOCK
        displayName: '&eOyma Kuvars Bloğu'
      Kuvars4:
        material: QUARTZ_BRICKS
        displayName: '&eKuvars Tuğlası'
      Kuvars5:
        material: QUARTZ_PILLAR
        displayName: '&eKuvars Sütun'
      MagmaBlok:
        material: MAGMA_BLOCK
        displayName: '&eMagma Bloğu'
      NetherTugla:
        material: NETHER_BRICKS
        displayName: '&eNether Tuğlası'
      KNetherTugla:
        material: RED_NETHER_BRICKS
        displayName: '&eKırmızı Nether Tuğlası'
      Netherrack:
        material: NETHERRACK
        displayName: '&eNetherrack'
      TasTugla:
        material: STONE_BRICKS
        displayName: '&eTaş Tuğla'
      Miselyum:
        material: MYCELIUM
        displayName: '&eMiselyum'
      Toprak:
        material: DIRT
        displayName: '&eToprak'
      Kiriktas:
        material: COBBLESTONE
        displayName: '&eKırıktaş'
      Kum:
        material: SAND
        displayName: '&eKum'
      Kumtasi:
        material: SANDSTONE
        displayName: '&eKumtaşı'
      Kerpic:
        material: PACKED_MUD
        displayName: '&eKerpiç'
      Endtasi:
        material: END_STONE
        displayName: '&eEnd Taşı'
      Kil:
        material: CLAY
        displayName: '&eKil'
      SertKil:
        material: TERRACOTTA
        displayName: '&eSertleştirilmiş Kil'
      Kil1:
        material: WHITE_TERRACOTTA
        displayName: '&eBeyaz Kil'
      Kil2:
        material: ORANGE_TERRACOTTA
        displayName: '&eTuruncu Kil'
      Kil3:
        material: MAGENTA_TERRACOTTA
        displayName: '&eEflatun Kil'
      Kil4:
        material: LIGHT_BLUE_TERRACOTTA
        displayName: '&eAçık Mavi Kil'
      Kil5:
        material: YELLOW_TERRACOTTA
        displayName: '&eSarı Kil'
      Kil6:
        material: LIME_TERRACOTTA
        displayName: '&eAçık Yeşil Kil'
      Kil7:
        material: PINK_TERRACOTTA
        displayName: '&ePembe Kil'
      Kil8:
        material: GRAY_TERRACOTTA
        displayName: '&eGri Kil'
      Kil9:
        material: LIGHT_GRAY_TERRACOTTA
        displayName: '&eAçık Gri Kil'
      Kil10:
        material: CYAN_TERRACOTTA
        displayName: '&eCamgöbeği Kil'
      Kil11:
        material: PURPLE_TERRACOTTA
        displayName: '&eMor Kil'
      Kil12:
        material: BLUE_TERRACOTTA
        displayName: '&eMavi Kil'
      Kil13:
        material: BROWN_TERRACOTTA
        displayName: '&eKahverengi Kil'
      Kil14:
        material: GREEN_TERRACOTTA
        displayName: '&eYeşil Kil'
      Kil15:
        material: RED_TERRACOTTA
        displayName: '&eKırmızı Kil'
      Kil16:
        material: BLACK_TERRACOTTA
        displayName: '&eSiyah Kil'
      Yün1:
        material: WHITE_WOOL
        displayName: '&eBeyaz Yün'
      Yün2:
        material: ORANGE_WOOL
        displayName: '&eTuruncu Yün'
      Yün3:
        material: MAGENTA_WOOL
        displayName: '&eEflatun Yün'
      Yün4:
        material: LIGHT_BLUE_WOOL
        displayName: '&eAçık Mavi Yün'
      Yün5:
        material: YELLOW_WOOL
        displayName: '&eSarı Yün'
      Yün6:
        material: LIME_WOOL
        displayName: '&eAçık Yeşil Yün'
      Yün7:
        material: PINK_WOOL
        displayName: '&ePembe Yün'
      Yün8:
        material: GRAY_WOOL
        displayName: '&eGri Yün'
      Yün9:
        material: LIGHT_GRAY_WOOL
        displayName: '&eAçık Gri Yün'
      Yün10:
        material: CYAN_WOOL
        displayName: '&eCamgöbeği Yün'
      Yün11:
        material: PURPLE_WOOL
        displayName: '&eMor Yün'
      Yün12:
        material: BLUE_WOOL
        displayName: '&eMavi Yün'
      Yün13:
        material: BROWN_WOOL
        displayName: '&eKahverengi Yün'
      Yün14:
        material: GREEN_WOOL
        displayName: '&eYeşil Yün'
      Yün15:
        material: RED_WOOL
        displayName: '&eKırmızı Yün'
      Yün16:
        material: BLACK_WOOL
        displayName: '&eSiyah Yün'
      Cam:
        material: GLASS
        displayName: '&eCam'
      Cam1:
        material: WHITE_STAINED_GLASS
        displayName: '&eBeyaz Cam'
      Cam2:
        material: ORANGE_STAINED_GLASS
        displayName: '&eTuruncu Cam'
      Cam3:
        material: MAGENTA_STAINED_GLASS
        displayName: '&eEflatun Cam'
      Cam4:
        material: LIGHT_BLUE_STAINED_GLASS
        displayName: '&eAçık Mavi Cam'
      Cam5:
        material: YELLOW_STAINED_GLASS
        displayName: '&eSarı Cam'
      Cam6:
        material: LIME_STAINED_GLASS
        displayName: '&eAçık Yeşil Cam'
      Cam7:
        material: PINK_STAINED_GLASS
        displayName: '&ePembe Cam'
      Cam8:
        material: GRAY_STAINED_GLASS
        displayName: '&eGri Cam'
      Cam9:
        material: LIGHT_GRAY_STAINED_GLASS
        displayName: '&eAçık Gri Cam'
      Cam10:
        material: CYAN_STAINED_GLASS
        displayName: '&eCamgöbeği Cam'
      Cam11:
        material: PURPLE_STAINED_GLASS
        displayName: '&eMor Cam'
      Cam12:
        material: BLUE_STAINED_GLASS
        displayName: '&eMavi Cam'
      Cam13:
        material: BROWN_STAINED_GLASS
        displayName: '&eKahverengi Cam'
      Cam14:
        material: GREEN_STAINED_GLASS
        displayName: '&eYeşil Cam'
      Cam15:
        material: RED_STAINED_GLASS
        displayName: '&eKırmızı Cam'
      Cam16:
        material: BLACK_STAINED_GLASS
        displayName: '&eSiyah Cam'
  Dekor:
    slot: 13
    displayName: '&6Dekorasyon'
    material: BLACK_BANNER
    displayLore:
    - ''
    - ' &8▪ &7Bu kategoride, ihtiyacın'
    - ' &7olan &edekorasyon ürünlerini'
    - ' &7inceleyebilir ve satın'
    - ' &7alabilirsin.'
    - ''
    - ' &8▸ &aTıkla ve alışverişe başla!'
    items:
      EndCubuk:
        material: END_ROD
        displayName: '&eEnd Çubuğu'
      Can:
        material: BELL
        displayName: '&eÇan'
      Fener:
        material: LANTERN
        displayName: '&eFener'
      KampAteşi:
        material: CAMPFIRE
        displayName: '&eKamp Ateşi'
      MeseCiti:
        material: OAK_FENCE
        displayName: '&eMeşe Çiti'
      LadinCiti:
        material: SPRUCE_FENCE
        displayName: '&eLadin Çiti'
      HusCiti:
        material: BIRCH_FENCE
        displayName: '&eHuş Çiti'
      OrmanCiti:
        material: JUNGLE_FENCE
        displayName: '&eOrman Çiti'
      AkasyaCiti:
        material: ACACIA_FENCE
        displayName: '&eAkasya Çiti'
      KMeseCiti:
        material: DARK_OAK_FENCE
        displayName: '&eKoyu Meşe Çiti'
      KiriktaşD:
        material: COBBLESTONE_WALL
        displayName: '&eKırıktaş Duvar'
      YKiriktaşD:
        material: MOSSY_COBBLESTONE_WALL
        displayName: '&eYosunlu Kırıktaş Duvar'
      DemirCit:
        material: IRON_BARS
        displayName: '&eDemir Parmaklık'
      MeseCitK:
        material: OAK_FENCE_GATE
        displayName: '&eMeşe Çit Kapısı'
      LadinCitK:
        material: SPRUCE_FENCE_GATE
        displayName: '&eLadin Çit Kapısı'
      HusCitK:
        material: BIRCH_FENCE_GATE
        displayName: '&eHuş Çit Kapısı'
      OrmanCitK:
        material: JUNGLE_FENCE_GATE
        displayName: '&eOrman Çit Kapısı'
      AkasyaCitK:
        material: ACACIA_FENCE_GATE
        displayName: '&eAkasya Çit Kapısı'
      KMeseCitK:
        material: DARK_OAK_FENCE_GATE
        displayName: '&eKoyu Meşe Çit Kapısı'
      Saksi:
        material: FLOWER_POT
        displayName: '&eSaksı'
      ZirhAskisi:
        material: ARMOR_STAND
        displayName: '&eZırh Askısı'
      Tablo:
        material: PAINTING
        displayName: '&eTablo'
      Flama1:
        material: WHITE_BANNER
        displayName: '&eBeyaz Flama'
      Flama2:
        material: ORANGE_BANNER
        displayName: '&eTuruncu Flama'
      Flama3:
        material: MAGENTA_BANNER
        displayName: '&eEflatun Flama'
      Flama4:
        material: LIGHT_BLUE_BANNER
        displayName: '&eAçık Mavi Flama'
      Flama5:
        material: YELLOW_BANNER
        displayName: '&eSarı Flama'
      Flama6:
        material: LIME_BANNER
        displayName: '&eAçık Yeşil Flama'
      Flama7:
        material: PINK_BANNER
        displayName: '&ePembe Flama'
      Flama8:
        material: GRAY_BANNER
        displayName: '&eGri Flama'
      Flama9:
        material: LIGHT_GRAY_BANNER
        displayName: '&eAçık Gri Flama'
      Flama10:
        material: CYAN_BANNER
        displayName: '&eCamgöbeği Flama'
      Flama11:
        material: PURPLE_BANNER
        displayName: '&eMor Flama'
      Flama12:
        material: BLUE_BANNER
        displayName: '&eMavi Flama'
      Flama13:
        material: BROWN_BANNER
        displayName: '&eKahverengi Flama'
      Flama14:
        material: GREEN_BANNER
        displayName: '&eYeşil Flama'
      Flama15:
        material: RED_BANNER
        displayName: '&eKırmızı Flama'
      Flama16:
        material: BLACK_BANNER
        displayName: '&eSiyah Flama'
      InceCam:
        material: GLASS_PANE
        displayName: '&eCam'
      InceCam1:
        material: WHITE_STAINED_GLASS_PANE
        displayName: '&eBeyaz Ince Cam'
      InceCam2:
        material: ORANGE_STAINED_GLASS_PANE
        displayName: '&eTuruncu Ince Cam'
      InceCam3:
        material: MAGENTA_STAINED_GLASS_PANE
        displayName: '&eEflatun Ince Cam'
      InceCam4:
        material: LIGHT_BLUE_STAINED_GLASS_PANE
        displayName: '&eAçık Mavi Ince Cam'
      InceCam5:
        material: YELLOW_STAINED_GLASS_PANE
        displayName: '&eSarı Ince Cam'
      InceCam6:
        material: LIME_STAINED_GLASS_PANE
        displayName: '&eAçık Yeşil Ince Cam'
      InceCam7:
        material: PINK_STAINED_GLASS_PANE
        displayName: '&ePembe Ince Cam'
      InceCam8:
        material: GRAY_STAINED_GLASS_PANE
        displayName: '&eGri Ince Cam'
      InceCam9:
        material: LIGHT_GRAY_STAINED_GLASS_PANE
        displayName: '&eAçık Gri Ince Cam'
      InceCam10:
        material: CYAN_STAINED_GLASS_PANE
        displayName: '&eCamgöbeği Ince Cam'
      InceCam11:
        material: PURPLE_STAINED_GLASS_PANE
        displayName: '&eMor Ince Cam'
      InceCam12:
        material: BLUE_STAINED_GLASS_PANE
        displayName: '&eMavi Ince Cam'
      InceCam13:
        material: BROWN_STAINED_GLASS_PANE
        displayName: '&eKahverengi Ince Cam'
      InceCam14:
        material: GREEN_STAINED_GLASS_PANE
        displayName: '&eYeşil Ince Cam'
      InceCam15:
        material: RED_STAINED_GLASS_PANE
        displayName: '&eKırmızı Ince Cam'
      InceCam16:
        material: BLACK_STAINED_GLASS_PANE
        displayName: '&eSiyah Ince Cam'
      Halı1:
        material: WHITE_CARPET
        displayName: '&eBeyaz Halı'
      Halı2:
        material: ORANGE_CARPET
        displayName: '&eTuruncu Halı'
      Halı3:
        material: MAGENTA_CARPET
        displayName: '&eEflatun Halı'
      Halı4:
        material: LIGHT_BLUE_CARPET
        displayName: '&eAçık Mavi Halı'
      Halı5:
        material: YELLOW_CARPET
        displayName: '&eSarı Halı'
      Halı6:
        material: LIME_CARPET
        displayName: '&eAçık Yeşil Halı'
      Halı7:
        material: PINK_CARPET
        displayName: '&ePembe Halı'
      Halı8:
        material: GRAY_CARPET
        displayName: '&eGri Halı'
      Halı9:
        material: LIGHT_GRAY_CARPET
        displayName: '&eAçık Gri Halı'
      Halı10:
        material: CYAN_CARPET
        displayName: '&eCamgöbeği Halı'
      Halı11:
        material: PURPLE_CARPET
        displayName: '&eMor Halı'
      Halı12:
        material: BLUE_CARPET
        displayName: '&eMavi Halı'
      Halı13:
        material: BROWN_CARPET
        displayName: '&eKahverengi Halı'
      Halı14:
        material: GREEN_CARPET
        displayName: '&eYeşil Halı'
      Halı15:
        material: RED_CARPET
        displayName: '&eKırmızı Halı'
      Halı16:
        material: BLACK_CARPET
        displayName: '&eSiyah Halı'
  KızılT:
    slot: 14
    displayName: '&6Kızıltaş ve Ulaşım'
    material: REDSTONE
    displayLore:
    - ''
    - ' &8▪ &7Bu kategoride, ihtiyacın'
    - ' &7olan &ekızıltaş ürünlerini'
    - ' &7inceleyebilir ve satın'
    - ' &7alabilirsin.'
    - ''
    - ' &8▸ &aTıkla ve alışverişe başla!'
    items:
      Nota:
        material: NOTE_BLOCK
        displayName: '&eNota Bloğu'
      Piston:
        material: PISTON
        displayName: '&ePiston'
      Lamba:
        material: REDSTONE_LAMP
        displayName: '&eKızıltaş Lambası'
      Sensor:
        material: DAYLIGHT_DETECTOR
        displayName: '&eGüneş Sensörü'
      Kiziltas:
        material: REDSTONE
        displayName: '&eKızıltaş'
      KBlogu:
        material: REDSTONE_BLOCK
        displayName: '&eKızıltaş Bloğu'
      Huni:
        material: HOPPER
        displayName: '&eHuni'
      Yenileyici:
        material: REPEATER
        displayName: '&eKızıltaş Yineleyici'
      Karistirici:
        material: COMPARATOR
        displayName: '&eKızıltaş Karşılaştırıcı'
      MeseKapi:
        material: OAK_DOOR
        displayName: '&eMeşe Kapı'
      DemirKapi:
        material: IRON_DOOR
        displayName: '&eDemir Kapı'
      LadinKapi:
        material: SPRUCE_DOOR
        displayName: '&eLadin Kapı'
      HusKapi:
        material: BIRCH_DOOR
        displayName: '&eHuş Kapı'
      OrmanKapi:
        material: JUNGLE_DOOR
        displayName: '&eOrman Kapı'
      AkasyaKapi:
        material: ACACIA_DOOR
        displayName: '&eAkasya Kapı'
      KoyuMeseKapi:
        material: DARK_OAK_DOOR
        displayName: '&eKoyu Meşe Kapı'
      GucluRay:
        material: POWERED_RAIL
        displayName: '&eGüçlendirilmiş Ray'
      DedektorRay:
        material: DETECTOR_RAIL
        displayName: '&eDedektör Ray'
      AktivatorRay:
        material: ACTIVATOR_RAIL
        displayName: '&eAktivatör Ray'
      Ray:
        material: RAIL
        displayName: '&eRay'
      Vagon:
        material: MINECART
        displayName: '&eMinecart'
      SandikVagon:
        material: CHEST_MINECART
        displayName: '&eSandıklı Vagon'
      HuniVagon:
        material: HOPPER_MINECART
        displayName: '&eHunili Vagon'
      FirinVagon:
        material: FURNACE_MINECART
        displayName: '&eFırınlı Vagon'
      Firlatici:
        material: DISPENSER
        displayName: '&eFırlatıcı'
      Birakici:
        material: DROPPER
        displayName: '&eBırakıcı'
      Gozlemci:
        material: OBSERVER
        displayName: '&eGözlemci'
      Eyer:
        material: SADDLE
        displayName: '&eEyer'
      Tekne:
        material: OAK_BOAT
        displayName: '&eTekne'
      HavucluOlta:
        material: CARROT_ON_A_STICK
        displayName: '&eHavuçlu Olta'
  Iksir:
    slot: 15
    displayName: '&6Iksir'
    material: BREWING_STAND
    displayLore:
    - ''
    - ' &8▪ &7Bu kategoride, ihtiyacın'
    - ' &7olan &eiksirleri &7inceleyebilir'
    - ' &7ve satın alabilirsin.'
    - ''
    - ' &8▸ &aTıkla ve alışverişe başla!'
    items:
      SuSisesi:
        material: POTION
        displayName: '&eSu Şişesi'
      CamSise:
        material: GLASS_BOTTLE
        displayName: '&eCam Şişe'
      GhastGozyasi:
        material: GHAST_TEAR
        displayName: '&eGhast Gözyaşı'
      MayaliGoz:
        material: FERMENTED_SPIDER_EYE
        displayName: '&eMayalı Örümcek Gözü'
      BlazeTozu:
        material: BLAZE_POWDER
        displayName: '&eBlaze Tozu'
      MagmaKremi:
        material: MAGMA_CREAM
        displayName: '&eMagma Kremi'
      ParlayanKarpuz:
        material: GLISTERING_MELON_SLICE
        displayName: '&eParlayan Karpuz'
      AltinHavuc:
        material: GOLDEN_CARROT
        displayName: '&eAltın Havuç'
      TavsanAyagi:
        material: RABBIT_FOOT
        displayName: '&eTavşan Ayağı'
      Barut:
        material: GUNPOWDER
        displayName: '&eBarut'
      IsiktasiTozu:
        material: GLOWSTONE_DUST
        displayName: '&eIşıktaşı Tozu'
      Seker:
        material: SUGAR
        displayName: '&eŞeker'
      BlazeCubugu:
        material: BLAZE_ROD
        displayName: '&eBlaze Çubuğu'
      Netherwart:
        material: NETHER_WART
        displayName: '&eNetherwart'
      SimyaStandi:
        material: BREWING_STAND
        displayName: '&eSimya Standı'
      Kazan:
        material: CAULDRON
        displayName: '&eKazan'
      RejenIksiri:
        material: POTION
        potionType: REGEN
        damage: 1
        displayName: '&eRejenerasyon Iksiri'
      Rejenksiri2:
        material: POTION
        potionType: REGEN
        damage: 2
        displayName: '&eRejenerasyon Iksiri'
      RejenIksiri3:
        material: POTION
        potionType: REGEN
        damage: 3
        displayName: '&eRejenerasyon Iksiri'
      Çeviklik:
        material: POTION
        potionType: SPEED
        damage: 1
        displayName: '&eÇeviklik Iksiri'
      Çeviklik2:
        material: POTION
        potionType: SPEED
        damage: 2
        displayName: '&eÇeviklik Iksiri'
      Çeviklik3:
        material: POTION
        potionType: SPEED
        damage: 3
        displayName: '&eÇeviklik Iksiri'
      AtesDirenci:
        material: POTION
        potionType: FIRE_RESISTANCE
        damage: 1
        displayName: '&eAteş Direnci Iksiri'
      AtesDirenci2:
        material: POTION
        potionType: FIRE_RESISTANCE
        damage: 3
        displayName: '&eAteş Direnci Iksiri'
      ZehirIksiri:
        material: POTION
        potionType: POISON
        damage: 1
        displayName: '&eZehir Iksiri'
      ZehirIksiri2:
        material: POTION
        potionType: POISON
        damage: 2
        displayName: '&eZehir Iksiri'
      ZehirIksiri3:
        material: POTION
        potionType: POISON
        damage: 3
        displayName: '&eZehir Iksiri'
      Iyilestirme:
        material: POTION
        potionType: INSTANT_HEAL
        damage: 1
        displayName: '&eIyileştirme Iksiri'
      Iyilestirme2:
        material: POTION
        potionType: INSTANT_HEAL
        damage: 2
        displayName: '&eIyileştirme Iksiri'
      GeceGorusu:
        material: POTION
        potionType: NIGHT_VISION
        damage: 1
        displayName: '&eGece Görüşü Iksiri'
      GeceGorusu2:
        material: POTION
        potionType: NIGHT_VISION
        damage: 3
        displayName: '&eGece Görüşü Iksiri'
      Zayiflik:
        material: POTION
        potionType: WEAKNESS
        damage: 1
        displayName: '&eZayıflık Iksiri'
      Zayiflik2:
        material: POTION
        potionType: WEAKNESS
        damage: 3
        displayName: '&eZayıflık Iksiri'
      GücIksiri:
        material: POTION
        potionType: STRENGTH
        damage: 1
        displayName: '&eGüç Iksiri'
      GücIksiri2:
        material: POTION
        potionType: STRENGTH
        damage: 2
        displayName: '&eGüç Iksiri'
      GücIksiri3:
        material: POTION
        potionType: STRENGTH
        damage: 3
        displayName: '&eGüç Iksiri'
      Yavaslatma:
        material: POTION
        potionType: SLOWNESS
        damage: 1
        displayName: '&eYavaşlatma Iksiri'
      Yavaslatma2:
        material: POTION
        potionType: SLOWNESS
        damage: 3
        displayName: '&eYavaşlatma Iksiri'
      SicramaIksiri:
        material: POTION
        potionType: JUMP
        damage: 1
        displayName: '&eSıçrama Iksiri'
      SicramaIksiri2:
        material: POTION
        potionType: JUMP
        damage: 2
        displayName: '&eSıçrama Iksiri'
      SicramaIksiri3:
        material: POTION
        potionType: JUMP
        damage: 3
        displayName: '&eSıçrama Iksiri'
      SualtiIksiri:
        material: POTION
        potionType: WATER_BREATHING
        damage: 1
        displayName: '&eSualtı Iksiri'
      SualtiIksiri2:
        material: POTION
        potionType: WATER_BREATHING
        damage: 3
        displayName: '&eSualtı Iksiri'
      PatlayiciRejen:
        material: SPLASH_POTION
        potionType: REGEN
        damage: 1
        displayName: '&ePatlayıcı Rejenerasyon Iksiri'
      PatlayiciRejen2:
        material: SPLASH_POTION
        potionType: REGEN
        damage: 2
        displayName: '&ePatlayıcı Rejenerasyon Iksiri'
      PatlayiciRejen3:
        material: SPLASH_POTION
        potionType: REGEN
        damage: 3
        displayName: '&ePatlayıcı Rejenerasyon Iksiri'
      PatlayiciHız:
        material: SPLASH_POTION
        potionType: SPEED
        damage: 1
        displayName: '&ePatlayıcı Hız Iksiri'
      PatlayiciHız2:
        material: SPLASH_POTION
        potionType: SPEED
        damage: 2
        displayName: '&ePatlayıcı Hız Iksiri'
      PatlayiciHız3:
        material: SPLASH_POTION
        potionType: SPEED
        damage: 3
        displayName: '&ePatlayıcı Hız Iksiri'
      PatlayiciAteş:
        material: SPLASH_POTION
        potionType: FIRE_RESISTANCE
        damage: 1
        displayName: '&ePatlayıcı Ateş Direnci Iksiri'
      PatlayiciAteş2:
        material: SPLASH_POTION
        potionType: FIRE_RESISTANCE
        damage: 3
        displayName: '&ePatlayıcı Ateş Direnci Iksiri'
      PatlayanZehir:
        material: SPLASH_POTION
        potionType: POISON
        damage: 1
        displayName: '&ePatlayıcı Zehir Iksiri'
      PatlayanZehir2:
        material: SPLASH_POTION
        potionType: POISON
        damage: 2
        displayName: '&ePatlayıcı Zehir Iksiri'
      PatlayanZehir3:
        material: SPLASH_POTION
        potionType: POISON
        damage: 3
        displayName: '&ePatlayıcı Zehir Iksiri'
      PatlayanIyile:
        material: SPLASH_POTION
        potionType: INSTANT_HEAL
        damage: 1
        displayName: '&ePatlayıcı Iyileştirme Iksiri'
      PatlayanIyile2:
        material: SPLASH_POTION
        potionType: INSTANT_HEAL
        damage: 2
        displayName: '&ePatlayıcı Iyileştirme Iksiri'
      PatlayanGG:
        material: SPLASH_POTION
        potionType: NIGHT_VISION
        damage: 1
        displayName: '&ePatlayıcı Gece Görüş Iksiri'
      PatlayanGG2:
        material: SPLASH_POTION
        potionType: NIGHT_VISION
        damage: 3
        displayName: '&ePatlayıcı Gece Görüş Iksiri'
      PatlayanZayıf:
        material: SPLASH_POTION
        potionType: WEAKNESS
        damage: 1
        displayName: '&ePatlayıcı Zayıflık Iksiri'
      PatlayanZayıf2:
        material: SPLASH_POTION
        potionType: WEAKNESS
        damage: 3
        displayName: '&ePatlayıcı Zayıflık Iksiri'
      PatlayiciGüç:
        material: SPLASH_POTION
        potionType: STRENGTH
        damage: 1
        displayName: '&ePatlayıcı Güç Iksiri'
      PatlayiciGüç2:
        material: SPLASH_POTION
        potionType: STRENGTH
        damage: 2
        displayName: '&ePatlayıcı Güç Iksiri'
      PatlayiciGüç3:
        material: SPLASH_POTION
        potionType: STRENGTH
        damage: 3
        displayName: '&ePatlayıcı Güç Iksiri'
      PatlayanYavaş:
        material: SPLASH_POTION
        potionType: SLOWNESS
        damage: 1
        displayName: '&ePatlayıcı Yavaşlık Iksiri'
      PatlayanYavaş2:
        material: SPLASH_POTION
        potionType: SLOWNESS
        damage: 3
        displayName: '&ePatlayıcı Yavaşlık Iksiri'
      PatlayanSıçra:
        material: SPLASH_POTION
        potionType: JUMP
        damage: 1
        displayName: '&ePatlayıcı Sıçrama Iksiri'
      PatlayanSıçra2:
        material: SPLASH_POTION
        potionType: JUMP
        damage: 2
        displayName: '&ePatlayıcı Sıçrama Iksiri'
      PatlayanSıçra3:
        material: SPLASH_POTION
        potionType: JUMP
        damage: 3
        displayName: '&ePatlayıcı Sıçrama Iksiri'
      PatlayanZarar:
        material: SPLASH_POTION
        potionType: INSTANT_DAMAGE
        damage: 1
        displayName: '&ePatlayıcı Zarar Iksiri'
      PatlayanZarar2:
        material: SPLASH_POTION
        potionType: INSTANT_DAMAGE
        damage: 2
        displayName: '&ePatlayıcı Zarar Iksiri'
      PatlayanSuAlti:
        material: SPLASH_POTION
        potionType: WATER_BREATHING
        damage: 1
        displayName: '&ePatlayıcı Sualtı Iksiri'
      KaliciRejen:
        material: LINGERING_POTION
        potionType: REGEN
        damage: 1
        displayName: '&eKalıcı Rejenerasyon Iksiri'
      KaliciRejen2:
        material: LINGERING_POTION
        potionType: REGEN
        damage: 2
        displayName: '&eKalıcı Rejenerasyon Iksiri'
      KaliciRejen3:
        material: LINGERING_POTION
        potionType: REGEN
        damage: 3
        displayName: '&eKalıcı Rejenerasyon Iksiri'
      KaliciHız:
        material: LINGERING_POTION
        potionType: SPEED
        damage: 1
        displayName: '&eKalıcı Hız Iksiri'
      KaliciHız2:
        material: LINGERING_POTION
        potionType: SPEED
        damage: 2
        displayName: '&eKalıcı Hız Iksiri'
      KaliciHız3:
        material: LINGERING_POTION
        potionType: SPEED
        damage: 3
        displayName: '&eKalıcı Hız Iksiri'
      KaliciAteş:
        material: LINGERING_POTION
        potionType: FIRE_RESISTANCE
        damage: 1
        displayName: '&eKalıcı Ateş Direnci Iksiri'
      KaliciAteş2:
        material: LINGERING_POTION
        potionType: FIRE_RESISTANCE
        damage: 3
        displayName: '&eKalıcı Ateş Direnci Iksiri'
      KaliciZehir:
        material: LINGERING_POTION
        potionType: POISON
        damage: 1
        displayName: '&eKalıcı Zehir Iksiri'
      KaliciZehir2:
        material: LINGERING_POTION
        potionType: POISON
        damage: 2
        displayName: '&eKalıcı Zehir Iksiri'
      KaliciZehir3:
        material: LINGERING_POTION
        potionType: POISON
        damage: 3
        displayName: '&eKalıcı Zehir Iksiri'
      KaliciIyile:
        material: LINGERING_POTION
        potionType: INSTANT_HEAL
        damage: 1
        displayName: '&eKalıcı Iyileştirme Iksiri'
      KaliciIyile2:
        material: LINGERING_POTION
        potionType: INSTANT_HEAL
        damage: 2
        displayName: '&eKalıcı Iyileştirme Iksiri'
      KaliciGG:
        material: LINGERING_POTION
        potionType: NIGHT_VISION
        damage: 1
        displayName: '&eKalıcı Gece Görüş Iksiri'
      KaliciGG2:
        material: LINGERING_POTION
        potionType: NIGHT_VISION
        damage: 3
        displayName: '&eKalıcı Gece Görüş Iksiri'
      KaliciZayıf:
        material: LINGERING_POTION
        potionType: WEAKNESS
        damage: 1
        displayName: '&eKalıcı Zayıflık Iksiri'
      KaliciZayıf2:
        material: LINGERING_POTION
        potionType: WEAKNESS
        damage: 3
        displayName: '&eKalıcı Zayıflık Iksiri'
      KaliciGüç:
        material: LINGERING_POTION
        potionType: STRENGTH
        damage: 1
        displayName: '&eKalıcı Güç Iksiri'
      KaliciGüç2:
        material: LINGERING_POTION
        potionType: STRENGTH
        damage: 2
        displayName: '&eKalıcı Güç Iksiri'
      KaliciGüç3:
        material: LINGERING_POTION
        potionType: STRENGTH
        damage: 3
        displayName: '&eKalıcı Güç Iksiri'
      KaliciYavaş:
        material: LINGERING_POTION
        potionType: SLOWNESS
        damage: 1
        displayName: '&eKalıcı Yavaşlık Iksiri'
      KaliciYavaş2:
        material: LINGERING_POTION
        potionType: SLOWNESS
        damage: 3
        displayName: '&eKalıcı Yavaşlık Iksiri'
      KaliciSıçra:
        material: LINGERING_POTION
        potionType: JUMP
        damage: 1
        displayName: '&eKalıcı Sıçrama Iksiri'
      KaliciSıçra2:
        material: LINGERING_POTION
        potionType: JUMP
        damage: 2
        displayName: '&eKalıcı Sıçrama Iksiri'
      KaliciSıçra3:
        material: LINGERING_POTION
        potionType: JUMP
        damage: 3
        displayName: '&eKalıcı Sıçrama Iksiri'
      KaliciZarar:
        material: LINGERING_POTION
        potionType: INSTANT_DAMAGE
        damage: 1
        displayName: '&eKalıcı Zarar Iksiri'
      KaliciZarar2:
        material: LINGERING_POTION
        potionType: INSTANT_DAMAGE
        damage: 2
        displayName: '&eKalıcı Zarar Iksiri'
      KaliciSuAlti:
        material: LINGERING_POTION
        potionType: WATER_BREATHING
        damage: 1
        displayName: '&eKalıcı Sualtı Iksiri'
  Malzeme:
    slot: 21
    displayName: '&6Malzemeler'
    material: DIAMOND
    displayLore:
    - ''
    - ' &8▪ &7Bu kategoride, ihtiyacın'
    - ' &7olan &ecevher, boya &7gibi'
    - ' &7ürünleri inceleyebilir ve'
    - ' &7satın alabilirsin.'
    - ''
    - ' &8▸ &aTıkla ve alışverişe başla!'
    items:
      DenizinKalbi:
        material: HEART_OF_THE_SEA
        displayName: '&eDenizin Kalbi'
      Netherit:
        material: NETHERITE_INGOT
        displayName: '&eNetherit Külçesi'
      Zumrut:
        material: EMERALD
        displayName: '&eZümrüt'
      Elmas:
        material: DIAMOND
        displayName: '&eElmas'
      Demir:
        material: IRON_INGOT
        displayName: '&eDemir'
      Altin:
        material: GOLD_INGOT
        displayName: '&eAltın'
      Kömür:
        material: COAL
        displayName: '&eKömür'
      OdunKömürü:
        material: CHARCOAL
        displayName: '&eOdun Kömürü'
      NetherTugla:
        material: NETHER_BRICK
        displayName: '&eNether Tuğlası'
      Çubuk:
        material: STICK
        displayName: '&eÇubuk'
      Kase:
        material: BOWL
        displayName: '&eKase'
      Ip:
        material: STRING
        displayName: '&eIp'
      Tüy:
        material: FEATHER
        displayName: '&eTüy'
      Cakmaktasi:
        material: FLINT
        displayName: '&eÇakmaktaşı'
      Deri:
        material: LEATHER
        displayName: '&eDeri'
      Kilball:
        material: CLAY_BALL
        displayName: '&eKil'
      SekerKamisi:
        material: SUGAR_CANE
        displayName: '&eŞeker Kamışı'
      NetherYil:
        material: NETHER_STAR
        displayName: '&eNether Yıldızı'
      TavsanPostu:
        material: RABBIT_HIDE
        displayName: '&eTavşan Postu'
      Kuvars:
        material: QUARTZ
        displayName: '&eKuvars'
      Murekkep:
        material: BLACK_DYE
        displayName: '&eMürekkep Kesesi'
      GulKirmizi:
        material: RED_DYE
        displayName: '&eGül Kırmızısı'
      KaktusYesil:
        material: GREEN_DYE
        displayName: '&eKaktüs Yeşili'
      Kakao:
        material: BROWN_DYE
        displayName: '&eKakao Çekirdekleri'
      LapisLazuli:
        material: LAPIS_LAZULI
        displayName: '&eLapis Lazuli'
      MorBoya:
        material: PURPLE_DYE
        displayName: '&eMor Boya'
      Camgobegi:
        material: CYAN_DYE
        displayName: '&eCamgöbeği Boya'
      AcikGriBoya:
        material: LIGHT_GRAY_DYE
        displayName: '&eAçık Gri Boya'
      GriBoya:
        material: GRAY_DYE
        displayName: '&eGri Boya'
      PembeBoya:
        material: PINK_DYE
        displayName: '&ePembe Boya'
      KirecBoya:
        material: LIME_DYE
        displayName: '&eKireç Boya'
      Karahindiba:
        material: YELLOW_DYE
        displayName: '&eKarahindiba Sarısı'
      AcikMavi:
        material: LIGHT_BLUE_DYE
        displayName: '&eAçık Mavi Boya'
      EflatunBoya:
        material: MAGENTA_DYE
        displayName: '&eEflatun Boya'
      TuruncuBoya:
        material: ORANGE_DYE
        displayName: '&eTuruncu Boya'
      KemikTozu:
        material: WHITE_DYE
        displayName: '&eKemik Tozu'
  Yemek:
    slot: 22
    displayName: '&6Yemek'
    material: APPLE
    displayLore:
    - ''
    - ' &8▪ &7Bu kategoride, ihtiyacın'
    - ' &7olan &eyemekleri &7inceleyebilir'
    - ' &7ve satın alabilirsin.'
    - ''
    - ' &8▸ &aTıkla ve alışverişe başla!'
    items:
      Pancar:
        material: BEETROOT
        displayName: '&ePancar'
      TatOrMeyvesi:
        material: SWEET_BERRIES
        displayName: '&eTatlı Orman Meyvesi'
      NakMeyvesi:
        material: CHORUS_FRUIT
        displayName: '&eNakarat Meyvesi'
      AltinElma:
        material: GOLDEN_APPLE
        displayName: '&eAltın Elma'
      BuyuluAltinElma:
        material: ENCHANTED_GOLDEN_APPLE
        displayName: '&eBüyülü Altın Elma'
      Elma:
        material: APPLE
        displayName: '&eElma'
      MantarGuvec:
        material: MUSHROOM_STEW
        displayName: '&eMantar Güveç'
      Ekmek:
        material: BREAD
        displayName: '&eEkmek'
      CigDomuzEti:
        material: PORKCHOP
        displayName: '&eÇiğ Domuz Eti'
      DomuzEti:
        material: COOKED_PORKCHOP
        displayName: '&eDomuz Eti'
      CigBalık:
        material: COD
        displayName: '&eÇiğ Balık'
      CigSomonBalık:
        material: SALMON
        displayName: '&eÇiğ Somon Balığı'
      PalyacoBaligi:
        material: TROPICAL_FISH
        displayName: '&ePalyaço Balığı'
      KirpiBaligi:
        material: PUFFERFISH
        displayName: '&eKirpi Balığı'
      PismisBalik:
        material: COOKED_COD
        displayName: '&ePişmiş Balık'
      PismisSomon:
        material: COOKED_SALMON
        displayName: '&ePişmiş Somon Balık'
      Pasta:
        material: CAKE
        displayName: '&ePasta'
      Kurabiye:
        material: COOKIE
        displayName: '&eKurabiye'
      Karpuz:
        material: MELON_SLICE
        displayName: '&eKarpuz'
      CigBiftek:
        material: BEEF
        displayName: '&eÇiğ Biftek'
      Biftek:
        material: COOKED_BEEF
        displayName: '&eBiftek'
      CigTavuk:
        material: CHICKEN
        displayName: '&eÇiğ Tavuk Eti'
      PismisTavuk:
        material: COOKED_CHICKEN
        displayName: '&ePişmiş Tavuk Eti'
      Havuc:
        material: CARROT
        displayName: '&eHavuç'
      Patates:
        material: POTATO
        displayName: '&ePatates'
      PismisPatates:
        material: BAKED_POTATO
        displayName: '&eHaşlanmış Patates'
      BalkabagiTurta:
        material: PUMPKIN_PIE
        displayName: '&eBalkabağı Turtası'
      CigTavsan:
        material: RABBIT
        displayName: '&eÇiğ Tavşan Eti'
      PismisTavsan:
        material: COOKED_RABBIT
        displayName: '&ePişmiş Tavşan Eti'
      TavsanYahnisi:
        material: RABBIT_STEW
        displayName: '&eTavşan Yahnisi'
      CigKoyunEti:
        material: MUTTON
        displayName: '&eÇiğ Koyun Eti'
      KoyunEti:
        material: COOKED_MUTTON
        displayName: '&ePişmiş Koyun Eti'
  Kitap:
    slot: 23
    displayName: '&6Büyülü Kitaplar'
    material: ENCHANTED_BOOK
    displayLore:
    - ''
    - ' &8▪ &7Bu kategoride, ihtiyacın'
    - ' &7olan &ebüyülü kitapları'
    - ' &7inceleyebilir ve satın'
    - ' &7alabilirsin.'
    - ''
    - ' &8▸ &aTıkla ve alışverişe başla!'
    items:
      Tamir:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - MENDING:1
      Koruma1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_ENVIRONMENTAL:1
      Koruma2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_ENVIRONMENTAL:2
      Koruma3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_ENVIRONMENTAL:3
      Koruma4:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_ENVIRONMENTAL:4
      AtesKoruma1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_FIRE:1
      AtesKoruma2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_FIRE:2
      AtesKoruma3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_FIRE:3
      AtesKoruma4:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_FIRE:4
      TuyDususu1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_FALL:1
      TuyDususu2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_FALL:2
      TuyDususu3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_FALL:3
      TuyDususu4:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_FALL:4
      PatlamaKoruma1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_EXPLOSIONS:1
      PatlamaKoruma2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_EXPLOSIONS:2
      PatlamaKoruma3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_EXPLOSIONS:3
      PatlamaKoruma4:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_EXPLOSIONS:4
      HasarKoruma1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_PROJECTILE:1
      HasarKoruma2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_PROJECTILE:2
      HasarKoruma3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_PROJECTILE:3
      HasarKoruma4:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - PROTECTION_PROJECTILE:4
      Solungac1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - OXYGEN:1
      Solungac2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - OXYGEN:2
      Solungac3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - OXYGEN:3
      SuAdaptasyon1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - WATER_WORKER:1
      Dikenler1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - THORNS:1
      Dikenler2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - THORNS:2
      Dikenler3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - THORNS:3
      DerinKosucu1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DEPTH_STRIDER:1
      DerinKosucu2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DEPTH_STRIDER:2
      DerinKosucu3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DEPTH_STRIDER:3
      Keskinlik1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_ALL:1
      Keskinlik2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_ALL:2
      Keskinlik3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_ALL:3
      Keskinlik4:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_ALL:4
      Keskinlik5:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_ALL:5
      Darbe1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_UNDEAD:1
      Darbe2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_UNDEAD:2
      Darbe3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_UNDEAD:3
      Darbe4:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_UNDEAD:4
      Darbe5:
        material: ENCHANTED_BOOK
        ddisplayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_UNDEAD:5
      Eklem1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_ARTHROPODS:1
      Eklem2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_ARTHROPODS:2
      Eklem3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_ARTHROPODS:3
      Eklem4:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_ARTHROPODS:4
      Eklem5:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DAMAGE_ARTHROPODS:5
      Savurma1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - KNOCKBACK:1
      Savurma2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - KNOCKBACK:2
      AlevdenCehre1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - FIRE_ASPECT:1
      AlevdenCehre2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - FIRE_ASPECT:2
      Ganimet1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LOOT_BONUS_MOBS:1
      Ganimet2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LOOT_BONUS_MOBS:2
      Ganimet3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LOOT_BONUS_MOBS:3
      Verimlilik1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DIG_SPEED:1
      Verimlilik2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DIG_SPEED:2
      Verimlilik3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DIG_SPEED:3
      Verimlilik4:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DIG_SPEED:4
      Verimlilik5:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DIG_SPEED:5
      Ipeksi1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - SILK_TOUCH:1
      Kirilmazlik1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DURABILITY:1
      Kirilmazlik2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DURABILITY:2
      Kirilmazlik3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DURABILITY:3
      Kirilmazlik4:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DURABILITY:4
      Kirilmazlik5:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - DURABILITY:5
      Servet1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LOOT_BONUS_BLOCKS:1
      Servet2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LOOT_BONUS_BLOCKS:2
      Servet3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LOOT_BONUS_BLOCKS:3
      Güc1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - ARROW_DAMAGE:1
      Güc2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - ARROW_DAMAGE:2
      Güc3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - ARROW_DAMAGE:3
      Güc4:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - ARROW_DAMAGE:4
      Güc5:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - ARROW_DAMAGE:5
      Yumruk1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - ARROW_KNOCKBACK:1
      Yumruk2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - ARROW_KNOCKBACK:2
      Alev1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - ARROW_FIRE:1
      Sonsuzluk1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - ARROW_INFINITE:1
      DenizSansi1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LUCK:1
      DenizSansi2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LUCK:2
      DenizSansi3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LUCK:3
      Ayartma1:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LURE:1
      Ayartma2:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LURE:2
      Ayartma3:
        material: ENCHANTED_BOOK
        displayName: '&eBüyülü Kitap'
        enchantment:
        - LURE:3
  Diğer:
    slot: 24
    displayName: '&6Diğer'
    material: LAVA_BUCKET
    displayLore:
    - ''
    - ' &8▪ &7Bu kategoride, ihtiyacın'
    - ' &7olan &ekayış, kova, makas &7gibi'
    - ' &7çeşitli ürünleri inceleyebilir'
    - ' &7ve satın alabilirsin.'
    - ''
    - ' &8▸ &aTıkla ve alışverişe başla!'
    items:
      Kalkan:
        material: SHIELD
        displayName: '&eKalkan'
      Mizrak:
        material: TRIDENT
        displayName: '&eÜçlü Mızrak'
      OlTotem:
        material: TOTEM_OF_UNDYING
        displayName: '&eÖlümsüzlük Totemi'
      Elytra:
        material: ELYTRA
        displayName: '&eElytra'
      BuyuMasasi:
        material: ENCHANTING_TABLE
        displayName: '&eBüyü Masası'
      Kova:
        material: BUCKET
        displayName: '&eKova'
      LavKovasi:
        material: LAVA_BUCKET
        displayName: '&eLav Kovası'
      SuKovasi:
        material: WATER_BUCKET
        displayName: '&eSu Kovası'
      SutKovasi:
        material: MILK_BUCKET
        displayName: '&eSüt Kovası'
      EnderIncisi:
        material: ENDER_PEARL
        displayName: '&eEnder Incisi'
      EnderGozu:
        material: ENDER_EYE
        displayName: '&eEnder Gözü'
      DeriAtZirhi:
        material: LEATHER_HORSE_ARMOR
        displayName: '&eDeri At Zırhı'
      DemirAtZirhi:
        material: IRON_HORSE_ARMOR
        displayName: '&eDemir At Zırhı'
      AltinAtZirhi:
        material: GOLDEN_HORSE_ARMOR
        displayName: '&eAltın At Zırhı'
      ElmasAtZirhi:
        material: DIAMOND_HORSE_ARMOR
        displayName: '&eElmas At Zırhı'
      Olta:
        material: FISHING_ROD
        displayName: '&eOlta'
      Saat:
        material: CLOCK
        displayName: '&eSaat'
      Makas:
        material: SHEARS
        displayName: '&eMakas'
      IsimEtiketi:
        material: NAME_TAG
        displayName: '&eIsim Etiketi'
      FNS:
        material: FLINT_AND_STEEL
        displayName: '&eÇakmaktaşı ve Çelik'
      Yay:
        material: BOW
        displayName: '&eYay'
      Ok:
        material: ARROW
        displayName: '&eOk'
      Merdiven:
        material: LADDER
        displayName: '&eMerdiven'
      Mesale:
        material: TORCH
        displayName: '&eMeşale'
      Tabela:
        material: OAK_SIGN
        displayName: '&eTabela'
      EsyaCercevesi:
        material: ITEM_FRAME
        displayName: '&eEşya Çerçevesi'
      BalcikTopu:
        material: SLIME_BALL
        displayName: '&eBalçık Topu'
      WitherKafa:
        material: WITHER_SKELETON_SKULL
        displayName: '&eWither Kafası'
      DrKafa:
        material: DRAGON_HEAD
        displayName: '&eEjderha Kafası'
      Kayis:
        material: LEAD
        displayName: '&eKayış'
confirmation:
  yesItem:
    slot: 11
    material: LIME_WOOL
    name: '&aKabul Et'
    lore:
    - ''
    - ' &8▪ &7İşlemi onayla!'
  noItem:
    slot: 15
    material: RED_WOOL
    name: '&4Reddet'
    lore:
    - ''
    - ' &8▪ &7İşlemi iptal et!'
  fill:
    material: gray_stained_glass_pane
npc:
  id: 0
</details>

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
