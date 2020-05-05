package si.uni_lj.fri.pbd.lab8.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import si.uni_lj.fri.pbd.lab8.R;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
    private ProductListAdapter adapter;

    private TextView productId;
    private EditText productName;
    private EditText productQuantity;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider.AndroidViewModelFactory(getActivity().getApplication()).create(MainViewModel.class);
        productId = getView().findViewById(R.id.productID);
        productName = getView().findViewById(R.id.productName);
        productQuantity = getView().findViewById(R.id.productQuantity);

        listenerSetup();
        observerSetup();
        recyclerSetup();

    }

    private void listenerSetup() {

        Button addButton = getView().findViewById(R.id.addButton);
        Button findButton = getView().findViewById(R.id.findButton);
        Button deleteButton = getView().findViewById(R.id.deleteButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = productName.getText().toString();
                String quantity = productQuantity.getText().toString();

                if (!name.equals("") && !quantity.equals("")) {
                    // TODO: create a new Product with name and quantity,
                    //  insert it in mViewModel and call clearFields()

                } else {
                    productId.setText("Incomplete information");
                }
            }
        });

        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: call mViewModel.findProducts with
                //  the name a user set in productName

            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: call mViewModel.deleteProducts with
                //  the name a user set in productName
                //   then call clearFields()
            }
        });
    }

    private void observerSetup() {

        // TODO: set observer for mViewModel.getAllProducts()



        // TODO: set observer for mViewModel.getSearchResults()


    }

    private void recyclerSetup() {

        RecyclerView recyclerView;

        adapter = new ProductListAdapter(R.layout.product_list_item);
        recyclerView = getView().findViewById(R.id.product_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    private void clearFields() {
        productId.setText("");
        productName.setText("");
        productQuantity.setText("");
    }

}
