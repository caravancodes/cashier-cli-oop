package cashier.oop.util;
/*
 * Created by faisalamir on 04/04/22
 * cashier-cli-oop
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 FrogoBox Inc.
 * All rights reserved
 *
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Constant {

    // Setting Apps Variable Constant ----------------------------------------------------------------------------------
    // Bagian ini merupakan variable yang berisi kontanta untuk program dimana tidak akan diubah nilainya saat program dijalankan
    public static final String DEVELOPER_NAME = "PROGRAMMER"; // Constanta Untuk Nama Pengembang Aplikasi
    public static final String STORE_NAME = "AMIRISBACK"; // Constanta Untuk Nama Toko Program
    public static final String APP_NAME = "SMART POS"; // Constanta Untuk Nama Aplikasi

    // Variable Constant ------------------------------------------------------------------------------------------

    // Penjelasan LINE_BORDER : Constanta Untuk Tampilan Border aplikasi, dibuat constanta agar mudah merubah gaya tampilan aplikasi
    public static final String LINE_BORDER = "-------------------------------------------------------";
    public static final String SIMPLE_DATE_FORMAT = "dd/MM/yyyy HH:mm:ss"; // Constant Untuk Format Tanggal Saat ini
    public static final Scanner sc = new Scanner(System.in);

    public static String getDateTimeNow() {
        DateFormat dateFormat = new SimpleDateFormat(SIMPLE_DATE_FORMAT);
        Date date = new Date();
        return dateFormat.format(date);
    }

}
