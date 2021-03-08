package com.gsbatra.expensedeck.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gsbatra.expensedeck.R;
import com.gsbatra.expensedeck.view.adapter.TransactionAdapter;

import java.util.ArrayList;
import java.util.List;

public class Income extends Fragment {
    List<TransactionAdapter.Transaction> transactions;

    public Income(){
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        transactions = new ArrayList<>();
        transactions.add(new TransactionAdapter.Transaction("Sold Stocks", "Investing", "+$15"));
        transactions.add(new TransactionAdapter.Transaction("Sold Stocks", "Investing", "+$15"));
        transactions.add(new TransactionAdapter.Transaction("Sold Stocks", "Investing", "+$15"));
        transactions.add(new TransactionAdapter.Transaction("Sold Stocks", "Investing", "+$15"));
        transactions.add(new TransactionAdapter.Transaction("Sold Stocks", "Investing", "+$15"));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.income_fragment, container, false);

        // set up the RecyclerView
        RecyclerView recyclerView = view.findViewById(R.id.income_transactions_rv);
        TransactionAdapter adapter = new TransactionAdapter(transactions);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(llm);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(adapter);
        return view;
    }
}