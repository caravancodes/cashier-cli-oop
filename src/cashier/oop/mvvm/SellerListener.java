package cashier.oop.mvvm;
/*
 * Created by faisalamir on 05/04/22
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

import cashier.oop.model.Penjualan;

public interface SellerListener {

    interface GetDataPenjualan {
        void onShowDataPenjualan(int index, Penjualan penjualan);

        void onEmptyDataPenjualan(String message);
    }

}
