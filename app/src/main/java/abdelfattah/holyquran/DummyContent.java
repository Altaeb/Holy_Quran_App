package abdelfattah.holyquran;

import android.app.Application;
import android.content.Context;


import java.util.ArrayList;
import java.util.List;


/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
class DummyContent extends Application {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Album> ITEMS_ALBUMS = new ArrayList<> ();
    public static final List<Sheikh> ITEMS_SHEIKHS = new ArrayList<> ();
    private static final int COUNT = 1;


    static void add(Context context) {


        Sheikh quran = new Sheikh ( context.getString ( R.string.the_holy_quran ), "theholyquran" );
        Sheikh afasy = new Sheikh ( context.getString ( R.string.mishary_al_afasy ), "mishary_al_afasy" );
        Sheikh almaikulai = new Sheikh ( context.getString ( R.string.maher_almaikulai ), "holy_quran" );
        Sheikh sudais = new Sheikh ( context.getString ( R.string.abdulrahman_al_sudais ), "abdulrahman_al_sudais" );
        Sheikh ghamidi = new Sheikh ( context.getString ( R.string.saad_el_ghamidi ), "saad_el_ghamidi" );
        Sheikh yemeni = new Sheikh ( context.getString ( R.string.wadih_al_yemeni ), "wadih_al_yemeni" );
        Sheikh abker = new Sheikh ( context.getString ( R.string.adris_abker ), "adris_abker" );

        // Add some sample items.
        Album quran_full = new Album ( context.getString ( R.string.yasser_al_dosary ), quran, "holy_quran" );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alfatiha ), 227 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.albagarah ), 261 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alimran ), 238 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.annisa ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almaidah ), 263 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alanam ), 170 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alaraf ), 207 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alanfal ), 189 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.altaubah ), 248 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.yunus ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.hud ), 280 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.yusuf ), 221 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.arrad ), 191 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.ibrahim ), 176 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alhijr ), 179 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alnahl ), 247 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alisra ), 227 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alkahf ), 261 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.maryam ), 238 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.taha ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alanbiya ), 263 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alhajj ), 170 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almuminoon ), 207 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.annoor ), 189 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alfurqan ), 248 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.ashuara ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.annaml ), 280 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alqasas ), 221 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alankaboot ), 191 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.arroom ), 176 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.luqman ), 179 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.assajdah ), 247 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alahzab ), 227 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.saba ), 261 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.fatir ), 238 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.yaseen ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.assaaffat ), 263 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.sad ), 170 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.azzumar ), 207 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.ghafir ), 189 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.fussilat ), 248 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.ashura ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.azzukhruf ), 280 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.addukhan ), 221 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.aljathiya ), 191 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alahqaf ), 176 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.muhammad ), 179 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alfatah ), 247 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alhujurat ), 227 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.qaf ), 261 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.adhariyat ), 238 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.attur ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.annajm ), 263 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alqamar ), 170 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alrahman ), 207 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alwaqiah ), 189 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alhadid ), 248 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almujadilah ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alhashar ), 280 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almumtahanah ), 221 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alsaff ), 191 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.aljumuah ), 176 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almunafiqoon ), 179 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.altaghabun ), 247 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.altalaq ), 227 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.altahrim ), 261 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almulk ), 238 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alqalam ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alhaaqqah ), 263 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almaarij ), 170 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.noor ), 207 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.aljinn ), 189 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almuzzammil ), 248 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almudaththir ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alqiyamah ), 280 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alinsan ), 221 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almursalat ), 191 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.annaba ), 176 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alnaziat ), 179 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.abasa ), 247 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.altakwir ), 227 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alinfitar ), 261 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almutaffifin ), 238 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alinshiqaq ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alburooj ), 263 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.altariq ), 170 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alala ), 207 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alghashiya ), 189 ) );
        quran_full.addSurah ( new Surah ( context.getString( R.string.alfajr) , 189 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.albalad ), 248 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.ashams ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.allayl ), 280 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.aldhuha ), 221 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alsharah ), 191 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.attin ), 176 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alalaq ), 179 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.aalqadr ), 247 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.albayyinah ), 227 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.azzalzalah ), 261 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.aladiyat ), 238 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alqariah ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.attakathur ), 263 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alasr ), 170 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alhumazah ), 207 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alfil ), 189 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.quraish ), 248 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almaun ), 237 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alkawthar ), 280 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alkafiroon ), 221 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.annasr ), 191 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.almasad ), 176 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.aliklas ), 179 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.alfalaq ), 247 ) );
        quran_full.addSurah ( new Surah ( context.getString ( R.string.annas ), 227 ) );


        Album saadElGhamidi = new Album ( context.getString ( R.string.saad_el_ghamidi ), ghamidi, "saad_el_ghamidi" );

        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.alfatiha ), 227 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.albagarah ), 261 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.alimran ), 238 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.annisa ), 237 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.almaidah ), 263 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.alanam ), 170 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.alaraf ), 207 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.alanfal ), 189 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.altaubah ), 248 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.yunus ), 237 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.hud ), 280 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.yusuf ), 221 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.arrad ), 191 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.ibrahim ), 176 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.alhijr ), 179 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.alnahl ), 247 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.alisra ), 227 ) );
        saadElGhamidi.addSurah ( new Surah ( context.getString ( R.string.alkahf ), 261 ) );

        Album MisharyAlAfasy = new Album ( context.getString ( R.string.mishary_al_afasy ), afasy, "mishary_al_afasy" );
        MisharyAlAfasy.addSurah ( new Surah ( context.getString ( R.string.alfatiha ), 227 ) );
        MisharyAlAfasy.addSurah ( new Surah ( context.getString ( R.string.albagarah ), 261 ) );
        MisharyAlAfasy.addSurah ( new Surah ( context.getString ( R.string.alimran ), 238 ) );
        MisharyAlAfasy.addSurah ( new Surah ( context.getString ( R.string.annisa ), 237 ) );
        MisharyAlAfasy.addSurah ( new Surah ( context.getString ( R.string.almaidah ), 263 ) );
        MisharyAlAfasy.addSurah ( new Surah ( context.getString ( R.string.alanam ), 170 ) );
        MisharyAlAfasy.addSurah ( new Surah ( context.getString ( R.string.alaraf ), 207 ) );
        MisharyAlAfasy.addSurah ( new Surah ( context.getString ( R.string.alanfal ), 189 ) );
        MisharyAlAfasy.addSurah ( new Surah ( context.getString ( R.string.altaubah ), 248 ) );
        MisharyAlAfasy.addSurah ( new Surah ( context.getString ( R.string.yunus ), 237 ) );
        MisharyAlAfasy.addSurah ( new Surah ( context.getString ( R.string.hud ), 280 ) );

        Album adrisAbker = new Album ( context.getString ( R.string.adris_abker ), abker, "adris_abker" );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.aalqadr ), 247 ) );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.albayyinah ), 227 ) );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.azzalzalah ), 261 ) );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.aladiyat ), 238 ) );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.alqariah ), 237 ) );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.attakathur ), 263 ) );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.alasr ), 170 ) );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.alhumazah ), 207 ) );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.alfil ), 189 ) );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.quraish ), 248 ) );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.almaun ), 237 ) );
        adrisAbker.addSurah ( new Surah ( context.getString ( R.string.alkawthar ), 280 ) );

        Album abdulrahmanAlSudais = new Album ( context.getString ( R.string.abdulrahman_al_sudais )
                , sudais, "abdulrahman_al_sudais" );
        abdulrahmanAlSudais.addSurah ( new Surah ( context.getString ( R.string.almunafiqoon ), 179 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( context.getString ( R.string.altaghabun ), 247 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( context.getString ( R.string.altalaq ), 227 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( context.getString ( R.string.altahrim ), 261 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( context.getString ( R.string.almulk ), 238 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( context.getString ( R.string.alqalam ), 237 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( context.getString ( R.string.alhaaqqah ), 263 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( context.getString ( R.string.almaarij ), 170 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( context.getString ( R.string.noor ), 207 ) );
        abdulrahmanAlSudais.addSurah ( new Surah ( context.getString ( R.string.aljinn ), 189 ) );


        Album maherAlmaikulai = new Album ( context.getString ( R.string.maher_almaikulai ), almaikulai, "quran" );
        maherAlmaikulai.addSurah ( new Surah ( context.getString ( R.string.almaarij ), 170 ) );
        maherAlmaikulai.addSurah ( new Surah ( context.getString ( R.string.noor ), 207 ) );
        maherAlmaikulai.addSurah ( new Surah ( context.getString ( R.string.aljinn ), 189 ) );
        maherAlmaikulai.addSurah ( new Surah ( context.getString ( R.string.almuzzammil ), 248 ) );
        maherAlmaikulai.addSurah ( new Surah ( context.getString ( R.string.almudaththir ), 237 ) );
        maherAlmaikulai.addSurah ( new Surah ( context.getString ( R.string.alqiyamah ), 280 ) );


        Album wadihAlYemeni = new Album ( context.getString ( R.string.wadih_al_yemeni ), yemeni, "wadih_al_yemeni" );
        wadihAlYemeni.addSurah ( new Surah ( context.getString ( R.string.alanfal ), 189 ) );
        wadihAlYemeni.addSurah ( new Surah ( context.getString ( R.string.altaubah ), 248 ) );
        wadihAlYemeni.addSurah ( new Surah ( context.getString ( R.string.yunus ), 237 ) );
        wadihAlYemeni.addSurah ( new Surah ( context.getString ( R.string.hud ), 280 ) );
        wadihAlYemeni.addSurah ( new Surah ( context.getString ( R.string.yusuf ), 221 ) );
        wadihAlYemeni.addSurah ( new Surah ( context.getString ( R.string.arrad ), 191 ) );
        wadihAlYemeni.addSurah ( new Surah ( context.getString ( R.string.ibrahim ), 176 ) );


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