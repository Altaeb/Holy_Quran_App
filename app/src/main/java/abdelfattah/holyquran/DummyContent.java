package abdelfattah.holyquran;

import java.util.ArrayList;
import java.util.List;


/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Album> ITEMS_ALBUMS = new ArrayList<> ();
    public static final List<Sheikh> ITEMS_SHEIKHS = new ArrayList<> ();
    private static final int COUNT = 1;

    static {


        Sheikh quran = new Sheikh ( "The Holy Quran", "theholyquran" );
        Sheikh afasy = new Sheikh ( "Mishary Al-Afasy", "mishary_al_afasy" );
        Sheikh almaikulai = new Sheikh ( "Maher Almaikulai", "holy_quran" );
        Sheikh sudais = new Sheikh ( "Abdulrahman Al-sudais", "abdulrahman_al_sudais" );
        Sheikh ghamidi = new Sheikh ( "Saad El Ghamidi", "saad_el_ghamidi" );
        Sheikh yemeni = new Sheikh ( "Wadih Al Yemeni", "wadih_al_yemeni" );
        Sheikh abker = new Sheikh ( "Adris Abker", "adris_abker" );

        // Add some sample items.
        Album quran_full = new Album ( "Yasser Al Dosary", quran, "holy_quran" );
        quran_full.addSurah ( new Surah ( "Al-Fatihah ( The Opening ) ", 227 ) );
        quran_full.addSurah ( new Surah ( "Al-Baqarah ( The Cow )", 261 ) );
        quran_full.addSurah ( new Surah ( "Al-Imran ( The Family of Imran )", 238 ) );
        quran_full.addSurah ( new Surah ( "An-Nisa ( The Women )", 237 ) );
        quran_full.addSurah ( new Surah ( "Al-Maidah ( The Table spread with Food )", 263 ) );
        quran_full.addSurah ( new Surah ( "Al-An'am ( The Cattle )", 170 ) );
        quran_full.addSurah ( new Surah ( "Al-A'raf (The Heights )", 207 ) );
        quran_full.addSurah ( new Surah ( "Al-Anfal ( The Spoils of War )", 189 ) );
        quran_full.addSurah ( new Surah ( "At-Taubah ( The Repentance )", 248 ) );
        quran_full.addSurah ( new Surah ( "Yunus ( Jonah )", 237 ) );
        quran_full.addSurah ( new Surah ( "Hud ( Hud )", 280 ) );
        quran_full.addSurah ( new Surah ( "Yusuf (Joseph )", 221 ) );
        quran_full.addSurah ( new Surah ( "Ar-Ra'd ( The Thunder )", 191 ) );
        quran_full.addSurah ( new Surah ( "Ibrahim ( Abraham ) ", 176 ) );
        quran_full.addSurah ( new Surah ( "Al-Hijr ( The Rocky Tract )", 179 ) );
        quran_full.addSurah ( new Surah ( "An-Nahl ( The Bees )", 247 ) );
        quran_full.addSurah ( new Surah ( "Al-Isra ( The Night Journey )", 227 ) );
        quran_full.addSurah ( new Surah ( "Al-Kahf ( The Cave )", 261 ) );
        quran_full.addSurah ( new Surah ( "Maryam ( Mary )", 238 ) );
        quran_full.addSurah ( new Surah ( "Taha ( Taha )", 237 ) );
        quran_full.addSurah ( new Surah ( "Al-Anbiya ( The Prophets )", 263 ) );
        quran_full.addSurah ( new Surah ( "Al-Hajj ( The Pilgrimage ) ", 170 ) );
        quran_full.addSurah ( new Surah ( "Al-Mu'minoon ( The Believers )", 207 ) );
        quran_full.addSurah ( new Surah ( "An-Noor ( The Light )", 189 ) );
        quran_full.addSurah ( new Surah ( "Al-Furqan (The Criterion )", 248 ) );
        quran_full.addSurah ( new Surah ( "Ash-Shuara ( The Poets )", 237 ) );
        quran_full.addSurah ( new Surah ( "An-Naml (The Ants )", 280 ) );
        quran_full.addSurah ( new Surah ( "Al-Qasas ( The Stories )", 221 ) );
        quran_full.addSurah ( new Surah ( "Al-Ankaboot ( The Spider ) ", 191 ) );
        quran_full.addSurah ( new Surah ( "Ar-Room ( The Romans )", 176 ) );
        quran_full.addSurah ( new Surah ( "Luqman ( Luqman )", 179 ) );
        quran_full.addSurah ( new Surah ( "As-Sajdah ( The Prostration )", 247 ) );
        quran_full.addSurah ( new Surah ( "Al-Ahzab ( The Confederates )", 227 ) );
        quran_full.addSurah ( new Surah ( "Saba ( Sheba )", 261 ) );
        quran_full.addSurah ( new Surah ( "Fatir ( The Orignator )", 238 ) );
        quran_full.addSurah ( new Surah ( "Ya-seen ( Ya-seen )", 237 ) );
        quran_full.addSurah ( new Surah ( "As-Saaffat ( Those Ranges in Ranks )", 263 ) );
        quran_full.addSurah ( new Surah ( "Sad ( The Letter Sad )", 170 ) );
        quran_full.addSurah ( new Surah ( "Az-Zumar ( The Groups )", 207 ) );
        quran_full.addSurah ( new Surah ( "Ghafir ( The Forgiver )", 189 ) );
        quran_full.addSurah ( new Surah ( "Fussilat ( Explained in Detail )", 248 ) );
        quran_full.addSurah ( new Surah ( "Ash-Shura ( Consultation )", 237 ) );
        quran_full.addSurah ( new Surah ( "Az-Zukhruf ( The Gold Adornment ) ", 280 ) );
        quran_full.addSurah ( new Surah ( "Ad-Dukhan ( The Smoke )", 221 ) );
        quran_full.addSurah ( new Surah ( "Al-Jathiyah ( The Kneeling )", 191 ) );
        quran_full.addSurah ( new Surah ( "Al-Ahqaf ( The Curved Sand-hills )", 176 ) );
        quran_full.addSurah ( new Surah ( "Muhammad ( Muhammad )", 179 ) );
        quran_full.addSurah ( new Surah ( "Al-Fatah ( The Victory )", 247 ) );
        quran_full.addSurah ( new Surah ( "Al-Hujurat ( The Dwellings )", 227 ) );
        quran_full.addSurah ( new Surah ( "Qaf ( The Letter Qaf )", 261 ) );
        quran_full.addSurah ( new Surah ( "Adh-Dhariyat ( The Wind that Scatter ) ", 238 ) );
        quran_full.addSurah ( new Surah ( "At-Tur ( The Mount )", 237 ) );
        quran_full.addSurah ( new Surah ( "An-Najm ( The Star )", 263 ) );
        quran_full.addSurah ( new Surah ( "Al-Qamar ( The Moon )", 170 ) );
        quran_full.addSurah ( new Surah ( "Ar-Rahman ( The Most Graciouse )", 207 ) );
        quran_full.addSurah ( new Surah ( "Al-Waqi'ah ( The Event )", 189 ) );
        quran_full.addSurah ( new Surah ( "Al-Hadid ( The Iron ) ", 248 ) );
        quran_full.addSurah ( new Surah ( "Al-Mujadilah ( She That Disputeth ) ", 237 ) );
        quran_full.addSurah ( new Surah ( "Al-Hashr ( The Gathering ) ", 280 ) );
        quran_full.addSurah ( new Surah ( "Al-Mumtahanah ( The Woman to be examined )", 221 ) );
        quran_full.addSurah ( new Surah ( "As-Saff ( The Row )", 191 ) );
        quran_full.addSurah ( new Surah ( "Al-Jumu'ah ( Friday )", 176 ) );
        quran_full.addSurah ( new Surah ( "Al-Munafiqoon ( The Hypocrites )", 179 ) );
        quran_full.addSurah ( new Surah ( "At-Taghabun ( Mutual Loss & Gain ) ", 247 ) );
        quran_full.addSurah ( new Surah ( "At-Talaq ( The Divorce )", 227 ) );
        quran_full.addSurah ( new Surah ( "At-Tahrim ( The Prohibition )", 261 ) );
        quran_full.addSurah ( new Surah ( "Al-Mulk ( Dominion )", 238 ) );
        quran_full.addSurah ( new Surah ( "Al-Qalam ( The Pen ) ", 237 ) );
        quran_full.addSurah ( new Surah ( "Al-Haaqqah ( The Inevitable )", 263 ) );
        quran_full.addSurah ( new Surah ( "Al-Ma'arij (The Ways of Ascent )", 170 ) );
        quran_full.addSurah ( new Surah ( "Nooh ( Nooh )", 207 ) );
        quran_full.addSurah ( new Surah ( "Al-Jinn ( The Jinn )", 189 ) );
        quran_full.addSurah ( new Surah ( "Al-Muzzammil (The One wrapped in Garments)", 248 ) );
        quran_full.addSurah ( new Surah ( "Al-Muddaththir ( The One Enveloped )", 237 ) );
        quran_full.addSurah ( new Surah ( "Al-Qiyamah ( The Resurrection )", 280 ) );
        quran_full.addSurah ( new Surah ( "Al-Insan ( The human )", 221 ) );
        quran_full.addSurah ( new Surah ( "Al-Mursalat ( Those sent forth ) ", 191 ) );
        quran_full.addSurah ( new Surah ( "An-Naba' ( The Great News )", 176 ) );
        quran_full.addSurah ( new Surah ( "An-Nazi'at ( Those who Pull Out )", 179 ) );
        quran_full.addSurah ( new Surah ( "Abasa ( He Frowned )", 247 ) );
        quran_full.addSurah ( new Surah ( "At-Takwir ( Wound Round & Lost its Light)", 227 ) );
        quran_full.addSurah ( new Surah ( "Al-Infitar ( The Cleaving )", 261 ) );
        quran_full.addSurah ( new Surah ( "Al-Mutaffifin (Those Who Deal in Fraud)", 238 ) );
        quran_full.addSurah ( new Surah ( "Al-Inshiqaq (The Splitting Asunder) ", 237 ) );
        quran_full.addSurah ( new Surah ( "Al-Burooj ( The Big Stars )", 263 ) );
        quran_full.addSurah ( new Surah ( "At-Tariq ( The Night-Comer )", 170 ) );
        quran_full.addSurah ( new Surah ( "Al-A'la ( The Most High )", 207 ) );
        quran_full.addSurah ( new Surah ( "Al-Ghashiya ( The Overwhelming )", 189 ) );
        quran_full.addSurah ( new Surah ( "Al-Balad ( The City )", 248 ) );
        quran_full.addSurah ( new Surah ( "Ash-Shams ( The Sun )", 237 ) );
        quran_full.addSurah ( new Surah ( "Al-Layl ( The Night )", 280 ) );
        quran_full.addSurah ( new Surah ( "Ad-Dhuha ( The Forenoon )", 221 ) );
        quran_full.addSurah ( new Surah ( "As-Sharh ( The Opening Forth)", 191 ) );
        quran_full.addSurah ( new Surah ( "At-Tin ( The Fig )", 176 ) );
        quran_full.addSurah ( new Surah ( "Al-'alaq ( The Clot )", 179 ) );
        quran_full.addSurah ( new Surah ( "AAl-Qadr ( The Night of Decree )", 247 ) );
        quran_full.addSurah ( new Surah ( "Al-Bayyinah ( The Clear Evidence )", 227 ) );
        quran_full.addSurah ( new Surah ( "Az-Zalzalah ( The Earthquake )", 261 ) );
        quran_full.addSurah ( new Surah ( "Al-'adiyat ( Those That Run )", 238 ) );
        quran_full.addSurah ( new Surah ( "Al-Qari'ah ( The Striking Hour )", 237 ) );
        quran_full.addSurah ( new Surah ( "At-Takathur ( The piling Up )", 263 ) );
        quran_full.addSurah ( new Surah ( "Al-Asr ( The Time )", 170 ) );
        quran_full.addSurah ( new Surah ( "Al-Humazah ( The Slanderer )", 207 ) );
        quran_full.addSurah ( new Surah ( "Al-Fil ( The Elephant )", 189 ) );
        quran_full.addSurah ( new Surah ( "Quraish ( Quraish )", 248 ) );
        quran_full.addSurah ( new Surah ( "Al-Ma'un ( Small Kindnesses )", 237 ) );
        quran_full.addSurah ( new Surah ( "Al-Kawthar  ( It is a river in paradisec)", 280 ) );
        quran_full.addSurah ( new Surah ( "Al-Kafiroon ( The Disbelievers )", 221 ) );
        quran_full.addSurah ( new Surah ( "An-Nasr ( The Help ) ", 191 ) );
        quran_full.addSurah ( new Surah ( "Al-Masad ( The Palm Fibre )", 176 ) );
        quran_full.addSurah ( new Surah ( "Al-Ikhlas ( The Sincerity )", 179 ) );
        quran_full.addSurah ( new Surah ( "Al-Falaq ( The Daybreak )", 247 ) );
        quran_full.addSurah ( new Surah ( "An-Nas ( Mankind )", 227 ) );


        Album saadElGhamidi = new Album ( "Saad El Ghamidi", ghamidi, "saad_el_ghamidi" );

        saadElGhamidi.addSurah ( new Surah ( "At-Takwir ( Wound Round & Lost its Light)", 227 ) );
        saadElGhamidi.addSurah ( new Surah ( "Al-Infitar ( The Cleaving )", 261 ) );
        saadElGhamidi.addSurah ( new Surah ( "Al-Mutaffifin (Those Who Deal in Fraud)", 238 ) );
        saadElGhamidi.addSurah ( new Surah ( "Al-Inshiqaq (The Splitting Asunder) ", 237 ) );
        saadElGhamidi.addSurah ( new Surah ( "Al-Burooj ( The Big Stars )", 263 ) );
        saadElGhamidi.addSurah ( new Surah ( "At-Tariq ( The Night-Comer )", 170 ) );
        saadElGhamidi.addSurah ( new Surah ( "Al-A'la ( The Most High )", 207 ) );
        saadElGhamidi.addSurah ( new Surah ( "Al-Ghashiya ( The Overwhelming )", 189 ) );
        saadElGhamidi.addSurah ( new Surah ( "Al-Balad ( The City )", 248 ) );
        saadElGhamidi.addSurah ( new Surah ( "Ash-Shams ( The Sun )", 237 ) );
        saadElGhamidi.addSurah ( new Surah ( "Al-Layl ( The Night )", 280 ) );
        saadElGhamidi.addSurah ( new Surah ( "Ad-Dhuha ( The Forenoon )", 221 ) );
        saadElGhamidi.addSurah ( new Surah ( "As-Sharh ( The Opening Forth)", 191 ) );
        saadElGhamidi.addSurah ( new Surah ( "At-Tin ( The Fig )", 176 ) );
        saadElGhamidi.addSurah ( new Surah ( "Al-'alaq ( The Clot )", 179 ) );
        saadElGhamidi.addSurah ( new Surah ( "AAl-Qadr ( The Night of Decree )", 247 ) );
        saadElGhamidi.addSurah ( new Surah ( "Al-Bayyinah ( The Clear Evidence )", 227 ) );
        saadElGhamidi.addSurah ( new Surah ( "Az-Zalzalah ( The Earthquake )", 261 ) );

        Album MisharyAlAfasy = new Album ( "Mishary Al-Afasy", afasy, "mishary_al_afasy" );
        MisharyAlAfasy.addSurah ( new Surah ( "Al-Fatihah ( The Opening ) ", 227 ) );
        MisharyAlAfasy.addSurah ( new Surah ( "Al-Baqarah ( The Cow )", 261 ) );
        MisharyAlAfasy.addSurah ( new Surah ( "Al-Imran ( The Family of Imran )", 238 ) );
        MisharyAlAfasy.addSurah ( new Surah ( "An-Nisa ( The Women )", 237 ) );
        MisharyAlAfasy.addSurah ( new Surah ( "Al-Maidah ( The Table spread with Food )", 263 ) );
        MisharyAlAfasy.addSurah ( new Surah ( "Al-An'am ( The Cattle )", 170 ) );
        MisharyAlAfasy.addSurah ( new Surah ( "Al-A'raf (The Heights )", 207 ) );
        MisharyAlAfasy.addSurah ( new Surah ( "Al-Anfal ( The Spoils of War )", 189 ) );
        MisharyAlAfasy.addSurah ( new Surah ( "At-Taubah ( The Repentance )", 248 ) );
        MisharyAlAfasy.addSurah ( new Surah ( "Yunus ( Jonah )", 237 ) );
        MisharyAlAfasy.addSurah ( new Surah ( "Hud ( Hud )", 280 ) );

        Album adrisAbker = new Album ( "Adris Abker", abker, "adris_abker" );
        adrisAbker.addSurah ( new Surah ( "Al-Hashr ( The Gathering ) ", 280 ) );
        adrisAbker.addSurah ( new Surah ( "Al-Mumtahanah ( The Woman to be examined )", 221 ) );
        adrisAbker.addSurah ( new Surah ( "As-Saff ( The Row )", 191 ) );
        adrisAbker.addSurah ( new Surah ( "Al-Jumu'ah ( Friday )", 176 ) );
        adrisAbker.addSurah ( new Surah ( "Al-Munafiqoon ( The Hypocrites )", 179 ) );
        adrisAbker.addSurah ( new Surah ( "At-Taghabun ( Mutual Loss & Gain ) ", 247 ) );
        adrisAbker.addSurah ( new Surah ( "At-Talaq ( The Divorce )", 227 ) );
        adrisAbker.addSurah ( new Surah ( "At-Tahrim ( The Prohibition )", 261 ) );
        adrisAbker.addSurah ( new Surah ( "Al-Mulk ( Dominion )", 238 ) );
        adrisAbker.addSurah ( new Surah ( "Al-Qalam ( The Pen ) ", 237 ) );
        adrisAbker.addSurah ( new Surah ( "Al-Haaqqah ( The Inevitable )", 263 ) );
        adrisAbker.addSurah ( new Surah ( "Al-Ma'arij (The Ways of Ascent )", 170 ) );

        Album abdulrahmanAlSudais = new Album ( "Abdulrahman Al-sudais"
                , sudais, "abdulrahman_al_sudais" );
        abdulrahmanAlSudais.addSurah ( new Surah ( "Ash-Shura ( Consultation )", 237 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( "Az-Zukhruf ( The Gold Adornment ) ", 280 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( "Ad-Dukhan ( The Smoke )", 221 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( "Al-Jathiyah ( The Kneeling )", 191 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( "Al-Ahqaf ( The Curved Sand-hills )", 176 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( "Muhammad ( Muhammad )", 179 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( "Al-Fatah ( The Victory )", 247 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( "Al-Hujurat ( The Dwellings )", 227 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( "Qaf ( The Letter Qaf )", 261 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( "Adh-Dhariyat ( The Wind that Scatter ) ", 238 ) );


        Album maherAlmaikulai = new Album ( "Maher Almaikulai", almaikulai, "quran" );
        maherAlmaikulai.addSurah ( new Surah ( "Al-Fatihah ( The Opening ) ", 227 ) );
        maherAlmaikulai.addSurah ( new Surah ( "Al-Baqarah ( The Cow )", 261 ) );
        maherAlmaikulai.addSurah ( new Surah ( "Al-Imran ( The Family of Imran )", 238 ) );
        maherAlmaikulai.addSurah ( new Surah ( "An-Nisa ( The Women )", 237 ) );
        maherAlmaikulai.addSurah ( new Surah ( "Al-Maidah ( The Table spread with Food )", 263 ) );
        maherAlmaikulai.addSurah ( new Surah ( "Al-An'am ( The Cattle )", 170 ) );


        Album wadihAlYemeni = new Album ( "Wadih Al Yemeni", yemeni, "wadih_al_yemeni" );
        wadihAlYemeni.addSurah ( new Surah ( "Ya-seen ( Ya-seen )", 237 ) );
        wadihAlYemeni.addSurah ( new Surah ( "As-Saaffat ( Those Ranges in Ranks )", 263 ) );
        wadihAlYemeni.addSurah ( new Surah ( "Sad ( The Letter Sad )", 170 ) );
        wadihAlYemeni.addSurah ( new Surah ( "Az-Zumar ( The Groups )", 207 ) );
        wadihAlYemeni.addSurah ( new Surah ( "Ghafir ( The Forgiver )", 189 ) );
        wadihAlYemeni.addSurah ( new Surah ( "Fussilat ( Explained in Detail )", 248 ) );
        wadihAlYemeni.addSurah ( new Surah ( "Ash-Shura ( Consultation )", 237 ) );


        abker.addAlbum ( quran_full );
        ghamidi.addAlbum ( saadElGhamidi );
        afasy.addAlbum ( MisharyAlAfasy );
        quran.addAlbum ( adrisAbker );
        sudais.addAlbum ( abdulrahmanAlSudais );
        almaikulai.addAlbum ( maherAlmaikulai );
        yemeni.addAlbum ( wadihAlYemeni );

        for (int i = 1; i <= COUNT; i++) {
            addItem ( quran_full, abker );
            addItem ( saadElGhamidi, ghamidi );
            addItem ( MisharyAlAfasy, afasy );
            addItem ( adrisAbker, quran );
            addItem ( abdulrahmanAlSudais, sudais );
            addItem ( maherAlmaikulai, almaikulai );
            addItem ( wadihAlYemeni, yemeni );
        }
    }

    private static void addItem(Album item, Sheikh sheikh) {
        ITEMS_ALBUMS.add ( item );
        if (sheikh != null) {
            ITEMS_SHEIKHS.add ( sheikh );
        }
    }
}