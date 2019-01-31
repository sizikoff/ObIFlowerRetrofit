/*
 * Copyright (c) 2015-2016 Filippo Engidashet. All Rights Reserved.
 * <p>
 *  Save to the extent permitted by law, you may not use, copy, modify,
 *  distribute or create derivative works of this material or any part
 *  of it without the prior written consent of Filippo Engidashet.
 *  <p>
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 */

package org.dalol.retrofit2_restapidemo.model.callback;

import org.dalol.retrofit2_restapidemo.model.pojo.Flower;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FlowerService {

    @GET("/api/getGoodsListByStoreWithAvailable?store_id=id")
    Call<List<Flower>> getAllFlowers(@Query("store_id") int id);
}
