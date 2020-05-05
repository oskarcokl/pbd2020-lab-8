package si.uni_lj.fri.pbd.lab8;

import android.app.Application;
import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Database;

public class ProductRepository {

    private MutableLiveData<List<Product>> searchResults =
            new MutableLiveData<>();
    private LiveData<List<Product>> allProducts;

    // TODO: Add DAO reference

    // TODO: Add a constructor

    public void insertProduct(final Product newproduct) {
        // TODO: run query to insert a product on the executor

    }


    public void deleteProduct(final String name) {
        // TODO: run query to delete a product on the executor
    }

    public void findProduct(final String name) {

        // TODO: run query on the executor, postValue to searchResults
    }

    public LiveData<List<Product>> getAllProducts() {
        return allProducts;
    }

    public MutableLiveData<List<Product>> getSearchResults() {
        return searchResults;
    }

}
